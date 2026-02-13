package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdFormField;
import ch.parlamentsdienste.pdcomponents.events.PdChangeEvent;
import ch.parlamentsdienste.pdcomponents.events.PdInputEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Range slider component with Binder integration.
 * Syncs {@code value} property via {@code pd-change} event.
 */
@Tag("pd-slider")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-slider.js")
public class PdSlider extends AbstractPdFormField<PdSlider, Double> {

    public PdSlider() {
        super("value", 0.0, Double.class, v -> v, v -> v);
        getElement().addPropertyChangeListener("value", "pd-change", e -> {});
    }

    public void setMin(double min) {
        setDoubleProperty("min", min);
    }

    public double getMin() {
        return getDoubleProperty("min");
    }

    public void setMax(double max) {
        setDoubleProperty("max", max);
    }

    public double getMax() {
        return getDoubleProperty("max", 100);
    }

    public void setStep(double step) {
        setDoubleProperty("step", step);
    }

    public double getStep() {
        return getDoubleProperty("step", 1);
    }

    // --- Events ---

    public Registration addInputListener(ComponentEventListener<PdInputEvent<PdSlider>> listener) {
        return addListener(PdInputEvent.class, (ComponentEventListener) listener);
    }

    public Registration addChangeListener(ComponentEventListener<PdChangeEvent<PdSlider>> listener) {
        return addListener(PdChangeEvent.class, (ComponentEventListener) listener);
    }
}
