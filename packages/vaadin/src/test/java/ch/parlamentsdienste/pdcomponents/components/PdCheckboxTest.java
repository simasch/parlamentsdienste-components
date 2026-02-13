package ch.parlamentsdienste.pdcomponents.components;

import com.github.mvysny.kaributesting.v10.MockVaadin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PdCheckboxTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsCheckbox() {
        PdCheckbox checkbox = new PdCheckbox();
        assertNotNull(checkbox);
        assertEquals("pd-checkbox", checkbox.getElement().getTag());
    }

    @Test
    void constructorWithText_setsText() {
        PdCheckbox checkbox = new PdCheckbox("Accept");
        assertEquals("Accept", checkbox.getText());
    }

    @Test
    void defaultValue_isFalse() {
        PdCheckbox checkbox = new PdCheckbox();
        assertEquals(false, checkbox.getValue());
    }

    @Test
    void setValue_getsValue() {
        PdCheckbox checkbox = new PdCheckbox();
        checkbox.setValue(true);
        assertEquals(true, checkbox.getValue());
    }

    @Test
    void setDisabled_getsDisabled() {
        PdCheckbox checkbox = new PdCheckbox();
        checkbox.setDisabled(true);
        assertTrue(checkbox.isDisabled());
    }

    @Test
    void setIndeterminate_getsIndeterminate() {
        PdCheckbox checkbox = new PdCheckbox();
        checkbox.setIndeterminate(true);
        assertTrue(checkbox.isIndeterminate());
    }
}
