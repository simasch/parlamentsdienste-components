package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Individual sidebar navigation item component.
 */
@Tag("pd-sidebar-item")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-sidebar-item.js")
public class PdSidebarItem extends AbstractPdComponent {

    public PdSidebarItem() {
    }

    public PdSidebarItem(String text) {
        setText(text);
    }

    public void setText(String text) {
        setStringProperty("text", text);
    }

    public String getText() {
        return getStringProperty("text");
    }

    public void setActive(boolean active) {
        setBooleanProperty("active", active);
    }

    public boolean isActive() {
        return getBooleanProperty("active");
    }

    public void setHref(String href) {
        setStringProperty("href", href);
    }

    public String getHref() {
        return getStringProperty("href");
    }

    public void setIcon(String icon) {
        setStringProperty("icon", icon);
    }

    public String getIcon() {
        return getStringProperty("icon");
    }

    public void setIconName(String iconName) {
        setStringProperty("iconName", iconName);
    }

    public String getIconName() {
        return getStringProperty("iconName");
    }

    public void setSize(double size) {
        setDoubleProperty("size", size);
    }

    public double getSize() {
        return getDoubleProperty("size");
    }

    public void setTarget(String target) {
        setStringProperty("target", target);
    }

    public String getTarget() {
        return getStringProperty("target");
    }
}
