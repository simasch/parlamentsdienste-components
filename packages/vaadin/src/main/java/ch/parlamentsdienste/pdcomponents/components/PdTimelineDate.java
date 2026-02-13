package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Timeline date item component.
 */
@Tag("pd-timeline-date")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-timeline-date.js")
public class PdTimelineDate extends AbstractPdComponent implements HasComponents {

    public void setHeader(String header) {
        setStringProperty("header", header);
    }

    public String getHeader() {
        return getStringProperty("header");
    }

    public void setHref(String href) {
        setStringProperty("href", href);
    }

    public String getHref() {
        return getStringProperty("href");
    }

    public void setTarget(String target) {
        setStringProperty("target", target);
    }

    public String getTarget() {
        return getStringProperty("target");
    }

    public void setDate(String date) {
        setStringProperty("date", date);
    }

    public String getDate() {
        return getStringProperty("date");
    }
}
