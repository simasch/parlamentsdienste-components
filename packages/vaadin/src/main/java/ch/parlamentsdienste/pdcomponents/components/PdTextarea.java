package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdFormField;
import ch.parlamentsdienste.pdcomponents.events.PdBlurEvent;
import ch.parlamentsdienste.pdcomponents.events.PdChangeEvent;
import ch.parlamentsdienste.pdcomponents.events.PdFocusEvent;
import ch.parlamentsdienste.pdcomponents.events.PdInputEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Textarea component with Binder integration.
 * Syncs {@code value} property via {@code pd-change} event.
 */
@Tag("pd-textarea")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-textarea.js")
public class PdTextarea extends AbstractPdFormField<PdTextarea, String> {

    public PdTextarea() {
        super("value", "", false);
        getElement().addPropertyChangeListener("value", "pd-change", e -> {});
    }

    public void setPlaceholder(String placeholder) {
        setStringProperty("placeholder", placeholder);
    }

    public String getPlaceholder() {
        return getStringProperty("placeholder");
    }

    public void setRows(int rows) {
        setIntProperty("rows", rows);
    }

    public int getRows() {
        return getIntProperty("rows");
    }

    public void setMaxlength(int maxlength) {
        setIntProperty("maxlength", maxlength);
    }

    public int getMaxlength() {
        return getIntProperty("maxlength");
    }

    public void setAutogrow(boolean autogrow) {
        setBooleanProperty("autogrow", autogrow);
    }

    public boolean isAutogrow() {
        return getBooleanProperty("autogrow");
    }

    public void setShowCharacterCount(boolean show) {
        setBooleanProperty("showCharacterCount", show);
    }

    public boolean isShowCharacterCount() {
        return getBooleanProperty("showCharacterCount");
    }

    public void setCharacterCountText(String text) {
        setStringProperty("characterCountText", text);
    }

    public String getCharacterCountText() {
        return getStringProperty("characterCountText");
    }

    /**
     * Focus the textarea element.
     */
    public void setFocus() {
        getElement().callJsFunction("setFocus");
    }

    // --- Events ---

    public Registration addInputListener(ComponentEventListener<PdInputEvent<PdTextarea>> listener) {
        return addListener(PdInputEvent.class, (ComponentEventListener) listener);
    }

    public Registration addChangeListener(ComponentEventListener<PdChangeEvent<PdTextarea>> listener) {
        return addListener(PdChangeEvent.class, (ComponentEventListener) listener);
    }

    public Registration addBlurListener(ComponentEventListener<PdBlurEvent<PdTextarea>> listener) {
        return addListener(PdBlurEvent.class, (ComponentEventListener) listener);
    }

    public Registration addFocusListener(ComponentEventListener<PdFocusEvent<PdTextarea>> listener) {
        return addListener(PdFocusEvent.class, (ComponentEventListener) listener);
    }
}
