package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdFormField;
import ch.parlamentsdienste.pdcomponents.events.PdCheckedEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Checkbox component with Binder integration.
 * Syncs {@code checked} property via {@code pd-checked} event.
 */
@Tag("pd-checkbox")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-checkbox.js")
public class PdCheckbox extends AbstractPdFormField<PdCheckbox, Boolean> {

    public PdCheckbox() {
        super("checked", false, false);
        getElement().addPropertyChangeListener("checked", "pd-checked", e -> {});
    }

    public PdCheckbox(String text) {
        this();
        setText(text);
    }

    public void setText(String text) {
        setStringProperty("text", text);
    }

    public String getText() {
        return getStringProperty("text");
    }

    public void setIndeterminate(boolean indeterminate) {
        setBooleanProperty("isIndeterminate", indeterminate);
    }

    public boolean isIndeterminate() {
        return getBooleanProperty("isIndeterminate");
    }

    // --- Events ---

    public Registration addCheckedListener(ComponentEventListener<PdCheckedEvent<PdCheckbox>> listener) {
        return addListener(PdCheckedEvent.class, (ComponentEventListener) listener);
    }
}
