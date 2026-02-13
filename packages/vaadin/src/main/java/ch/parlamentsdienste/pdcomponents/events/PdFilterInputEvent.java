package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired when pd-table filter input value changes.
 */
@DomEvent("pd-filter-input")
public class PdFilterInputEvent<T extends Component> extends ComponentEvent<T> {

    private final String detail;

    public PdFilterInputEvent(T source, boolean fromClient,
                              @EventData("event.detail") String detail) {
        super(source, fromClient);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
