package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Individual list item component with optional status indicator.
 */
@Tag("pd-list-item")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-list-item.js")
public class PdListItem extends AbstractPdComponent implements HasComponents {

    /**
     * Status: success, danger, warning, info, unset.
     */
    public void setStatus(String status) {
        setStringProperty("status", status);
    }

    public String getStatus() {
        return getStringProperty("status");
    }
}
