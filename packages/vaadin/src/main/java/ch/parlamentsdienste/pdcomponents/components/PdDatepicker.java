package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdFormField;
import ch.parlamentsdienste.pdcomponents.events.PdChangeEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;
import tools.jackson.databind.node.BaseJsonNode;

/**
 * Date picker component based on flatpickr.
 * Syncs {@code date} property via {@code pd-change} event.
 * The value is a date string (format depends on flatpickr config).
 */
@Tag("pd-datepicker")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-datepicker.js")
public class PdDatepicker extends AbstractPdFormField<PdDatepicker, String> {

    public PdDatepicker() {
        super("date", "", false);
        getElement().addPropertyChangeListener("date", "pd-change", e -> {});
    }

    /**
     * Set flatpickr configuration as JSON object.
     */
    public void setConfig(BaseJsonNode config) {
        getElement().setPropertyJson("config", config);
    }

    public void setPlaceholder(String placeholder) {
        setStringProperty("placeholder", placeholder);
    }

    public String getPlaceholder() {
        return getStringProperty("placeholder");
    }

    public void setShowClear(boolean showClear) {
        setBooleanProperty("showClear", showClear);
    }

    public boolean isShowClear() {
        return getBooleanProperty("showClear");
    }

    public void setShowCalendar(boolean showCalendar) {
        setBooleanProperty("showCalendar", showCalendar);
    }

    public boolean isShowCalendar() {
        return getBooleanProperty("showCalendar");
    }

    public void setManualInput(boolean manualInput) {
        setBooleanProperty("manualInput", manualInput);
    }

    public boolean isManualInput() {
        return getBooleanProperty("manualInput");
    }

    // --- Client-side methods ---

    /**
     * Set a date from the server side.
     */
    public void set(String option, String value) {
        getElement().callJsFunction("set", option, value);
    }

    /**
     * Clear the selected date.
     */
    public void clear() {
        getElement().callJsFunction("clear");
    }

    /**
     * Close the date picker popup.
     */
    public void close() {
        getElement().callJsFunction("close");
    }

    /**
     * Open the date picker popup.
     */
    public void open() {
        getElement().callJsFunction("open");
    }

    /**
     * Toggle the date picker popup.
     */
    public void toggle() {
        getElement().callJsFunction("toggle");
    }

    /**
     * Activate the date picker.
     */
    public void activate() {
        getElement().callJsFunction("activate");
    }

    /**
     * Set specific date(s).
     */
    public void setDate(String date) {
        getElement().callJsFunction("setDate", date);
    }

    // --- Events ---

    public Registration addChangeListener(ComponentEventListener<PdChangeEvent<PdDatepicker>> listener) {
        return addListener(PdChangeEvent.class, (ComponentEventListener) listener);
    }
}
