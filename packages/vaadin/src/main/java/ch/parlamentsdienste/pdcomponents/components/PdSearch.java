package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdFormField;
import ch.parlamentsdienste.pdcomponents.events.*;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Search input component with dropdown results.
 * Syncs {@code value} property via {@code pd-change} event.
 */
@Tag("pd-search")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-search.js")
public class PdSearch extends AbstractPdFormField<PdSearch, String> {

    public PdSearch() {
        super("value", "", false);
        getElement().addPropertyChangeListener("value", "pd-change", e -> {});
    }

    public void setPlaceholder(String placeholder) {
        setStringProperty("placeholder", placeholder);
    }

    public String getPlaceholder() {
        return getStringProperty("placeholder");
    }

    public void setSearchIcon(boolean searchIcon) {
        setBooleanProperty("searchIcon", searchIcon);
    }

    public boolean isSearchIcon() {
        return getBooleanProperty("searchIcon", true);
    }

    /**
     * Focus the search input.
     */
    public void setFocus() {
        getElement().callJsFunction("setFocus");
    }

    // --- Events ---

    public Registration addInputListener(ComponentEventListener<PdInputEvent<PdSearch>> listener) {
        return addListener(PdInputEvent.class, (ComponentEventListener) listener);
    }

    public Registration addChangeListener(ComponentEventListener<PdChangeEvent<PdSearch>> listener) {
        return addListener(PdChangeEvent.class, (ComponentEventListener) listener);
    }

    public Registration addSearchListener(ComponentEventListener<PdSearchEvent<PdSearch>> listener) {
        return addListener(PdSearchEvent.class, (ComponentEventListener) listener);
    }

    public Registration addBlurListener(ComponentEventListener<PdBlurEvent<PdSearch>> listener) {
        return addListener(PdBlurEvent.class, (ComponentEventListener) listener);
    }

    public Registration addFocusListener(ComponentEventListener<PdFocusEvent<PdSearch>> listener) {
        return addListener(PdFocusEvent.class, (ComponentEventListener) listener);
    }
}
