package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Panel content container component.
 */
@Tag("pd-panel-content")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-panel-content.js")
public class PdPanelContent extends AbstractPdComponent implements HasComponents {
}
