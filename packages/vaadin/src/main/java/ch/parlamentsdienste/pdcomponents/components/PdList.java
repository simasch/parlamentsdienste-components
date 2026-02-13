package ch.parlamentsdienste.pdcomponents.components;

import ch.parlamentsdienste.pdcomponents.base.AbstractPdComponent;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * List container component.
 */
@Tag("pd-list")
@JsModule("@parlamentsdienste/pdcomponents-core/components/pd-list.js")
public class PdList extends AbstractPdComponent implements HasComponents {
}
