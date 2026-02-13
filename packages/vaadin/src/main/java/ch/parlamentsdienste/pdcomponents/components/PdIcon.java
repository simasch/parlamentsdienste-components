package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Icon component that loads SVG icons from the pd-icon gallery or custom source.
 */
@Tag("pd-icon")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-icon.js")
public class PdIcon extends AbstractPdComponent {

    public PdIcon() {
    }

    public PdIcon(String name) {
        setName(name);
    }

    public PdIcon(String name, double size) {
        setName(name);
        setSize(size);
    }

    /**
     * Name of an icon from the provided gallery.
     */
    public void setName(String name) {
        setStringProperty("name", name);
    }

    public String getName() {
        return getStringProperty("name");
    }

    /**
     * Specifies the src url of an SVG file.
     */
    public void setSrc(String src) {
        setStringProperty("src", src);
    }

    public String getSrc() {
        return getStringProperty("src");
    }

    /**
     * Size of the icon in rem.
     */
    public void setSize(double size) {
        setDoubleProperty("size", size);
    }

    public double getSize() {
        return getDoubleProperty("size");
    }

    /**
     * Lazy loading (default true).
     */
    public void setLazy(boolean lazy) {
        setBooleanProperty("lazy", lazy);
    }

    public boolean isLazy() {
        return getBooleanProperty("lazy", true);
    }

    /**
     * Rotation in degrees.
     */
    public void setRotate(int rotate) {
        setIntProperty("rotate", rotate);
    }

    public int getRotate() {
        return getIntProperty("rotate");
    }

    /**
     * Flip direction: x, y, xy.
     */
    public void setFlip(String flip) {
        setStringProperty("flip", flip);
    }

    public String getFlip() {
        return getStringProperty("flip");
    }

    /**
     * Spin animation in ms per rotation.
     */
    public void setSpin(int spin) {
        setIntProperty("spin", spin);
    }

    public int getSpin() {
        return getIntProperty("spin");
    }

    /**
     * Reverse spin animation direction.
     */
    public void setSpinReverse(boolean spinReverse) {
        setBooleanProperty("spinReverse", spinReverse);
    }

    public boolean isSpinReverse() {
        return getBooleanProperty("spinReverse");
    }

    /**
     * Title tag in SVG for accessibility.
     */
    public void setIconTitle(String iconTitle) {
        setStringProperty("iconTitle", iconTitle);
    }

    public String getIconTitle() {
        return getStringProperty("iconTitle");
    }

    /**
     * Description tag in SVG for accessibility.
     */
    public void setIconDescription(String iconDescription) {
        setStringProperty("iconDescription", iconDescription);
    }

    public String getIconDescription() {
        return getStringProperty("iconDescription");
    }
}
