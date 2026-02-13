package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Label component with optional dot indicator.
 */
@Tag("pd-label")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-label.js")
public class PdLabel extends AbstractPdComponent implements HasText, HasComponents {

    public void setHasDot(boolean hasDot) {
        setBooleanProperty("hasDot", hasDot);
    }

    public boolean isHasDot() {
        return getBooleanProperty("hasDot");
    }

    /**
     * Label color (used as background or dot color).
     */
    public void setColor(String color) {
        setStringProperty("color", color);
    }

    public String getColor() {
        return getStringProperty("color");
    }
}
