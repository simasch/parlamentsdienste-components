package ch.parlamentsdienste.pdcomponents.base;

import com.vaadin.flow.internal.JacksonUtils;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.node.ArrayNode;
import tools.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Utility class for JSON conversions between Java types and Jackson 3.
 */
public final class JsonUtils {

    private JsonUtils() {
    }

    /**
     * Converts a list of items to an ArrayNode using the provided converter.
     */
    public static <T> ArrayNode toJsonArray(List<T> items, Function<T, ? extends JsonNode> toJson) {
        ArrayNode array = JacksonUtils.createArrayNode();
        if (items != null) {
            for (T item : items) {
                array.add(toJson.apply(item));
            }
        }
        return array;
    }

    /**
     * Converts an ArrayNode to a list of items using the provided converter.
     */
    public static <T> List<T> fromJsonArray(ArrayNode array, Function<ObjectNode, T> fromJson) {
        List<T> list = new ArrayList<>();
        if (array != null) {
            for (int i = 0; i < array.size(); i++) {
                list.add(fromJson.apply((ObjectNode) array.get(i)));
            }
        }
        return list;
    }

    /**
     * Safely gets a string from an ObjectNode, returning null if not present.
     */
    public static String getString(ObjectNode obj, String key) {
        if (obj.has(key) && obj.get(key).isTextual()) {
            return obj.get(key).asText();
        }
        return null;
    }

    /**
     * Safely gets a number from an ObjectNode, returning the default if not present.
     */
    public static double getNumber(ObjectNode obj, String key, double defaultValue) {
        if (obj.has(key) && obj.get(key).isNumber()) {
            return obj.get(key).asDouble();
        }
        return defaultValue;
    }

    /**
     * Safely gets a boolean from an ObjectNode, returning the default if not present.
     */
    public static boolean getBoolean(ObjectNode obj, String key, boolean defaultValue) {
        if (obj.has(key) && obj.get(key).isBoolean()) {
            return obj.get(key).asBoolean();
        }
        return defaultValue;
    }

    /**
     * Puts a string value into an ObjectNode if the value is not null.
     */
    public static void putString(ObjectNode obj, String key, String value) {
        if (value != null) {
            obj.put(key, value);
        }
    }

    /**
     * Puts a number value into an ObjectNode.
     */
    public static void putNumber(ObjectNode obj, String key, double value) {
        obj.put(key, value);
    }

    /**
     * Puts a boolean value into an ObjectNode.
     */
    public static void putBoolean(ObjectNode obj, String key, boolean value) {
        obj.put(key, value);
    }
}
