package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.types.PdModalConfig;
import com.github.mvysny.kaributesting.v10.MockVaadin;
import com.vaadin.flow.component.html.Paragraph;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PdModalTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsModal() {
        PdModal modal = new PdModal();
        assertNotNull(modal);
        assertEquals("pd-modal", modal.getElement().getTag());
    }

    @Test
    void addContent_addsToDefaultSlot() {
        PdModal modal = new PdModal();
        modal.add(new Paragraph("Content"));
        assertEquals(1, modal.getElement().getChildCount());
    }

    @Test
    void addToFooter_addsToFooterSlot() {
        PdModal modal = new PdModal();
        PdButton closeBtn = new PdButton("Close");
        modal.addToFooter(closeBtn);
        assertEquals("footer", closeBtn.getElement().getAttribute("slot"));
    }

    @Test
    void setConfig_setsJsonProperty() {
        PdModal modal = new PdModal();
        modal.setConfig(new PdModalConfig("Test Title", true, "1000"));
        assertNotNull(modal.getElement().getPropertyRaw("config"));
    }
}
