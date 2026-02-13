package ch.parlamentsdienste.pdcomponents.components;

import com.github.mvysny.kaributesting.v10.MockVaadin;
import com.vaadin.flow.component.html.Span;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PdAlertTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsAlert() {
        PdAlert alert = new PdAlert();
        assertNotNull(alert);
        assertEquals("pd-alert", alert.getElement().getTag());
    }

    @Test
    void setColor_getsColor() {
        PdAlert alert = new PdAlert();
        alert.setColor("danger");
        assertEquals("danger", alert.getColor());
    }

    @Test
    void setClosable_getsClosable() {
        PdAlert alert = new PdAlert();
        alert.setClosable(true);
        assertTrue(alert.isClosable());
    }

    @Test
    void setExpandable_getsExpandable() {
        PdAlert alert = new PdAlert();
        alert.setExpandable(true);
        assertTrue(alert.isExpandable());
    }

    @Test
    void addContent_addsToDefaultSlot() {
        PdAlert alert = new PdAlert();
        alert.add(new Span("Alert text"));
        assertEquals(1, alert.getElement().getChildCount());
    }

    @Test
    void addToExpandable_addsToNamedSlot() {
        PdAlert alert = new PdAlert();
        Span expandContent = new Span("Expanded");
        alert.addToExpandable(expandContent);
        assertEquals("expandable", expandContent.getElement().getAttribute("slot"));
    }
}
