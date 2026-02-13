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
 * Text input component with Binder integration.
 * Syncs {@code value} property via {@code pd-change} event.
 */
@Tag("pd-input")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-input.js")
public class PdInput extends AbstractPdFormField<PdInput, String> {

    public PdInput() {
        super("value", "", false);
        getElement().addPropertyChangeListener("value", "pd-change", e -> {});
    }

    // --- Properties ---

    public void setPlaceholder(String placeholder) {
        setStringProperty("placeholder", placeholder);
    }

    public String getPlaceholder() {
        return getStringProperty("placeholder");
    }

    /**
     * Input type: text, email, number, password, search, tel, url, date, time.
     */
    public void setType(String type) {
        setStringProperty("type", type);
    }

    public String getType() {
        return getStringProperty("type", "text");
    }

    public void setAutocomplete(String autocomplete) {
        setStringProperty("autocomplete", autocomplete);
    }

    public String getAutocomplete() {
        return getStringProperty("autocomplete");
    }

    public void setAutofocus(boolean autofocus) {
        setBooleanProperty("autofocus", autofocus);
    }

    public boolean isAutofocus() {
        return getBooleanProperty("autofocus");
    }

    public void setClearInput(boolean clearInput) {
        setBooleanProperty("clearInput", clearInput);
    }

    public boolean isClearInput() {
        return getBooleanProperty("clearInput");
    }

    public void setMax(String max) {
        setStringProperty("max", max);
    }

    public String getMax() {
        return getStringProperty("max");
    }

    public void setMaxlength(int maxlength) {
        setIntProperty("maxlength", maxlength);
    }

    public int getMaxlength() {
        return getIntProperty("maxlength");
    }

    public void setMin(String min) {
        setStringProperty("min", min);
    }

    public String getMin() {
        return getStringProperty("min");
    }

    public void setMinlength(int minlength) {
        setIntProperty("minlength", minlength);
    }

    public int getMinlength() {
        return getIntProperty("minlength");
    }

    public void setPattern(String pattern) {
        setStringProperty("pattern", pattern);
    }

    public String getPattern() {
        return getStringProperty("pattern");
    }

    public void setStep(String step) {
        setStringProperty("step", step);
    }

    public String getStep() {
        return getStringProperty("step");
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
     * Focus the input element.
     */
    public void setFocus() {
        getElement().callJsFunction("setFocus");
    }

    // --- Events ---

    public Registration addInputListener(ComponentEventListener<PdInputEvent<PdInput>> listener) {
        return addListener(PdInputEvent.class, (ComponentEventListener) listener);
    }

    public Registration addChangeListener(ComponentEventListener<PdChangeEvent<PdInput>> listener) {
        return addListener(PdChangeEvent.class, (ComponentEventListener) listener);
    }

    public Registration addBlurListener(ComponentEventListener<PdBlurEvent<PdInput>> listener) {
        return addListener(PdBlurEvent.class, (ComponentEventListener) listener);
    }

    public Registration addFocusListener(ComponentEventListener<PdFocusEvent<PdInput>> listener) {
        return addListener(PdFocusEvent.class, (ComponentEventListener) listener);
    }
}
