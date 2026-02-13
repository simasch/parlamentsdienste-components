package ch.parlamentsdienste.pdcomponents.base;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.NpmPackage;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.node.BaseJsonNode;

import java.util.List;
import java.util.function.Function;

/**
 * Base class for all pd-* web component wrappers.
 * Provides the @NpmPackage annotation and common property helpers.
 */
@CssImport("@parlamentsdienste/pdcomponents-core/styles/parlamentsdienstecore.css")
@CssImport("@parlamentsdienste/pdcomponents-core/styles/typography.css")
@NpmPackage(value = "@parlamentsdienste/pdcomponents-core", version = "4.0.0-rc.2")
public abstract class AbstractPdComponent extends Component {

    // --- String properties ---

    protected void setStringProperty(String property, String value) {
        getElement().setProperty(property, value);
    }

    protected String getStringProperty(String property) {
        return getElement().getProperty(property);
    }

    protected String getStringProperty(String property, String defaultValue) {
        return getElement().getProperty(property, defaultValue);
    }

    // --- Boolean properties ---

    protected void setBooleanProperty(String property, boolean value) {
        getElement().setProperty(property, value);
    }

    protected boolean getBooleanProperty(String property) {
        return getElement().getProperty(property, false);
    }

    protected boolean getBooleanProperty(String property, boolean defaultValue) {
        return getElement().getProperty(property, defaultValue);
    }

    // --- Double properties ---

    protected void setDoubleProperty(String property, double value) {
        getElement().setProperty(property, value);
    }

    protected double getDoubleProperty(String property) {
        return getElement().getProperty(property, 0.0);
    }

    protected double getDoubleProperty(String property, double defaultValue) {
        return getElement().getProperty(property, defaultValue);
    }

    // --- Int properties ---

    protected void setIntProperty(String property, int value) {
        getElement().setProperty(property, value);
    }

    protected int getIntProperty(String property) {
        return getElement().getProperty(property, 0);
    }

    protected int getIntProperty(String property, int defaultValue) {
        return getElement().getProperty(property, defaultValue);
    }

    // --- JSON properties ---

    protected <T> void setJsonListProperty(String property, List<T> items, Function<T, ? extends JsonNode> toJson) {
        getElement().setPropertyJson(property, JsonUtils.toJsonArray(items, toJson));
    }

    protected void setJsonProperty(String property, BaseJsonNode json) {
        getElement().setPropertyJson(property, json);
    }
}
