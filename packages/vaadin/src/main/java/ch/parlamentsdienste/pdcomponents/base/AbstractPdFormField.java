package ch.parlamentsdienste.pdcomponents.base;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.HasLabel;
import com.vaadin.flow.component.HasValidation;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.function.SerializableFunction;

/**
 * Base class for pd-* form field components that integrate with Vaadin Binder.
 * Extends AbstractSinglePropertyField for automatic value synchronization.
 *
 * @param <C> the component type
 * @param <T> the value type
 */
@CssImport("@parlamentsdienste/pdcomponents-core/styles/parlamentsdienstecore.css")
@CssImport("@parlamentsdienste/pdcomponents-core/styles/typography.css")
@NpmPackage(value = "@parlamentsdienste/pdcomponents-core", version = "4.0.0-rc.2")
public abstract class AbstractPdFormField<C extends AbstractPdFormField<C, T>, T>
        extends AbstractSinglePropertyField<C, T>
        implements HasLabel, HasValidation {

    private String errorMessage;
    private boolean invalid;

    /**
     * @param propertyName  the client-side property name for the value
     * @param defaultValue  the default value
     * @param elementPropertyType the type of the element property
     * @param presentationToModel converter from presentation to model
     * @param modelToPresentation converter from model to presentation
     */
    protected AbstractPdFormField(String propertyName, T defaultValue,
                                   Class<T> elementPropertyType,
                                   SerializableFunction<T, T> presentationToModel,
                                   SerializableFunction<T, T> modelToPresentation) {
        super(propertyName, defaultValue, elementPropertyType,
                presentationToModel, modelToPresentation);
    }

    /**
     * Simplified constructor for String-typed fields.
     *
     * @param propertyName the client-side property name for the value
     * @param defaultValue the default value
     * @param acceptNullValue whether null values are accepted
     */
    @SuppressWarnings("unchecked")
    protected AbstractPdFormField(String propertyName, T defaultValue, boolean acceptNullValue) {
        super(propertyName, defaultValue, acceptNullValue);
    }

    // --- Common form field properties ---

    public void setDisabled(boolean disabled) {
        getElement().setProperty("disabled", disabled);
    }

    public boolean isDisabled() {
        return getElement().getProperty("disabled", false);
    }

    public void setReadonly(boolean readonly) {
        getElement().setProperty("readonly", readonly);
    }

    public boolean isReadonly() {
        return getElement().getProperty("readonly", false);
    }

    public void setRequired(boolean required) {
        getElement().setProperty("required", required);
    }

    public boolean isRequired() {
        return getElement().getProperty("required", false);
    }

    public void setViewOnly(boolean viewOnly) {
        getElement().setProperty("viewOnly", viewOnly);
    }

    public boolean isViewOnly() {
        return getElement().getProperty("viewOnly", false);
    }

    public void setName(String name) {
        getElement().setProperty("name", name);
    }

    public String getName() {
        return getElement().getProperty("name");
    }

    public void setVerticalAdjust(boolean verticalAdjust) {
        getElement().setProperty("verticalAdjust", verticalAdjust);
    }

    public boolean isVerticalAdjust() {
        return getElement().getProperty("verticalAdjust", false);
    }

    // --- HasValidation ---

    @Override
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        getElement().setProperty("error", errorMessage != null ? errorMessage : "");
    }

    @Override
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override
    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
        if (invalid && errorMessage != null) {
            getElement().setProperty("error", errorMessage);
        } else if (!invalid) {
            getElement().setProperty("error", "");
        }
    }

    @Override
    public boolean isInvalid() {
        return this.invalid;
    }

    // --- Common property helpers ---

    protected void setStringProperty(String property, String value) {
        getElement().setProperty(property, value);
    }

    protected String getStringProperty(String property) {
        return getElement().getProperty(property);
    }

    protected String getStringProperty(String property, String defaultValue) {
        return getElement().getProperty(property, defaultValue);
    }

    protected void setBooleanProperty(String property, boolean value) {
        getElement().setProperty(property, value);
    }

    protected boolean getBooleanProperty(String property) {
        return getElement().getProperty(property, false);
    }

    protected boolean getBooleanProperty(String property, boolean defaultValue) {
        return getElement().getProperty(property, defaultValue);
    }

    protected void setDoubleProperty(String property, double value) {
        getElement().setProperty(property, value);
    }

    protected double getDoubleProperty(String property) {
        return getElement().getProperty(property, 0.0);
    }

    protected double getDoubleProperty(String property, double defaultValue) {
        return getElement().getProperty(property, defaultValue);
    }

    protected void setIntProperty(String property, int value) {
        getElement().setProperty(property, value);
    }

    protected int getIntProperty(String property) {
        return getElement().getProperty(property, 0);
    }
}
