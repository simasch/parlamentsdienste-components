package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdChangeEvent;
import ch.parlamentsdienste.pdcomponents.events.PdReverseEvent;
import ch.parlamentsdienste.pdcomponents.types.SortDropdownItem;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

import java.util.List;

/**
 * Sort dropdown component.
 */
@Tag("pd-sort")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-sort.js")
public class PdSort extends AbstractPdComponent {

    public void setItems(List<SortDropdownItem> items) {
        setJsonListProperty("items", items, SortDropdownItem::toJson);
    }

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

    public void setReverseItem(boolean reverseItem) {
        setBooleanProperty("reverseItem", reverseItem);
    }

    public boolean isReverseItem() {
        return getBooleanProperty("reverseItem");
    }

    public void setDisabled(boolean disabled) {
        setBooleanProperty("disabled", disabled);
    }

    public boolean isDisabled() {
        return getBooleanProperty("disabled");
    }

    public void setLabel(String label) {
        setStringProperty("label", label);
    }

    public String getLabel() {
        return getStringProperty("label", "Sortieren nach:");
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

    // --- Events ---

    public Registration addChangeListener(ComponentEventListener<PdChangeEvent<PdSort>> listener) {
        return addListener(PdChangeEvent.class, (ComponentEventListener) listener);
    }

    public Registration addReverseListener(ComponentEventListener<PdReverseEvent<PdSort>> listener) {
        return addListener(PdReverseEvent.class, (ComponentEventListener) listener);
    }
}
