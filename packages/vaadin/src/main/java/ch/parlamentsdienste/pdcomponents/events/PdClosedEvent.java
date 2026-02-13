package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when a pd-* component is closed (modal, alert, toast).
 */
@DomEvent("pd-closed")
public class PdClosedEvent<T extends Component> extends ComponentEvent<T> {

    public PdClosedEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
