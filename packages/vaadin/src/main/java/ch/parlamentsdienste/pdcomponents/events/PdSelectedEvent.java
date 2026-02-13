package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired when a pd-table row is selected/deselected or pd-list-item-expandable checkbox changes.
 */
@DomEvent("pd-selected")
public class PdSelectedEvent<T extends Component> extends ComponentEvent<T> {

    private final String detail;

    public PdSelectedEvent(T source, boolean fromClient,
                           @EventData("JSON.stringify(event.detail)") String detail) {
        super(source, fromClient);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
