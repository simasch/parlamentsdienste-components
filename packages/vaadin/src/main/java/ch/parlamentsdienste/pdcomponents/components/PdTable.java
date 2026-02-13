package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import ch.parlamentsdienste.pdcomponents.events.*;
import ch.parlamentsdienste.pdcomponents.types.PdColumn;
import ch.parlamentsdienste.pdcomponents.types.PdTableIconConfiguration;
import ch.parlamentsdienste.pdcomponents.types.PdTableRow;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.shared.Registration;

import java.util.List;

/**
 * Table component with sorting, filtering, pagination, row selection, and action icons.
 */
@Tag("pd-table")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-table.js")
public class PdTable extends AbstractPdComponent implements HasComponents {

    // --- Column/Row data ---

    public void setColumns(List<PdColumn> columns) {
        setJsonListProperty("columns", columns, PdColumn::toJson);
    }

    public void setRows(List<PdTableRow> rows) {
        setJsonListProperty("rows", rows, PdTableRow::toJson);
    }

    public void setIconConfig(PdTableIconConfiguration config) {
        setJsonProperty("iconConfig", config.toJson());
    }

    // --- Properties ---

    public void setHeaderHeight(String headerHeight) {
        setStringProperty("headerHeight", headerHeight);
    }

    public String getHeaderHeight() {
        return getStringProperty("headerHeight");
    }

    public void setRowHeight(String rowHeight) {
        setStringProperty("rowHeight", rowHeight);
    }

    public String getRowHeight() {
        return getStringProperty("rowHeight");
    }

    public void setMinWidth(String minWidth) {
        setStringProperty("minWidth", minWidth);
    }

    public String getMinWidth() {
        return getStringProperty("minWidth");
    }

    /**
     * Header style: light, dark, gray.
     */
    public void setHeaderStyle(String headerStyle) {
        setStringProperty("headerStyle", headerStyle);
    }

    public String getHeaderStyle() {
        return getStringProperty("headerStyle", "light");
    }

    public void setShowActionColumn(boolean show) {
        setBooleanProperty("showActionColumn", show);
    }

    public boolean isShowActionColumn() {
        return getBooleanProperty("showActionColumn");
    }

    public void setSelectable(boolean selectable) {
        setBooleanProperty("selectable", selectable);
    }

    public boolean isSelectable() {
        return getBooleanProperty("selectable");
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

    public void setShowStatus(boolean showStatus) {
        setBooleanProperty("showStatus", showStatus);
    }

    public boolean isShowStatus() {
        return getBooleanProperty("showStatus");
    }

    public void setMenuLabel(String menuLabel) {
        setStringProperty("menuLabel", menuLabel);
    }

    public String getMenuLabel() {
        return getStringProperty("menuLabel");
    }

    public void setPaging(boolean paging) {
        setBooleanProperty("paging", paging);
    }

    public boolean isPaging() {
        return getBooleanProperty("paging");
    }

    /**
     * Paging location: left, right.
     */
    public void setPagingLocation(String location) {
        setStringProperty("pagingLocation", location);
    }

    public String getPagingLocation() {
        return getStringProperty("pagingLocation", "right");
    }

    public void setExternalRowHandling(boolean external) {
        setBooleanProperty("externalRowHandling", external);
    }

    public boolean isExternalRowHandling() {
        return getBooleanProperty("externalRowHandling");
    }

    /**
     * Selected status: all, none, indeterminate.
     */
    public void setSelectedStatus(String status) {
        setStringProperty("selectedStatus", status);
    }

    public String getSelectedStatus() {
        return getStringProperty("selectedStatus");
    }

    // --- Methods ---

    /**
     * Unselect all rows.
     */
    public void unselectAll() {
        getElement().callJsFunction("unselectAll");
    }

    /**
     * Refresh/re-render the table.
     */
    public void refresh() {
        getElement().callJsFunction("refresh");
    }

    // --- Events ---

    public Registration addSelectedListener(ComponentEventListener<PdSelectedEvent<PdTable>> listener) {
        return addListener(PdSelectedEvent.class, (ComponentEventListener) listener);
    }

    public Registration addEditListener(ComponentEventListener<PdEditEvent<PdTable>> listener) {
        return addListener(PdEditEvent.class, (ComponentEventListener) listener);
    }

    public Registration addViewListener(ComponentEventListener<PdViewEvent<PdTable>> listener) {
        return addListener(PdViewEvent.class, (ComponentEventListener) listener);
    }

    public Registration addDeleteListener(ComponentEventListener<PdDeleteEvent<PdTable>> listener) {
        return addListener(PdDeleteEvent.class, (ComponentEventListener) listener);
    }

    public Registration addClickedRowListener(ComponentEventListener<PdClickedRowEvent<PdTable>> listener) {
        return addListener(PdClickedRowEvent.class, (ComponentEventListener) listener);
    }

    public Registration addSortListener(ComponentEventListener<PdSortEvent<PdTable>> listener) {
        return addListener(PdSortEvent.class, (ComponentEventListener) listener);
    }

    public Registration addFilterChangeListener(ComponentEventListener<PdFilterChangeEvent<PdTable>> listener) {
        return addListener(PdFilterChangeEvent.class, (ComponentEventListener) listener);
    }

    public Registration addFilterInputListener(ComponentEventListener<PdFilterInputEvent<PdTable>> listener) {
        return addListener(PdFilterInputEvent.class, (ComponentEventListener) listener);
    }
}
