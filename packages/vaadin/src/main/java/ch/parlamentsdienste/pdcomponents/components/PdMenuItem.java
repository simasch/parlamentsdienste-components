package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Individual menu item component.
 */
@Tag("pd-menu-item")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-menu-item.js")
public class PdMenuItem extends AbstractPdComponent implements HasComponents {

    public PdMenuItem() {
    }

    public PdMenuItem(String text) {
        setText(text);
    }

    public void setText(String text) {
        setStringProperty("text", text);
    }

    public String getText() {
        return getStringProperty("text");
    }

    public void setDisabled(boolean disabled) {
        setBooleanProperty("disabled", disabled);
    }

    public boolean isDisabled() {
        return getBooleanProperty("disabled");
    }
}
