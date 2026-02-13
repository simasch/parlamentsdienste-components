package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when pd-backdrop is tapped/clicked.
 */
@DomEvent("pd-tap")
public class PdTapEvent<T extends Component> extends ComponentEvent<T> {

    public PdTapEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
