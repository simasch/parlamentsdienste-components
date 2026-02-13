package ch.parlamentsdienste.components.demo.ui;

import ch.parlamentsdienste.pdcomponents.components.PdTable;
import ch.parlamentsdienste.pdcomponents.types.PdColumn;
import ch.parlamentsdienste.pdcomponents.types.PdTableIconConfiguration;
import ch.parlamentsdienste.pdcomponents.types.PdTableRow;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

/**
 * Showcases PdTable component with columns, rows, selection, and action icons.
 */
@Route("table")
@Menu(title = "Table")
public class TableView extends VerticalLayout {

    public TableView() {
        add(new H2("Table"));

        PdTable table = new PdTable();
        table.setSelectable(true);
        table.setShowActionColumn(true);
        table.setShowStatus(true);
        table.setPaging(true);
        table.setHeaderStyle("dark");
        table.setIconConfig(new PdTableIconConfiguration(true, true, true));

        // Define columns
        List<PdColumn> columns = new ArrayList<>();
        PdColumn nameCol = new PdColumn("name", "Name", 200, 100);
        nameCol.setSortable(true);
        nameCol.setFilter(true);
        columns.add(nameCol);

        PdColumn partyCol = new PdColumn("party", "Partei", 150, 80);
        partyCol.setSortable(true);
        columns.add(partyCol);

        PdColumn cantonCol = new PdColumn("canton", "Kanton", 120, 60);
        cantonCol.setSortable(true);
        columns.add(cantonCol);

        table.setColumns(columns);

        // Define rows
        List<PdTableRow> rows = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            PdTableRow row = new PdTableRow();
            row.setId(i);
            row.put("name", "Person " + (i + 1));
            row.put("party", i % 2 == 0 ? "SP" : "SVP");
            row.put("canton", i % 3 == 0 ? "BE" : (i % 3 == 1 ? "ZH" : "GE"));
            row.setPdStatus(i % 4 == 0 ? "success" : (i % 4 == 1 ? "warning" : "info"));
            row.setPdSelected(false);
            row.setPdIconConfig(new PdTableIconConfiguration(true, true, i % 2 == 0));
            rows.add(row);
        }
        table.setRows(rows);

        // Events
        table.addEditListener(e -> Notification.show("Edit: " + e.getDetail()));
        table.addViewListener(e -> Notification.show("View: " + e.getDetail()));
        table.addDeleteListener(e -> Notification.show("Delete: " + e.getDetail()));
        table.addSelectedListener(e -> Notification.show("Selected: " + e.getDetail()));

        add(table);
    }
}
