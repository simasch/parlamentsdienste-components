package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event fired when a pd-chip remove button is clicked (toggle type).
 */
@DomEvent("pd-remove-chip")
public class PdRemoveChipEvent<T extends Component> extends ComponentEvent<T> {

    public PdRemoveChipEvent(T source, boolean fromClient) {
        super(source, fromClient);
    }
}
