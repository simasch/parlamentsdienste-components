package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Individual navbar item component.
 */
@Tag("pd-navbar-item")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-navbar-item.js")
public class PdNavbarItem extends AbstractPdComponent {

    public PdNavbarItem() {
    }

    public PdNavbarItem(String text) {
        setText(text);
    }

    public void setText(String text) {
        setStringProperty("text", text);
    }

    public String getText() {
        return getStringProperty("text");
    }

    public void setEnabled(boolean enabled) {
        setBooleanProperty("enabled", enabled);
    }

    public boolean isEnabled() {
        return getBooleanProperty("enabled");
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
        return getStringProperty("target", "_blank");
    }
}
