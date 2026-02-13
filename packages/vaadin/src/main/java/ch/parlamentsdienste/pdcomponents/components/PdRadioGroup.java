package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdFormField;
import ch.parlamentsdienste.pdcomponents.events.PdChangeEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Radio group container with Binder integration.
 * Syncs {@code value} property via {@code pd-change} event.
 * Add PdRadio children to populate options.
 */
@Tag("pd-radio-group")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-radio-group.js")
public class PdRadioGroup extends AbstractPdFormField<PdRadioGroup, String> implements HasComponents {

    public PdRadioGroup() {
        super("value", "", false);
        getElement().addPropertyChangeListener("value", "pd-change", e -> {});
    }

    /**
     * Adds a radio option to this group.
     */
    public void addRadio(String label, String value) {
        add(new PdRadio(label, value));
    }

    // --- Events ---

    public Registration addChangeListener(ComponentEventListener<PdChangeEvent<PdRadioGroup>> listener) {
        return addListener(PdChangeEvent.class, (ComponentEventListener) listener);
    }
}
