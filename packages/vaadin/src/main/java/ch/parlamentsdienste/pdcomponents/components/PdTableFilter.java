package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Table filter input component.
 */
@Tag("pd-table-filter")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-table-filter.js")
public class PdTableFilter extends AbstractPdComponent {

    public void setValue(String value) {
        setStringProperty("value", value);
    }

    public String getValue() {
        return getStringProperty("value");
    }

    /**
     * Reset the filter value.
     */
    public void reset() {
        getElement().callJsFunction("reset");
    }

    /**
     * Set the filter value programmatically.
     */
    public void setValueJs(String value) {
        getElement().callJsFunction("setValue", value);
    }

    /**
     * Focus the filter input.
     */
    public void focusInput() {
        getElement().callJsFunction("focusInput");
    }
}
