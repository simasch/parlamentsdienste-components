package ch.parlamentsdienste.pdcomponents.components;

import com.github.mvysny.kaributesting.v10.MockVaadin;
import com.vaadin.flow.component.html.Span;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PdPanelTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsPanel() {
        PdPanel panel = new PdPanel();
        assertNotNull(panel);
        assertEquals("pd-panel", panel.getElement().getTag());
    }

    @Test
    void setCollapsible_getsCollapsible() {
        PdPanel panel = new PdPanel();
        panel.setCollapsible(true);
        assertTrue(panel.isCollapsible());
    }

    @Test
    void setCollapsed_getsCollapsed() {
        PdPanel panel = new PdPanel();
        panel.setCollapsed(true);
        assertTrue(panel.isCollapsed());
    }

    @Test
    void addToHeader_setsHeaderSlot() {
        PdPanel panel = new PdPanel();
        PdPanelHeader header = new PdPanelHeader();
        header.add(new Span("Header"));
        panel.addToHeader(header);
        assertEquals("header", header.getElement().getAttribute("slot"));
    }

    @Test
    void addToFooter_setsFooterSlot() {
        PdPanel panel = new PdPanel();
        PdPanelFooter footer = new PdPanelFooter();
        footer.add(new Span("Footer"));
        panel.addToFooter(footer);
        assertEquals("footer", footer.getElement().getAttribute("slot"));
    }
}
