package ch.parlamentsdienste.pdcomponents.types;

import tools.jackson.databind.node.ArrayNode;
import tools.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Java representation of the TypeScript SelectedEvent interface (pd-table).
 */
public record SelectedEvent(
        boolean selected,
        boolean selectAll,
        PdTableRow row,
        List<PdTableRow> rows
) {
    public static SelectedEvent fromJson(ObjectNode obj) {
        boolean selected = obj.has("selected") && obj.get("selected").asBoolean();
        boolean selectAll = obj.has("selectAll") && obj.get("selectAll").asBoolean();

        PdTableRow row = null;
        if (obj.has("row") && obj.get("row").isObject()) {
            row = PdTableRow.fromJson((ObjectNode) obj.get("row"));
        }

        List<PdTableRow> rows = List.of();
        if (obj.has("rows") && obj.get("rows").isArray()) {
            ArrayNode arr = (ArrayNode) obj.get("rows");
            rows = new ArrayList<>();
            for (int i = 0; i < arr.size(); i++) {
                rows.add(PdTableRow.fromJson((ObjectNode) arr.get(i)));
            }
        }

        return new SelectedEvent(selected, selectAll, row, rows);
    }
}
