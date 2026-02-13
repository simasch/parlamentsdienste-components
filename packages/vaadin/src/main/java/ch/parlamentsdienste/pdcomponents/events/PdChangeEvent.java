package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired when a pd-* component value changes.
 * The detail type varies by component (string, number, object).
 */
@DomEvent("pd-change")
public class PdChangeEvent<T extends Component> extends ComponentEvent<T> {

    private final String detail;

    public PdChangeEvent(T source, boolean fromClient,
                         @EventData("JSON.stringify(event.detail)") String detail) {
        super(source, fromClient);
        this.detail = detail;
    }

    /**
     * Returns the raw JSON string of the event detail.
     */
    public String getDetail() {
        return detail;
    }
}
