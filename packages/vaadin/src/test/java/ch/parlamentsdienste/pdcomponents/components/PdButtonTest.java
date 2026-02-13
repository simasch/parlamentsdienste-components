package ch.parlamentsdienste.pdcomponents.components;

import com.github.mvysny.kaributesting.v10.MockVaadin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PdButtonTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsButton() {
        PdButton button = new PdButton();
        assertNotNull(button);
        assertEquals("pd-button", button.getElement().getTag());
    }

    @Test
    void constructorWithText_setsText() {
        PdButton button = new PdButton("Click me");
        assertEquals("Click me", button.getText());
    }

    @Test
    void constructorWithTextAndColor_setsBothProperties() {
        PdButton button = new PdButton("Submit", "success");
        assertEquals("Submit", button.getText());
        assertEquals("success", button.getColor());
    }

    @Test
    void setColor_getsColor() {
        PdButton button = new PdButton();
        button.setColor("danger");
        assertEquals("danger", button.getColor());
    }

    @Test
    void setSize_getsSize() {
        PdButton button = new PdButton();
        button.setSize("large");
        assertEquals("large", button.getSize());
    }

    @Test
    void setOutline_getsOutline() {
        PdButton button = new PdButton();
        button.setOutline(true);
        assertTrue(button.isOutline());
    }

    @Test
    void setFullWidth_getsFullWidth() {
        PdButton button = new PdButton();
        button.setFullWidth(true);
        assertTrue(button.isFullWidth());
    }

    @Test
    void setEnabled_getsEnabled() {
        PdButton button = new PdButton();
        button.setEnabled(false);
        assertFalse(button.isEnabled());
    }

    @Test
    void setHref_getsHref() {
        PdButton button = new PdButton();
        button.setHref("https://example.com");
        assertEquals("https://example.com", button.getHref());
    }

    @Test
    void setType_getsType() {
        PdButton button = new PdButton();
        button.setType("submit");
        assertEquals("submit", button.getType());
    }

    @Test
    void setIcon_addsIconToSlot() {
        PdButton button = new PdButton("With Icon");
        PdIcon icon = new PdIcon("edit", 1.6);
        button.setIcon(icon);
        assertEquals("icon", icon.getElement().getAttribute("slot"));
    }
}
