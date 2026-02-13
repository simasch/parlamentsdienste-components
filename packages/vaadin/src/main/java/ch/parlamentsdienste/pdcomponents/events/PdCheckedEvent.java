package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired when a pd-checkbox checked state changes.
 */
@DomEvent("pd-checked")
public class PdCheckedEvent<T extends Component> extends ComponentEvent<T> {

    private final boolean checked;

    public PdCheckedEvent(T source, boolean fromClient,
                          @EventData("event.detail") boolean checked) {
        super(source, fromClient);
        this.checked = checked;
    }

    public boolean isChecked() {
        return checked;
    }
}
