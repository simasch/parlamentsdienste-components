package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when pd-modal backdrop is clicked.
 */
@DomEvent("pd-backdrop")
public class PdBackdropClickEvent<T extends Component> extends ComponentEvent<T> {

    public PdBackdropClickEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
