package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.types.DropdownItem;
import com.github.mvysny.kaributesting.v10.MockVaadin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PdDropdownTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsDropdown() {
        PdDropdown dropdown = new PdDropdown();
        assertNotNull(dropdown);
        assertEquals("pd-dropdown", dropdown.getElement().getTag());
    }

    @Test
    void setLabel_getsLabel() {
        PdDropdown dropdown = new PdDropdown();
        dropdown.setLabel("Country");
        assertEquals("Country", dropdown.getLabel());
    }

    @Test
    void setPlaceholder_getsPlaceholder() {
        PdDropdown dropdown = new PdDropdown();
        dropdown.setPlaceholder("Select...");
        assertEquals("Select...", dropdown.getPlaceholder());
    }

    @Test
    void setItems_setsJsonProperty() {
        PdDropdown dropdown = new PdDropdown();
        List<DropdownItem> items = List.of(
                new DropdownItem("1", "Item A", "a"),
                new DropdownItem("2", "Item B", "b")
        );
        dropdown.setItems(items);
        // Verify the property was set (JSON array on the element)
        assertNotNull(dropdown.getElement().getPropertyRaw("items"));
    }

    @Test
    void setDisabled_getsDisabled() {
        PdDropdown dropdown = new PdDropdown();
        dropdown.setDisabled(true);
        assertTrue(dropdown.isDisabled());
    }

    @Test
    void setRequired_getsRequired() {
        PdDropdown dropdown = new PdDropdown();
        dropdown.setRequired(true);
        assertTrue(dropdown.isRequired());
    }

    @Test
    void setErrorMessage_andInvalid() {
        PdDropdown dropdown = new PdDropdown();
        dropdown.setErrorMessage("Required");
        dropdown.setInvalid(true);
        assertTrue(dropdown.isInvalid());
        assertEquals("Required", dropdown.getErrorMessage());
    }
}
