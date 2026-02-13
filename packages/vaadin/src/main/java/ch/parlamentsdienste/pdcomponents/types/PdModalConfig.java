package ch.parlamentsdienste.pdcomponents.types;

import ch.parlamentsdienste.pdcomponents.base.JsonUtils;
import com.vaadin.flow.internal.JacksonUtils;
import tools.jackson.databind.node.ObjectNode;

/**
 * Java representation of the TypeScript PdModalConfig interface.
 */
public record PdModalConfig(
        String title,
        Boolean backdropVisible,
        String zIndex
) {
    public PdModalConfig(String title) {
        this(title, null, null);
    }

    public ObjectNode toJson() {
        ObjectNode obj = JacksonUtils.createObjectNode();
        JsonUtils.putString(obj, "title", title);
        if (backdropVisible != null) {
            JsonUtils.putBoolean(obj, "backdropVisible", backdropVisible);
        }
        JsonUtils.putString(obj, "zIndex", zIndex);
        return obj;
    }

    public static PdModalConfig fromJson(ObjectNode obj) {
        return new PdModalConfig(
                JsonUtils.getString(obj, "title"),
                obj.has("backdropVisible") ? JsonUtils.getBoolean(obj, "backdropVisible", true) : null,
                JsonUtils.getString(obj, "zIndex")
        );
    }
}
