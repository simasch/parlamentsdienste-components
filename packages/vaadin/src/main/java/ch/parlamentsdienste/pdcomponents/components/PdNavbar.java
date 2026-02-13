package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdMenuEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Navigation bar component with mobile breakpoint support.
 */
@Tag("pd-navbar")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-navbar.js")
public class PdNavbar extends AbstractPdComponent implements HasComponents {

    public void setMobileBreakpoint(int breakpoint) {
        setIntProperty("mobileBreakpoint", breakpoint);
    }

    public int getMobileBreakpoint() {
        return getIntProperty("mobileBreakpoint", 800);
    }

    /**
     * Add components to the mobile slot.
     */
    public void addToMobile(Component... components) {
        for (Component component : components) {
            component.getElement().setAttribute("slot", "mobile");
            getElement().appendChild(component.getElement());
        }
    }

    // --- Events ---

    public Registration addMenuListener(ComponentEventListener<PdMenuEvent<PdNavbar>> listener) {
        return addListener(PdMenuEvent.class, (ComponentEventListener) listener);
    }
}
