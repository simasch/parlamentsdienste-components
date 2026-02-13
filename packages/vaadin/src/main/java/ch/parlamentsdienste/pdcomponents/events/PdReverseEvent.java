package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired when pd-sort reverse item is clicked.
 */
@DomEvent("pd-reverse")
public class PdReverseEvent<T extends Component> extends ComponentEvent<T> {

    private final String detail;

    public PdReverseEvent(T source, boolean fromClient,
                          @EventData("JSON.stringify(event.detail)") String detail) {
        super(source, fromClient);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
