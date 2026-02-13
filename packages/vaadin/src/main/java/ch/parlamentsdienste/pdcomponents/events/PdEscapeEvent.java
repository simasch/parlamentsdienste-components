package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when escape key is pressed in pd-modal.
 */
@DomEvent("pd-escape")
public class PdEscapeEvent<T extends Component> extends ComponentEvent<T> {

    public PdEscapeEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
