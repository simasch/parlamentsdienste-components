package ch.parlamentsdienste.pdcomponents.types;

import ch.parlamentsdienste.pdcomponents.base.JsonUtils;
import com.vaadin.flow.internal.JacksonUtils;
import tools.jackson.databind.node.ObjectNode;

/**
 * Java representation of the TypeScript SortRevertItem interface.
 */
public record SortRevertItem(
        String label,
        boolean selected
) {
    public ObjectNode toJson() {
        ObjectNode obj = JacksonUtils.createObjectNode();
        JsonUtils.putString(obj, "label", label);
        JsonUtils.putBoolean(obj, "selected", selected);
        return obj;
    }

    public static SortRevertItem fromJson(ObjectNode obj) {
        return new SortRevertItem(
                JsonUtils.getString(obj, "label"),
                JsonUtils.getBoolean(obj, "selected", false)
        );
    }
}
