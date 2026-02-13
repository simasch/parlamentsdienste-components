package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when pd-list-item-expandable expand button is clicked.
 */
@DomEvent("pd-expand")
public class PdExpandEvent<T extends Component> extends ComponentEvent<T> {

    public PdExpandEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
