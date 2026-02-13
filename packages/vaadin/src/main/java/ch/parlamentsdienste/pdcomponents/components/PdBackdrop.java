package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdTapEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Backdrop overlay component.
 */
@Tag("pd-backdrop")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-backdrop.js")
public class PdBackdrop extends AbstractPdComponent {

    public void setVisible(boolean visible) {
        setBooleanProperty("visible", visible);
    }

    public boolean isVisible() {
        return getBooleanProperty("visible");
    }

    public Registration addTapListener(ComponentEventListener<PdTapEvent<PdBackdrop>> listener) {
        return addListener(PdTapEvent.class, (ComponentEventListener) listener);
    }
}
