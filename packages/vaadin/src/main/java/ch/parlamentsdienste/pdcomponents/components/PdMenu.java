package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Dropdown menu component with Popper.js positioning.
 */
@Tag("pd-menu")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-menu.js")
public class PdMenu extends AbstractPdComponent implements HasComponents {

    public void setLabel(String label) {
        setStringProperty("label", label);
    }

    public String getLabel() {
        return getStringProperty("label");
    }

    public void setInvertColor(boolean invertColor) {
        setBooleanProperty("invertColor", invertColor);
    }

    public boolean isInvertColor() {
        return getBooleanProperty("invertColor");
    }

    public void setSize(double size) {
        setDoubleProperty("size", size);
    }

    public double getSize() {
        return getDoubleProperty("size");
    }

    /**
     * Placement: auto, top, bottom, left, right (with -start, -end variants).
     */
    public void setPlacement(String placement) {
        setStringProperty("placement", placement);
    }

    public String getPlacement() {
        return getStringProperty("placement");
    }

    /**
     * Open the menu programmatically.
     */
    public void open() {
        getElement().callJsFunction("open");
    }

    /**
     * Close the menu programmatically.
     */
    public void close() {
        getElement().callJsFunction("close");
    }
}
