package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdCollapsedEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Collapsible panel component with header, content, and footer named slots.
 */
@Tag("pd-panel")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-panel.js")
public class PdPanel extends AbstractPdComponent implements HasComponents {

    public void setCollapsed(boolean collapsed) {
        setBooleanProperty("collapsed", collapsed);
    }

    public boolean isCollapsed() {
        return getBooleanProperty("collapsed");
    }

    public void setCollapsible(boolean collapsible) {
        setBooleanProperty("collapsible", collapsible);
    }

    public boolean isCollapsible() {
        return getBooleanProperty("collapsible");
    }

    public void setSubpanel(boolean subpanel) {
        setBooleanProperty("subpanel", subpanel);
    }

    public boolean isSubpanel() {
        return getBooleanProperty("subpanel");
    }

    /**
     * Add components to the header slot.
     */
    public void addToHeader(Component... components) {
        for (Component component : components) {
            component.getElement().setAttribute("slot", "header");
            getElement().appendChild(component.getElement());
        }
    }

    /**
     * Add components to the footer slot.
     */
    public void addToFooter(Component... components) {
        for (Component component : components) {
            component.getElement().setAttribute("slot", "footer");
            getElement().appendChild(component.getElement());
        }
    }

    // --- Events ---

    public Registration addCollapsedListener(ComponentEventListener<PdCollapsedEvent<PdPanel>> listener) {
        return addListener(PdCollapsedEvent.class, (ComponentEventListener) listener);
    }
}
