package ch.parlamentsdienste.pdcomponents.types;

import ch.parlamentsdienste.pdcomponents.base.JsonUtils;
import com.vaadin.flow.internal.JacksonUtils;
import tools.jackson.databind.node.ObjectNode;

/**
 * Java representation of the TypeScript SortDropdownItem interface.
 */
public record SortDropdownItem(
        String id,
        String label,
        String value,
        Boolean selected,
        String sort // "desc" | "asc"
) {
    public SortDropdownItem(String id, String label, String sort) {
        this(id, label, null, null, sort);
    }

    public ObjectNode toJson() {
        ObjectNode obj = JacksonUtils.createObjectNode();
        JsonUtils.putString(obj, "id", id);
        JsonUtils.putString(obj, "label", label);
        JsonUtils.putString(obj, "value", value);
        if (selected != null) {
            JsonUtils.putBoolean(obj, "selected", selected);
        }
        JsonUtils.putString(obj, "sort", sort);
        return obj;
    }

    public static SortDropdownItem fromJson(ObjectNode obj) {
        return new SortDropdownItem(
                JsonUtils.getString(obj, "id"),
                JsonUtils.getString(obj, "label"),
                JsonUtils.getString(obj, "value"),
                obj.has("selected") ? JsonUtils.getBoolean(obj, "selected", false) : null,
                JsonUtils.getString(obj, "sort")
        );
    }
}
