package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Progress bar indicator component.
 */
@Tag("pd-progress-bar")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-progress-bar.js")
public class PdProgressBar extends AbstractPdComponent {

    /**
     * Progress bar color: primary, success, danger, warning, info.
     */
    public void setColor(String color) {
        setStringProperty("color", color);
    }

    public String getColor() {
        return getStringProperty("color", "primary");
    }

    /**
     * Progress value between 0 and 1.
     */
    public void setValue(double value) {
        setDoubleProperty("value", value);
    }

    public double getValue() {
        return getDoubleProperty("value");
    }

    public void setLabel(String label) {
        setStringProperty("label", label);
    }

    public String getLabel() {
        return getStringProperty("label");
    }

    public void setDecimals(int decimals) {
        setIntProperty("decimals", decimals);
    }

    public int getDecimals() {
        return getIntProperty("decimals");
    }

    public void setStriped(boolean striped) {
        setBooleanProperty("striped", striped);
    }

    public boolean isStriped() {
        return getBooleanProperty("striped");
    }
}
