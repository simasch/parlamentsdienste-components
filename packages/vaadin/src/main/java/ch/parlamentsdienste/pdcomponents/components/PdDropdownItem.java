package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Individual dropdown/combobox item component.
 */
@Tag("pd-dropdown-item")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-dropdown-item.js")
public class PdDropdownItem extends AbstractPdComponent {

    public void setValue(String value) {
        setStringProperty("value", value);
    }

    public String getValue() {
        return getStringProperty("value");
    }

    public void setSelected(boolean selected) {
        setBooleanProperty("selected", selected);
    }

    public boolean isSelected() {
        return getBooleanProperty("selected");
    }

    public void setMultiselect(boolean multiselect) {
        setBooleanProperty("multiselect", multiselect);
    }

    public boolean isMultiselect() {
        return getBooleanProperty("multiselect");
    }

    public void setHighlight(String highlight) {
        setStringProperty("highlight", highlight);
    }

    public String getHighlight() {
        return getStringProperty("highlight");
    }

    public void setIconName(String iconName) {
        setStringProperty("iconName", iconName);
    }

    public String getIconName() {
        return getStringProperty("iconName");
    }

    public void setIconSrc(String iconSrc) {
        setStringProperty("iconSrc", iconSrc);
    }

    public String getIconSrc() {
        return getStringProperty("iconSrc");
    }
}
