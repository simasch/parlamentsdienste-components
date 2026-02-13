package ch.parlamentsdienste.pdcomponents.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * Event fired when pd-panel-header is hovered.
 */
@DomEvent("pd-hover")
public class PdHoverEvent<T extends Component> extends ComponentEvent<T> {

    private final boolean hover;

    public PdHoverEvent(T source, boolean fromClient,
                        @EventData("event.detail") boolean hover) {
        super(source, fromClient);
        this.hover = hover;
    }

    public boolean isHover() {
        return hover;
    }
}
