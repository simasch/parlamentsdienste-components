package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.*;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

/**
 * Expandable list item with edit, expand, checkbox, and menu features.
 */
@Tag("pd-list-item-expandable")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-list-item-expandable.js")
public class PdListItemExpandable extends AbstractPdComponent implements HasComponents {

    /**
     * Status: success, danger, warning, info, unset.
     */
    public void setStatus(String status) {
        setStringProperty("status", status);
    }

    public String getStatus() {
        return getStringProperty("status");
    }

    public void setCollapsed(boolean collapsed) {
        setBooleanProperty("collapsed", collapsed);
    }

    public boolean isCollapsed() {
        return getBooleanProperty("collapsed", true);
    }

    public void setCheckbox(boolean checkbox) {
        setBooleanProperty("checkbox", checkbox);
    }

    public boolean isCheckbox() {
        return getBooleanProperty("checkbox");
    }

    public void setEdit(boolean edit) {
        setBooleanProperty("edit", edit);
    }

    public boolean isEdit() {
        return getBooleanProperty("edit");
    }

    public void setExpand(boolean expand) {
        setBooleanProperty("expand", expand);
    }

    public boolean isExpand() {
        return getBooleanProperty("expand");
    }

    public void setMenu(boolean menu) {
        setBooleanProperty("menu", menu);
    }

    public boolean isMenu() {
        return getBooleanProperty("menu");
    }

    public void setExpandable(boolean expandable) {
        setBooleanProperty("expandable", expandable);
    }

    public boolean isExpandable() {
        return getBooleanProperty("expandable");
    }

    public void setChecked(boolean checked) {
        setBooleanProperty("checked", checked);
    }

    public boolean isChecked() {
        return getBooleanProperty("checked");
    }

    public void setContentClick(boolean contentClick) {
        setBooleanProperty("contentClick", contentClick);
    }

    public boolean isContentClick() {
        return getBooleanProperty("contentClick");
    }

    // --- Slots ---

    public void addToActionLeft(Component... components) {
        for (Component c : components) {
            c.getElement().setAttribute("slot", "action-left");
            getElement().appendChild(c.getElement());
        }
    }

    public void addToActionRight(Component... components) {
        for (Component c : components) {
            c.getElement().setAttribute("slot", "action-right");
            getElement().appendChild(c.getElement());
        }
    }

    public void addToExpandable(Component... components) {
        for (Component c : components) {
            c.getElement().setAttribute("slot", "expandable");
            getElement().appendChild(c.getElement());
        }
    }

    public void addToMenu(Component... components) {
        for (Component c : components) {
            c.getElement().setAttribute("slot", "menu");
            getElement().appendChild(c.getElement());
        }
    }

    // --- Events ---

    public Registration addEditListener(ComponentEventListener<PdEditEvent<PdListItemExpandable>> listener) {
        return addListener(PdEditEvent.class, (ComponentEventListener) listener);
    }

    public Registration addExpandListener(ComponentEventListener<PdExpandEvent<PdListItemExpandable>> listener) {
        return addListener(PdExpandEvent.class, (ComponentEventListener) listener);
    }

    public Registration addSelectedListener(ComponentEventListener<PdSelectedEvent<PdListItemExpandable>> listener) {
        return addListener(PdSelectedEvent.class, (ComponentEventListener) listener);
    }

    public Registration addCollapsedListener(ComponentEventListener<PdCollapsedEvent<PdListItemExpandable>> listener) {
        return addListener(PdCollapsedEvent.class, (ComponentEventListener) listener);
    }

    public Registration addContentClickListener(ComponentEventListener<PdContentClickEvent<PdListItemExpandable>> listener) {
        return addListener(PdContentClickEvent.class, (ComponentEventListener) listener);
    }
}
