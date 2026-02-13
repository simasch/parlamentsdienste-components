package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdCheckChipEvent;
import ch.parlamentsdienste.pdcomponents.events.PdRemoveChipEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Chip component with text, toggle, and filter types.
 */
@Tag("pd-chip")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-chip.js")
public class PdChip extends AbstractPdComponent implements HasComponents {

    /**
     * Chip type: text, toggle, filter.
     */
    public void setType(String type) {
        setStringProperty("type", type);
    }

    public String getType() {
        return getStringProperty("type", "text");
    }

    public void setChecked(boolean checked) {
        setBooleanProperty("checked", checked);
    }

    public boolean isChecked() {
        return getBooleanProperty("checked");
    }

    public void setDisabled(boolean disabled) {
        setBooleanProperty("disabled", disabled);
    }

    public boolean isDisabled() {
        return getBooleanProperty("disabled");
    }

    public void setReadonly(boolean readonly) {
        setBooleanProperty("readonly", readonly);
    }

    public boolean isReadonly() {
        return getBooleanProperty("readonly");
    }

    public Registration addRemoveChipListener(ComponentEventListener<PdRemoveChipEvent<PdChip>> listener) {
        return addListener(PdRemoveChipEvent.class, (ComponentEventListener) listener);
    }

    public Registration addCheckChipListener(ComponentEventListener<PdCheckChipEvent<PdChip>> listener) {
        return addListener(PdCheckChipEvent.class, (ComponentEventListener) listener);
    }
}
