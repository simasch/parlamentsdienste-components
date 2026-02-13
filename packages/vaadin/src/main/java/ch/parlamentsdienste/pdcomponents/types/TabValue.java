package ch.parlamentsdienste.pdcomponents.types;

import ch.parlamentsdienste.pdcomponents.base.JsonUtils;
import com.vaadin.flow.internal.JacksonUtils;
import tools.jackson.databind.node.ObjectNode;

/**
 * Java representation of the TypeScript TabValue interface.
 */
public record TabValue(
        int id,
        String text,
        Boolean checked
) {
    public TabValue(int id, String text) {
        this(id, text, null);
    }

    public ObjectNode toJson() {
        ObjectNode obj = JacksonUtils.createObjectNode();
        JsonUtils.putNumber(obj, "id", id);
        JsonUtils.putString(obj, "text", text);
        if (checked != null) {
            JsonUtils.putBoolean(obj, "checked", checked);
        }
        return obj;
    }

    public static TabValue fromJson(ObjectNode obj) {
        return new TabValue(
                (int) JsonUtils.getNumber(obj, "id", 0),
                JsonUtils.getString(obj, "text"),
                obj.has("checked") ? JsonUtils.getBoolean(obj, "checked", false) : null
        );
    }
}
