package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired when pd-table filter value is confirmed.
 */
@DomEvent("pd-filter-change")
public class PdFilterChangeEvent<T extends Component> extends ComponentEvent<T> {

    private final String detail;

    public PdFilterChangeEvent(T source, boolean fromClient,
                               @EventData("JSON.stringify(event.detail)") String detail) {
        super(source, fromClient);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
