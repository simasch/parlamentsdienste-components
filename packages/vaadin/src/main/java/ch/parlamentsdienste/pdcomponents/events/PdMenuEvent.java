package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when pd-navbar menu button is clicked.
 */
@DomEvent("pd-menu")
public class PdMenuEvent<T extends Component> extends ComponentEvent<T> {

    public PdMenuEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
