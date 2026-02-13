package ch.parlamentsdienste.components.demo.ui;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;

/**
 * Showcases PdButton, PdButtonGroup, and PdChip components.
 */
@Route("")
@Menu(title = "Home")
public class MainView extends VerticalLayout {

  public MainView() {
    add(new H2("Home"));
  }
}
