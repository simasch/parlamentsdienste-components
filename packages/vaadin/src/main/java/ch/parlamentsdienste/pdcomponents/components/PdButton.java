package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasEnabled;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Button component with color, size, outline, and icon variants.
 */
@Tag("pd-button")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-button.js")
public class PdButton extends AbstractPdComponent implements HasText, HasEnabled {

    public PdButton() {
    }

    public PdButton(String text) {
        setText(text);
    }

    public PdButton(String text, String color) {
        setText(text);
        setColor(color);
    }

    /**
     * Button color: primary, success, danger, warning, info, light, dark.
     */
    public void setColor(String color) {
        setStringProperty("color", color);
    }

    public String getColor() {
        return getStringProperty("color", "primary");
    }

    /**
     * Button size: normal, small, large.
     */
    public void setSize(String size) {
        setStringProperty("size", size);
    }

    public String getSize() {
        return getStringProperty("size", "normal");
    }

    /**
     * Button type: button, submit, reset.
     */
    public void setType(String type) {
        setStringProperty("type", type);
    }

    public String getType() {
        return getStringProperty("type", "button");
    }

    /**
     * Outline style.
     */
    public void setOutline(boolean outline) {
        setBooleanProperty("outline", outline);
    }

    public boolean isOutline() {
        return getBooleanProperty("outline");
    }

    /**
     * Full width button.
     */
    public void setFullWidth(boolean fullWidth) {
        setBooleanProperty("fullWidth", fullWidth);
    }

    public boolean isFullWidth() {
        return getBooleanProperty("fullWidth");
    }

    /**
     * Set href to render as a link.
     */
    public void setHref(String href) {
        setStringProperty("href", href);
    }

    public String getHref() {
        return getStringProperty("href");
    }

    /**
     * Show as link style (no button chrome).
     */
    public void setShowAsLink(boolean showAsLink) {
        setBooleanProperty("showAsLink", showAsLink);
    }

    public boolean isShowAsLink() {
        return getBooleanProperty("showAsLink");
    }

    /**
     * Target for link (_blank, etc.).
     */
    public void setTarget(String target) {
        setStringProperty("target", target);
    }

    public String getTarget() {
        return getStringProperty("target");
    }

    /**
     * Icon location: left, right, center, none.
     */
    public void setIconLocation(String iconLocation) {
        setStringProperty("iconLocation", iconLocation);
    }

    public String getIconLocation() {
        return getStringProperty("iconLocation");
    }

    /**
     * Adds a component to the icon slot.
     */
    public void setIcon(Component icon) {
        icon.getElement().setAttribute("slot", "icon");
        getElement().appendChild(icon.getElement());
    }
}
