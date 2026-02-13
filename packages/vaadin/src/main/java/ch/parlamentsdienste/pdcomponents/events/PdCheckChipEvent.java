package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when a pd-chip is checked (filter type).
 */
@DomEvent("pd-check-chip")
public class PdCheckChipEvent<T extends Component> extends ComponentEvent<T> {

    public PdCheckChipEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
