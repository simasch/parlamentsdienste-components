package ch.parlamentsdienste.pdcomponents.types;

import ch.parlamentsdienste.pdcomponents.base.JsonUtils;
import com.vaadin.flow.internal.JacksonUtils;
import tools.jackson.databind.node.ObjectNode;

/**
 * Java representation of the TypeScript PdColumn interface.
 * Note: sortFunc, displayFunc, filterFunc are omitted as they are client-side JS functions.
 */
public class PdColumn {

    private String columnName;
    private String label;
    private double width;
    private double minWidth;
    private Boolean bold;
    private String sortDir; // "desc" | "asc"
    private Boolean sortable;
    private Boolean filter;
    private Boolean fixed;
    private String textAlign; // "left" | "right" | "center"

    public PdColumn() {
    }

    public PdColumn(String columnName, String label, double width, double minWidth) {
        this.columnName = columnName;
        this.label = label;
        this.width = width;
        this.minWidth = minWidth;
    }

    // Getters and setters

    public String getColumnName() { return columnName; }
    public void setColumnName(String columnName) { this.columnName = columnName; }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getMinWidth() { return minWidth; }
    public void setMinWidth(double minWidth) { this.minWidth = minWidth; }

    public Boolean getBold() { return bold; }
    public void setBold(Boolean bold) { this.bold = bold; }

    public String getSortDir() { return sortDir; }
    public void setSortDir(String sortDir) { this.sortDir = sortDir; }

    public Boolean getSortable() { return sortable; }
    public void setSortable(Boolean sortable) { this.sortable = sortable; }

    public Boolean getFilter() { return filter; }
    public void setFilter(Boolean filter) { this.filter = filter; }

    public Boolean getFixed() { return fixed; }
    public void setFixed(Boolean fixed) { this.fixed = fixed; }

    public String getTextAlign() { return textAlign; }
    public void setTextAlign(String textAlign) { this.textAlign = textAlign; }

    public ObjectNode toJson() {
        ObjectNode obj = JacksonUtils.createObjectNode();
        JsonUtils.putString(obj, "columnName", columnName);
        JsonUtils.putString(obj, "label", label);
        JsonUtils.putNumber(obj, "width", width);
        JsonUtils.putNumber(obj, "minWidth", minWidth);
        if (bold != null) JsonUtils.putBoolean(obj, "bold", bold);
        JsonUtils.putString(obj, "sortDir", sortDir);
        if (sortable != null) JsonUtils.putBoolean(obj, "sortable", sortable);
        if (filter != null) JsonUtils.putBoolean(obj, "filter", filter);
        if (fixed != null) JsonUtils.putBoolean(obj, "fixed", fixed);
        JsonUtils.putString(obj, "textAlign", textAlign);
        return obj;
    }

    public static PdColumn fromJson(ObjectNode obj) {
        PdColumn col = new PdColumn();
        col.setColumnName(JsonUtils.getString(obj, "columnName"));
        col.setLabel(JsonUtils.getString(obj, "label"));
        col.setWidth(JsonUtils.getNumber(obj, "width", 0));
        col.setMinWidth(JsonUtils.getNumber(obj, "minWidth", 0));
        col.setBold(obj.has("bold") ? JsonUtils.getBoolean(obj, "bold", false) : null);
        col.setSortDir(JsonUtils.getString(obj, "sortDir"));
        col.setSortable(obj.has("sortable") ? JsonUtils.getBoolean(obj, "sortable", false) : null);
        col.setFilter(obj.has("filter") ? JsonUtils.getBoolean(obj, "filter", false) : null);
        col.setFixed(obj.has("fixed") ? JsonUtils.getBoolean(obj, "fixed", false) : null);
        col.setTextAlign(JsonUtils.getString(obj, "textAlign"));
        return col;
    }
}
