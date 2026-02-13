package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when a pd-* component loses focus.
 */
@DomEvent("pd-blur")
public class PdBlurEvent<T extends Component> extends ComponentEvent<T> {

    public PdBlurEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
