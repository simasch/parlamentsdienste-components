package ch.parlamentsdienste.components.demo.ui;

import ch.parlamentsdienste.pdcomponents.components.*;
import ch.parlamentsdienste.pdcomponents.types.DropdownItem;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;

import java.util.List;

/**
 * Showcases form components: PdInput, PdTextarea, PdCheckbox, PdSlider,
 * PdRadioGroup, PdDropdown, PdCombobox, PdDatepicker, PdSearch.
 */
@Route("forms")
@Menu(title = "Forms")
public class FormView extends VerticalLayout {

    public FormView() {
        // Input
        add(new H2("Input"));
        PdInput input = new PdInput();
        input.setLabel("Name");
        input.setPlaceholder("Enter your name");
        input.setRequired(true);
        input.addChangeListener(e -> Notification.show("Input changed: " + e.getDetail()));
        add(input);

        // Textarea
        add(new H2("Textarea"));
        PdTextarea textarea = new PdTextarea();
        textarea.setLabel("Description");
        textarea.setPlaceholder("Enter a description");
        textarea.setRows(4);
        textarea.setAutogrow(true);
        add(textarea);

        // Checkbox
        add(new H2("Checkbox"));
        PdCheckbox checkbox = new PdCheckbox("I agree to the terms");
        checkbox.addCheckedListener(e -> Notification.show("Checked: " + e.isChecked()));
        add(checkbox);

        // Slider
        add(new H2("Slider"));
        PdSlider slider = new PdSlider();
        slider.setLabel("Volume");
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(50.0);
        add(slider);

        // Radio Group
        add(new H2("Radio Group"));
        PdRadioGroup radioGroup = new PdRadioGroup();
        radioGroup.setLabel("Language");
        radioGroup.addRadio("Deutsch", "de");
        radioGroup.addRadio("Francais", "fr");
        radioGroup.addRadio("Italiano", "it");
        add(radioGroup);

        // Dropdown
        add(new H2("Dropdown"));
        PdDropdown dropdown = new PdDropdown();
        dropdown.setLabel("Country");
        dropdown.setPlaceholder("Select a country");
        dropdown.setItems(List.of(
                new DropdownItem("1", "Schweiz", "CH"),
                new DropdownItem("2", "Deutschland", "DE"),
                new DropdownItem("3", "Frankreich", "FR"),
                new DropdownItem("4", "Italien", "IT")
        ));
        add(dropdown);

        // Combobox
        add(new H2("Combobox"));
        PdCombobox combobox = new PdCombobox();
        combobox.setLabel("City");
        combobox.setPlaceholder("Search for a city");
        combobox.setItems(List.of(
                new DropdownItem("1", "Bern", "bern"),
                new DropdownItem("2", "Zurich", "zurich"),
                new DropdownItem("3", "Geneva", "geneva"),
                new DropdownItem("4", "Basel", "basel"),
                new DropdownItem("5", "Lausanne", "lausanne")
        ));
        add(combobox);

        // Datepicker
        add(new H2("Datepicker"));
        PdDatepicker datepicker = new PdDatepicker();
        datepicker.setLabel("Date");
        datepicker.setPlaceholder("Select a date");
        add(datepicker);

        // Search
        add(new H2("Search"));
        PdSearch search = new PdSearch();
        search.setLabel("Search");
        search.setPlaceholder("Search...");
        search.addSearchListener(e -> Notification.show("Search: " + e.getDetail()));
        add(search);
    }
}
