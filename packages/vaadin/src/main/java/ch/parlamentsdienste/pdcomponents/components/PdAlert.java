package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdActionEvent;
import ch.parlamentsdienste.pdcomponents.events.PdClosedEvent;
import ch.parlamentsdienste.pdcomponents.events.PdCollapsedEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Alert component with closable, expandable, and action features.
 */
@Tag("pd-alert")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-alert.js")
public class PdAlert extends AbstractPdComponent implements HasComponents {

    /**
     * Alert color: success, danger, warning, info.
     */
    public void setColor(String color) {
        setStringProperty("color", color);
    }

    public String getColor() {
        return getStringProperty("color", "info");
    }

    public void setClosable(boolean closable) {
        setBooleanProperty("closable", closable);
    }

    public boolean isClosable() {
        return getBooleanProperty("closable");
    }

    public void setActionText(String actionText) {
        setStringProperty("actionText", actionText);
    }

    public String getActionText() {
        return getStringProperty("actionText");
    }

    public void setActionTextExpanded(String text) {
        setStringProperty("actionTextExpanded", text);
    }

    public String getActionTextExpanded() {
        return getStringProperty("actionTextExpanded");
    }

    public void setActionHref(String href) {
        setStringProperty("actionHref", href);
    }

    public String getActionHref() {
        return getStringProperty("actionHref");
    }

    public void setActionTarget(String target) {
        setStringProperty("actionTarget", target);
    }

    public String getActionTarget() {
        return getStringProperty("actionTarget");
    }

    public void setHideIcon(boolean hideIcon) {
        setBooleanProperty("hideIcon", hideIcon);
    }

    public boolean isHideIcon() {
        return getBooleanProperty("hideIcon");
    }

    public void setExpandable(boolean expandable) {
        setBooleanProperty("expandable", expandable);
    }

    public boolean isExpandable() {
        return getBooleanProperty("expandable");
    }

    public void setExpanded(boolean expanded) {
        setBooleanProperty("expanded", expanded);
    }

    public boolean isExpanded() {
        return getBooleanProperty("expanded");
    }

    /**
     * Add components to the expandable slot.
     */
    public void addToExpandable(Component... components) {
        for (Component component : components) {
            component.getElement().setAttribute("slot", "expandable");
            getElement().appendChild(component.getElement());
        }
    }

    // --- Events ---

    public Registration addClosedListener(ComponentEventListener<PdClosedEvent<PdAlert>> listener) {
        return addListener(PdClosedEvent.class, (ComponentEventListener) listener);
    }

    public Registration addActionListener(ComponentEventListener<PdActionEvent<PdAlert>> listener) {
        return addListener(PdActionEvent.class, (ComponentEventListener) listener);
    }

    public Registration addCollapsedListener(ComponentEventListener<PdCollapsedEvent<PdAlert>> listener) {
        return addListener(PdCollapsedEvent.class, (ComponentEventListener) listener);
    }
}
