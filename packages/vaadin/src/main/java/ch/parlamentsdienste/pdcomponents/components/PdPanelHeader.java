package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdHoverEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Panel header component with subtitle and icons slots.
 */
@Tag("pd-panel-header")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-panel-header.js")
public class PdPanelHeader extends AbstractPdComponent implements HasComponents {

    /**
     * Add components to the subtitle slot.
     */
    public void addToSubtitle(Component... components) {
        for (Component component : components) {
            component.getElement().setAttribute("slot", "subtitle");
            getElement().appendChild(component.getElement());
        }
    }

    /**
     * Add components to the icons slot.
     */
    public void addToIcons(Component... components) {
        for (Component component : components) {
            component.getElement().setAttribute("slot", "icons");
            getElement().appendChild(component.getElement());
        }
    }

    // --- Events ---

    public Registration addHoverListener(ComponentEventListener<PdHoverEvent<PdPanelHeader>> listener) {
        return addListener(PdHoverEvent.class, (ComponentEventListener) listener);
    }
}
