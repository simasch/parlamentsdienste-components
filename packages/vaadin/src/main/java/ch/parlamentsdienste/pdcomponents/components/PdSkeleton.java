package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Skeleton loading placeholder component.
 */
@Tag("pd-skeleton")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-skeleton.js")
public class PdSkeleton extends AbstractPdComponent {

    public void setHeight(String height) {
        setStringProperty("height", height);
    }

    public String getHeight() {
        return getStringProperty("height", "32px");
    }

    public void setWidth(String width) {
        setStringProperty("width", width);
    }

    public String getWidth() {
        return getStringProperty("width", "100%");
    }
}
