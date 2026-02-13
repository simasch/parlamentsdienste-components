package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired when a pd-* component collapsed state changes.
 */
@DomEvent("pd-collapsed")
public class PdCollapsedEvent<T extends Component> extends ComponentEvent<T> {

    private final String detail;

    public PdCollapsedEvent(T source, boolean fromClient,
                            @EventData("JSON.stringify(event.detail)") String detail) {
        super(source, fromClient);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
