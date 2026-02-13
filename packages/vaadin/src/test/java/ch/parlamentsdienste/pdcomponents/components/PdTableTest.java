package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.types.PdColumn;
import ch.parlamentsdienste.pdcomponents.types.PdTableIconConfiguration;
import ch.parlamentsdienste.pdcomponents.types.PdTableRow;
import com.github.mvysny.kaributesting.v10.MockVaadin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PdTableTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsTable() {
        PdTable table = new PdTable();
        assertNotNull(table);
        assertEquals("pd-table", table.getElement().getTag());
    }

    @Test
    void setColumns_setsJsonProperty() {
        PdTable table = new PdTable();
        List<PdColumn> columns = List.of(
                new PdColumn("name", "Name", 200, 100),
                new PdColumn("age", "Age", 100, 50)
        );
        table.setColumns(columns);
        assertNotNull(table.getElement().getPropertyRaw("columns"));
    }

    @Test
    void setRows_setsJsonProperty() {
        PdTable table = new PdTable();
        PdTableRow row = new PdTableRow();
        row.setId(1);
        row.put("name", "Test");
        row.setPdStatus("success");
        row.setPdSelected(false);
        row.setPdIconConfig(new PdTableIconConfiguration(true, false, false));
        table.setRows(List.of(row));
        assertNotNull(table.getElement().getPropertyRaw("rows"));
    }

    @Test
    void setSelectable_getsSelectable() {
        PdTable table = new PdTable();
        table.setSelectable(true);
        assertTrue(table.isSelectable());
    }

    @Test
    void setPaging_getsPaging() {
        PdTable table = new PdTable();
        table.setPaging(true);
        assertTrue(table.isPaging());
    }

    @Test
    void setHeaderStyle_getsHeaderStyle() {
        PdTable table = new PdTable();
        table.setHeaderStyle("dark");
        assertEquals("dark", table.getHeaderStyle());
    }
}
