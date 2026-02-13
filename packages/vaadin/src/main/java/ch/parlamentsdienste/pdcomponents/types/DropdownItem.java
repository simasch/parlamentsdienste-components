package ch.parlamentsdienste.pdcomponents.types;

import ch.parlamentsdienste.pdcomponents.base.JsonUtils;
import com.vaadin.flow.internal.JacksonUtils;
import tools.jackson.databind.node.ObjectNode;

/**
 * Java representation of the TypeScript DropdownItem / ComboboxItem interface.
 */
public record DropdownItem(
        String id,
        String label,
        String value,
        Boolean selected,
        String iconName,
        String iconSrc
) {
    public DropdownItem(String id, String label, String value) {
        this(id, label, value, null, null, null);
    }

    public ObjectNode toJson() {
        ObjectNode obj = JacksonUtils.createObjectNode();
        JsonUtils.putString(obj, "id", id);
        JsonUtils.putString(obj, "label", label);
        JsonUtils.putString(obj, "value", value);
        if (selected != null) {
            JsonUtils.putBoolean(obj, "selected", selected);
        }
        JsonUtils.putString(obj, "iconName", iconName);
        JsonUtils.putString(obj, "iconSrc", iconSrc);
        return obj;
    }

    public static DropdownItem fromJson(ObjectNode obj) {
        return new DropdownItem(
                JsonUtils.getString(obj, "id"),
                JsonUtils.getString(obj, "label"),
                JsonUtils.getString(obj, "value"),
                obj.has("selected") ? JsonUtils.getBoolean(obj, "selected", false) : null,
                JsonUtils.getString(obj, "iconName"),
                JsonUtils.getString(obj, "iconSrc")
        );
    }
}
