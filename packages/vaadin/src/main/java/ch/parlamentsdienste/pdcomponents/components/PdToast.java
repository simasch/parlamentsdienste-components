package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdClosedEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Toast notification component.
 */
@Tag("pd-toast")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-toast.js")
public class PdToast extends AbstractPdComponent implements HasComponents {

    public void setHeader(String header) {
        setStringProperty("header", header);
    }

    public String getHeader() {
        return getStringProperty("header");
    }

    public void setInfo(String info) {
        setStringProperty("info", info);
    }

    public String getInfo() {
        return getStringProperty("info");
    }

    /**
     * Toast size: small, large.
     */
    public void setSize(String size) {
        setStringProperty("size", size);
    }

    public String getSize() {
        return getStringProperty("size", "large");
    }

    // --- Events ---

    public Registration addClosedListener(ComponentEventListener<PdClosedEvent<PdToast>> listener) {
        return addListener(PdClosedEvent.class, (ComponentEventListener) listener);
    }
}
