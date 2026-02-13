package ch.parlamentsdienste.pdcomponents.components;

import com.github.mvysny.kaributesting.v10.MockVaadin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PdInputTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsInput() {
        PdInput input = new PdInput();
        assertNotNull(input);
        assertEquals("pd-input", input.getElement().getTag());
    }

    @Test
    void setValue_getsValue() {
        PdInput input = new PdInput();
        input.setValue("Hello");
        assertEquals("Hello", input.getValue());
    }

    @Test
    void defaultValue_isEmptyString() {
        PdInput input = new PdInput();
        assertEquals("", input.getValue());
    }

    @Test
    void setLabel_getsLabel() {
        PdInput input = new PdInput();
        input.setLabel("Username");
        assertEquals("Username", input.getLabel());
    }

    @Test
    void setPlaceholder_getsPlaceholder() {
        PdInput input = new PdInput();
        input.setPlaceholder("Enter text");
        assertEquals("Enter text", input.getPlaceholder());
    }

    @Test
    void setDisabled_getsDisabled() {
        PdInput input = new PdInput();
        input.setDisabled(true);
        assertTrue(input.isDisabled());
    }

    @Test
    void setReadonly_getsReadonly() {
        PdInput input = new PdInput();
        input.setReadonly(true);
        assertTrue(input.isReadonly());
    }

    @Test
    void setRequired_getsRequired() {
        PdInput input = new PdInput();
        input.setRequired(true);
        assertTrue(input.isRequired());
    }

    @Test
    void setType_getsType() {
        PdInput input = new PdInput();
        input.setType("email");
        assertEquals("email", input.getType());
    }

    @Test
    void setMaxlength_getsMaxlength() {
        PdInput input = new PdInput();
        input.setMaxlength(100);
        assertEquals(100, input.getMaxlength());
    }

    @Test
    void setErrorMessage_getsErrorMessage() {
        PdInput input = new PdInput();
        input.setErrorMessage("Field is required");
        assertEquals("Field is required", input.getErrorMessage());
    }

    @Test
    void setInvalid_getsInvalid() {
        PdInput input = new PdInput();
        input.setErrorMessage("Error");
        input.setInvalid(true);
        assertTrue(input.isInvalid());
    }
}
