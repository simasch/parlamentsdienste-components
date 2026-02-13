package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.PdChangeEvent;
import ch.parlamentsdienste.pdcomponents.types.TabValue;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

import java.util.List;

/**
 * Tabs component with radio-button-based tab selection.
 */
@Tag("pd-tabs")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-tabs.js")
public class PdTabs extends AbstractPdComponent {

    public void setTabs(List<TabValue> tabs) {
        setJsonListProperty("tabs", tabs, TabValue::toJson);
    }

    public void setLight(boolean light) {
        setBooleanProperty("light", light);
    }

    public boolean isLight() {
        return getBooleanProperty("light");
    }

    // --- Events ---

    public Registration addChangeListener(ComponentEventListener<PdChangeEvent<PdTabs>> listener) {
        return addListener(PdChangeEvent.class, (ComponentEventListener) listener);
    }
}
