package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * Container component for grouping buttons.
 */
@Tag("pd-button-group")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-button-group.js")
public class PdButtonGroup extends AbstractPdComponent implements HasComponents {
}
