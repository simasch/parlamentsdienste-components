package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdBackdropClickEvent;
import ch.parlamentsdienste.pdcomponents.events.PdClosedEvent;
import ch.parlamentsdienste.pdcomponents.events.PdEscapeEvent;
import ch.parlamentsdienste.pdcomponents.types.PdModalConfig;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Modal dialog component with backdrop, escape, and close events.
 * Supports default slot (content) and footer named slot.
 */
@Tag("pd-modal")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-modal.js")
public class PdModal extends AbstractPdComponent implements HasComponents {

    /**
     * Set the modal configuration (title, backdrop, z-index).
     */
    public void setConfig(PdModalConfig config) {
        setJsonProperty("config", config.toJson());
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

    public Registration addClosedListener(ComponentEventListener<PdClosedEvent<PdModal>> listener) {
        return addListener(PdClosedEvent.class, (ComponentEventListener) listener);
    }

    public Registration addBackdropClickListener(ComponentEventListener<PdBackdropClickEvent<PdModal>> listener) {
        return addListener(PdBackdropClickEvent.class, (ComponentEventListener) listener);
    }

    public Registration addEscapeListener(ComponentEventListener<PdEscapeEvent<PdModal>> listener) {
        return addListener(PdEscapeEvent.class, (ComponentEventListener) listener);
    }
}
