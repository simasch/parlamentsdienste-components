package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdBlurEvent;
import ch.parlamentsdienste.pdcomponents.events.PdChangeEvent;
import ch.parlamentsdienste.pdcomponents.events.PdFocusEvent;
import ch.parlamentsdienste.pdcomponents.events.PdInputEvent;
import ch.parlamentsdienste.pdcomponents.types.DropdownItem;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasLabel;
import com.vaadin.flow.component.HasValidation;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

import java.util.List;

/**
 * Combobox component with search filtering and multiselect support.
 * Uses JSON property synchronization for complex object values.
 */
@Tag("pd-combobox")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-combobox.js")
public class PdCombobox extends AbstractPdComponent implements HasLabel, HasValidation {

    private String errorMessage;
    private boolean invalid;

    public PdCombobox() {
        getElement().addPropertyChangeListener("selected", "pd-change", e -> {});
    }

    // --- Items ---

    public void setItems(List<DropdownItem> items) {
        setJsonListProperty("items", items, DropdownItem::toJson);
    }

    public void setSelected(DropdownItem item) {
        if (item != null) {
            setJsonProperty("selected", item.toJson());
        } else {
            getElement().removeProperty("selected");
        }
    }

    // --- Properties ---

    public void setPlaceholder(String placeholder) {
        setStringProperty("placeholder", placeholder);
    }

    public String getPlaceholder() {
        return getStringProperty("placeholder");
    }

    public void setItemCount(int itemCount) {
        setIntProperty("itemCount", itemCount);
    }

    public int getItemCount() {
        return getIntProperty("itemCount", 7);
    }

    public void setEmptyItem(boolean emptyItem) {
        setBooleanProperty("emptyItem", emptyItem);
    }

    public boolean isEmptyItem() {
        return getBooleanProperty("emptyItem");
    }

    public void setDisabled(boolean disabled) {
        setBooleanProperty("disabled", disabled);
    }

    public boolean isDisabled() {
        return getBooleanProperty("disabled");
    }

    public void setViewOnly(boolean viewOnly) {
        setBooleanProperty("viewOnly", viewOnly);
    }

    public boolean isViewOnly() {
        return getBooleanProperty("viewOnly");
    }

    public void setReadonly(boolean readonly) {
        setBooleanProperty("readonly", readonly);
    }

    public boolean isReadonly() {
        return getBooleanProperty("readonly");
    }

    public void setRequired(boolean required) {
        setBooleanProperty("required", required);
    }

    public boolean isRequired() {
        return getBooleanProperty("required");
    }

    public void setMultiselect(boolean multiselect) {
        setBooleanProperty("multiselect", multiselect);
    }

    public boolean isMultiselect() {
        return getBooleanProperty("multiselect");
    }

    public void setDisableMultiselectCounter(boolean disable) {
        setBooleanProperty("disableMultiselectCounter", disable);
    }

    public boolean isDisableMultiselectCounter() {
        return getBooleanProperty("disableMultiselectCounter");
    }

    public void setSelectable(boolean selectable) {
        setBooleanProperty("selectable", selectable);
    }

    public boolean isSelectable() {
        return getBooleanProperty("selectable", true);
    }

    public void setHighlight(boolean highlight) {
        setBooleanProperty("highlight", highlight);
    }

    public boolean isHighlight() {
        return getBooleanProperty("highlight", true);
    }

    public void setSize(String size) {
        setStringProperty("size", size);
    }

    public String getSize() {
        return getStringProperty("size");
    }

    public void setVerticalAdjust(boolean verticalAdjust) {
        setBooleanProperty("verticalAdjust", verticalAdjust);
    }

    public boolean isVerticalAdjust() {
        return getBooleanProperty("verticalAdjust");
    }

    public void setDisableFilter(boolean disableFilter) {
        setBooleanProperty("disableFilter", disableFilter);
    }

    public boolean isDisableFilter() {
        return getBooleanProperty("disableFilter");
    }

    /**
     * Set a preselected entry by index.
     */
    public void setSelectedIndex(int index) {
        getElement().callJsFunction("setSelectedIndex", index);
    }

    /**
     * Reset the selection.
     */
    public void reset() {
        getElement().callJsFunction("reset");
    }

    /**
     * Open the combobox dropdown.
     */
    public void setOpen(boolean open) {
        getElement().callJsFunction("setOpen", open);
    }

    /**
     * Focus the combobox input.
     */
    public void setFocus() {
        getElement().callJsFunction("setFocus");
    }

    // --- HasValidation ---

    @Override
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        getElement().setProperty("error", errorMessage != null ? errorMessage : "");
    }

    @Override
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override
    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
        if (invalid && errorMessage != null) {
            getElement().setProperty("error", errorMessage);
        } else if (!invalid) {
            getElement().setProperty("error", "");
        }
    }

    @Override
    public boolean isInvalid() {
        return this.invalid;
    }

    // --- Events ---

    public Registration addInputListener(ComponentEventListener<PdInputEvent<PdCombobox>> listener) {
        return addListener(PdInputEvent.class, (ComponentEventListener) listener);
    }

    public Registration addChangeListener(ComponentEventListener<PdChangeEvent<PdCombobox>> listener) {
        return addListener(PdChangeEvent.class, (ComponentEventListener) listener);
    }

    public Registration addBlurListener(ComponentEventListener<PdBlurEvent<PdCombobox>> listener) {
        return addListener(PdBlurEvent.class, (ComponentEventListener) listener);
    }

    public Registration addFocusListener(ComponentEventListener<PdFocusEvent<PdCombobox>> listener) {
        return addListener(PdFocusEvent.class, (ComponentEventListener) listener);
    }
}
