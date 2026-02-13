package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when a pd-* component gains focus.
 */
@DomEvent("pd-focus")
public class PdFocusEvent<T extends Component> extends ComponentEvent<T> {

    public PdFocusEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
