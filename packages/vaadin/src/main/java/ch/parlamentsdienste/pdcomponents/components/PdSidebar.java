package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Sidebar navigation container component.
 */
@Tag("pd-sidebar")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-sidebar.js")
public class PdSidebar extends AbstractPdComponent implements HasComponents {
}
