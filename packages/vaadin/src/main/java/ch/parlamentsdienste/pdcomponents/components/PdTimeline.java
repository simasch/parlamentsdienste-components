package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Timeline container component.
 */
@Tag("pd-timeline")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-timeline.js")
public class PdTimeline extends AbstractPdComponent implements HasComponents {

    public void setStart(boolean start) {
        setBooleanProperty("start", start);
    }

    public boolean isStart() {
        return getBooleanProperty("start");
    }

    public void setEnd(boolean end) {
        setBooleanProperty("end", end);
    }

    public boolean isEnd() {
        return getBooleanProperty("end");
    }
}
