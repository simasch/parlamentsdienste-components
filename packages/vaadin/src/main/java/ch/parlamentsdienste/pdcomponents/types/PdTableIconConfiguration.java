package ch.parlamentsdienste.pdcomponents.types;

import ch.parlamentsdienste.pdcomponents.base.JsonUtils;
import com.vaadin.flow.internal.JacksonUtils;
import tools.jackson.databind.node.ObjectNode;

/**
 * Java representation of the TypeScript PdTableIconConfiguration interface.
 */
public record PdTableIconConfiguration(
        boolean edit,
        boolean view,
        boolean delete_
) {
    public PdTableIconConfiguration(boolean edit, boolean view, boolean delete_) {
        this.edit = edit;
        this.view = view;
        this.delete_ = delete_;
    }

    public ObjectNode toJson() {
        ObjectNode obj = JacksonUtils.createObjectNode();
        JsonUtils.putBoolean(obj, "edit", edit);
        JsonUtils.putBoolean(obj, "view", view);
        JsonUtils.putBoolean(obj, "delete", delete_);
        return obj;
    }

    public static PdTableIconConfiguration fromJson(ObjectNode obj) {
        return new PdTableIconConfiguration(
                JsonUtils.getBoolean(obj, "edit", false),
                JsonUtils.getBoolean(obj, "view", false),
                JsonUtils.getBoolean(obj, "delete", false)
        );
    }
}
