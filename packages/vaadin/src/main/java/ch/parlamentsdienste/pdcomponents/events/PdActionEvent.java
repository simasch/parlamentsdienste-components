package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when an action button is clicked (pd-alert).
 */
@DomEvent("pd-action")
public class PdActionEvent<T extends Component> extends ComponentEvent<T> {

    public PdActionEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
