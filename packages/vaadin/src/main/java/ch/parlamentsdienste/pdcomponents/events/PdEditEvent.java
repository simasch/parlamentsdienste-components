package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired when pd-table edit icon or pd-list-item-expandable edit button is clicked.
 */
@DomEvent("pd-edit")
public class PdEditEvent<T extends Component> extends ComponentEvent<T> {

    private final String detail;

    public PdEditEvent(T source, boolean fromClient,
                       @EventData("JSON.stringify(event.detail)") String detail) {
        super(source, fromClient);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
