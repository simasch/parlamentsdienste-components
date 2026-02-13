package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.types.TabValue;
import com.github.mvysny.kaributesting.v10.MockVaadin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PdTabsTest {

    @BeforeEach
    void setup() {
        MockVaadin.setup();
    }

    @AfterEach
    void tearDown() {
        MockVaadin.tearDown();
    }

    @Test
    void defaultConstructor_createsTabs() {
        PdTabs tabs = new PdTabs();
        assertNotNull(tabs);
        assertEquals("pd-tabs", tabs.getElement().getTag());
    }

    @Test
    void setTabs_setsJsonProperty() {
        PdTabs tabs = new PdTabs();
        tabs.setTabs(List.of(
                new TabValue(1, "Tab 1", true),
                new TabValue(2, "Tab 2"),
                new TabValue(3, "Tab 3")
        ));
        assertNotNull(tabs.getElement().getPropertyRaw("tabs"));
    }

    @Test
    void setLight_getsLight() {
        PdTabs tabs = new PdTabs();
        tabs.setLight(true);
        assertTrue(tabs.isLight());
    }
}
