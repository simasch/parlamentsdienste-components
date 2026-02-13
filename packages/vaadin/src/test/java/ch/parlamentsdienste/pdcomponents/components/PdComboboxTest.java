package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.types.DropdownItem;
import com.github.mvysny.kaributesting.v10.MockVaadin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PdComboboxTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsCombobox() {
        PdCombobox combobox = new PdCombobox();
        assertNotNull(combobox);
        assertEquals("pd-combobox", combobox.getElement().getTag());
    }

    @Test
    void setLabel_getsLabel() {
        PdCombobox combobox = new PdCombobox();
        combobox.setLabel("City");
        assertEquals("City", combobox.getLabel());
    }

    @Test
    void setItems_setsJsonProperty() {
        PdCombobox combobox = new PdCombobox();
        combobox.setItems(List.of(
                new DropdownItem("1", "Bern", "bern"),
                new DropdownItem("2", "Zurich", "zurich")
        ));
        assertNotNull(combobox.getElement().getPropertyRaw("items"));
    }

    @Test
    void setMultiselect_getsMultiselect() {
        PdCombobox combobox = new PdCombobox();
        combobox.setMultiselect(true);
        assertTrue(combobox.isMultiselect());
    }

    @Test
    void setDisabled_getsDisabled() {
        PdCombobox combobox = new PdCombobox();
        combobox.setDisabled(true);
        assertTrue(combobox.isDisabled());
    }

    @Test
    void setErrorMessage_andInvalid() {
        PdCombobox combobox = new PdCombobox();
        combobox.setErrorMessage("Required");
        combobox.setInvalid(true);
        assertTrue(combobox.isInvalid());
        assertEquals("Required", combobox.getErrorMessage());
    }
}
