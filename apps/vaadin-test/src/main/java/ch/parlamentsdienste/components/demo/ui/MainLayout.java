package ch.parlamentsdienste.components.demo.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.Layout;

/**
 * Main layout with AppLayout, drawer navigation, and navbar.
 */
@Layout
public class MainLayout extends AppLayout {

  public MainLayout() {
    H1 title = new H1("PD Components");
    title.getStyle().set("font-size", "var(--lumo-font-size-l)")
        .set("margin", "0");

    addToNavbar(new DrawerToggle(), title);

    SideNav sideNav = new SideNav();
    sideNav.addItem(new SideNavItem("Home", MainView.class));
    sideNav.addItem(new SideNavItem("Buttons", ButtonsView.class));
    sideNav.addItem(new SideNavItem("Forms", FormView.class));
    sideNav.addItem(new SideNavItem("Table", TableView.class));
    sideNav.addItem(new SideNavItem("Components", ComponentsView.class));

    Scroller scroller = new Scroller(sideNav);
    scroller.getStyle().set("padding", "var(--lumo-space-s)");
    addToDrawer(scroller);
  }
}
