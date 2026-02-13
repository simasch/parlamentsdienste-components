package ch.parlamentsdienste.components.demo.ui;

import ch.parlamentsdienste.pdcomponents.components.PdButton;
import ch.parlamentsdienste.pdcomponents.components.PdButtonGroup;
import ch.parlamentsdienste.pdcomponents.components.PdChip;
import ch.parlamentsdienste.pdcomponents.components.PdIcon;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;

/**
 * Showcases PdButton, PdButtonGroup, and PdChip components.
 */
@Route("buttons")
@Menu(title = "Buttons")
public class ButtonsView extends VerticalLayout {

    public ButtonsView() {
        add(new H2("Buttons"));

        // Button colors
        PdButtonGroup colorGroup = new PdButtonGroup();
        colorGroup.add(new PdButton("Primary", "primary"));
        colorGroup.add(new PdButton("Success", "success"));
        colorGroup.add(new PdButton("Danger", "danger"));
        colorGroup.add(new PdButton("Warning", "warning"));
        colorGroup.add(new PdButton("Info", "info"));
        colorGroup.add(new PdButton("Light", "light"));
        colorGroup.add(new PdButton("Dark", "dark"));
        add(colorGroup);

        // Button sizes
        add(new H2("Sizes"));
        PdButtonGroup sizeGroup = new PdButtonGroup();
        PdButton small = new PdButton("Small");
        small.setSize("small");
        PdButton normal = new PdButton("Normal");
        PdButton large = new PdButton("Large");
        large.setSize("large");
        sizeGroup.add(small, normal, large);
        add(sizeGroup);

        // Outline buttons
        add(new H2("Outline"));
        PdButtonGroup outlineGroup = new PdButtonGroup();
        PdButton outlinePrimary = new PdButton("Outline Primary", "primary");
        outlinePrimary.setOutline(true);
        PdButton outlineDanger = new PdButton("Outline Danger", "danger");
        outlineDanger.setOutline(true);
        outlineGroup.add(outlinePrimary, outlineDanger);
        add(outlineGroup);

        // Disabled button
        add(new H2("Disabled"));
        PdButton disabled = new PdButton("Disabled");
        disabled.setEnabled(false);
        add(disabled);

        // Button with icon
        add(new H2("Button with Icon"));
        PdButton iconButton = new PdButton("With Icon");
        iconButton.setIconLocation("left");
        iconButton.setIcon(new PdIcon("edit", 1.6));
        add(iconButton);

        // Chips
        add(new H2("Chips"));
        PdChip textChip = new PdChip();
        textChip.add(new Span("Text Chip"));
        textChip.setType("text");

        PdChip toggleChip = new PdChip();
        toggleChip.add(new Span("Toggle Chip"));
        toggleChip.setType("toggle");

        PdChip filterChip = new PdChip();
        filterChip.add(new Span("Filter Chip"));
        filterChip.setType("filter");
        filterChip.setChecked(true);

        add(textChip, toggleChip, filterChip);
    }
}
