package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired on pd-input, pd-textarea, pd-combobox, pd-search, pd-slider input.
 */
@DomEvent("pd-input")
public class PdInputEvent<T extends Component> extends ComponentEvent<T> {

    private final String detail;

    public PdInputEvent(T source, boolean fromClient,
                        @EventData("JSON.stringify(event.detail)") String detail) {
        super(source, fromClient);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
