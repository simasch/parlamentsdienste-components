package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when pd-list-item-expandable content area is clicked.
 */
@DomEvent("pd-content-click")
public class PdContentClickEvent<T extends Component> extends ComponentEvent<T> {

    public PdContentClickEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
