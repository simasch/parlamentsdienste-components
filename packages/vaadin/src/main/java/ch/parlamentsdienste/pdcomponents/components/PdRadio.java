package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Single radio button component. Used inside PdRadioGroup.
 */
@Tag("pd-radio")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-radio.js")
public class PdRadio extends AbstractPdComponent {

    public PdRadio() {
    }

    public PdRadio(String label, String value) {
        setRadioLabel(label);
        setValue(value);
    }

    public void setRadioLabel(String label) {
        setStringProperty("label", label);
    }

    public String getRadioLabel() {
        return getStringProperty("label");
    }

    public void setChecked(boolean checked) {
        setBooleanProperty("checked", checked);
    }

    public boolean isChecked() {
        return getBooleanProperty("checked");
    }

    public void setName(String name) {
        setStringProperty("name", name);
    }

    public String getName() {
        return getStringProperty("name");
    }

    public void setValue(String value) {
        setStringProperty("value", value);
    }

    public String getValue() {
        return getStringProperty("value");
    }

    public void setDisabled(boolean disabled) {
        setBooleanProperty("disabled", disabled);
    }

    public boolean isDisabled() {
        return getBooleanProperty("disabled");
    }

    public void setReadonly(boolean readonly) {
        setBooleanProperty("readonly", readonly);
    }

    public boolean isReadonly() {
        return getBooleanProperty("readonly");
    }

    public void setError(String error) {
        setStringProperty("error", error);
    }

    public String getError() {
        return getStringProperty("error");
    }

    public void setVerticalAdjust(boolean verticalAdjust) {
        setBooleanProperty("verticalAdjust", verticalAdjust);
    }

    public boolean isVerticalAdjust() {
        return getBooleanProperty("verticalAdjust");
    }
}
