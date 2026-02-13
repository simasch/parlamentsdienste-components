package ch.parlamentsdienste.pdcomponents.types;

import com.vaadin.flow.internal.JacksonUtils;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.node.ObjectNode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Java representation of the TypeScript PdTableRow interface.
 * Extends LinkedHashMap to support arbitrary key-value data columns.
 */
public class PdTableRow extends LinkedHashMap<String, Object> {

    public PdTableRow() {
    }

    public PdTableRow(Map<String, Object> data) {
        super(data);
    }

    public PdTableIconConfiguration getPdIconConfig() {
        Object val = get("pdIconConfig");
        return val instanceof PdTableIconConfiguration ? (PdTableIconConfiguration) val : null;
    }

    public void setPdIconConfig(PdTableIconConfiguration config) {
        put("pdIconConfig", config);
    }

    public String getPdStatus() {
        Object val = get("pdStatus");
        return val instanceof String ? (String) val : null;
    }

    public void setPdStatus(String status) {
        put("pdStatus", status);
    }

    public boolean isPdSelected() {
        Object val = get("pdSelected");
        return val instanceof Boolean && (Boolean) val;
    }

    public void setPdSelected(boolean selected) {
        put("pdSelected", selected);
    }

    public int getId() {
        Object val = get("_id");
        return val instanceof Number ? ((Number) val).intValue() : 0;
    }

    public void setId(int id) {
        put("_id", id);
    }

    public ObjectNode toJson() {
        ObjectNode obj = JacksonUtils.createObjectNode();
        for (Map.Entry<String, Object> entry : entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String s) {
                obj.put(key, s);
            } else if (value instanceof Number n) {
                obj.put(key, n.doubleValue());
            } else if (value instanceof Boolean b) {
                obj.put(key, b);
            } else if (value instanceof PdTableIconConfiguration config) {
                obj.set(key, config.toJson());
            }
        }
        return obj;
    }

    public static PdTableRow fromJson(ObjectNode obj) {
        PdTableRow row = new PdTableRow();
        for (Map.Entry<String, JsonNode> entry : obj.properties()) {
            String key = entry.getKey();
            JsonNode val = entry.getValue();
            if (val.isTextual()) {
                row.put(key, val.asText());
            } else if (val.isNumber()) {
                row.put(key, val.asDouble());
            } else if (val.isBoolean()) {
                row.put(key, val.asBoolean());
            } else if (val.isObject() && "pdIconConfig".equals(key)) {
                row.put(key, PdTableIconConfiguration.fromJson((ObjectNode) val));
            }
        }
        return row;
    }
}
