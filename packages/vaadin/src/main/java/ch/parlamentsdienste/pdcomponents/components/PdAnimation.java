package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Lottie animation player for empty states.
 * Supported names: 404, access-denied, error, under-construction.
 */
@Tag("pd-animation")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-animation.js")
public class PdAnimation extends AbstractPdComponent {

    /**
     * Animation name: 404, access-denied, error, under-construction.
     */
    public void setName(String name) {
        setStringProperty("name", name);
    }

    public String getName() {
        return getStringProperty("name");
    }
}
