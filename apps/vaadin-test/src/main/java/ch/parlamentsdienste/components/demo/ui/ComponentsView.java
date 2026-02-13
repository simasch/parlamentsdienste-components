package ch.parlamentsdienste.components.demo.ui;

import ch.parlamentsdienste.pdcomponents.components.*;
import ch.parlamentsdienste.pdcomponents.types.PdModalConfig;
import ch.parlamentsdienste.pdcomponents.types.SortDropdownItem;
import ch.parlamentsdienste.pdcomponents.types.TabValue;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;

import java.util.List;

/**
 * Showcases PdAlert, PdModal, PdToast, PdPanel, PdTabs, PdSort,
 * PdProgressBar, PdSkeleton, PdTimeline, PdList, PdMenu, PdIcon.
 */
@Route("components")
@Menu(title = "Components")
public class ComponentsView extends VerticalLayout {

    public ComponentsView() {
        // Alerts
        add(new H2("Alerts"));

        PdAlert infoAlert = new PdAlert();
        infoAlert.setColor("info");
        infoAlert.setClosable(true);
        infoAlert.add(new Span("This is an info alert"));
        add(infoAlert);

        PdAlert expandableAlert = new PdAlert();
        expandableAlert.setColor("warning");
        expandableAlert.setExpandable(true);
        expandableAlert.setActionText("Show details");
        expandableAlert.setActionTextExpanded("Hide details");
        expandableAlert.add(new Span("Expandable warning alert"));
        Paragraph details = new Paragraph("These are the expanded details of the alert.");
        expandableAlert.addToExpandable(details);
        add(expandableAlert);

        // Modal (triggered by button)
        add(new H2("Modal"));
        PdButton openModal = new PdButton("Open Modal", "primary");
        PdModal modal = new PdModal();
        modal.setConfig(new PdModalConfig("Example Modal", true, null));
        modal.add(new Paragraph("This is modal content."));
        PdButton closeBtn = new PdButton("Close", "light");
        closeBtn.getElement().addEventListener("click", e -> modal.setVisible(false));
        modal.addToFooter(closeBtn);
        openModal.getElement().addEventListener("click", e -> modal.setVisible(true));
        add(openModal, modal);

        // Toast
        add(new H2("Toast"));
        PdToast toast = new PdToast();
        toast.setHeader("Notification");
        toast.setInfo("Just now");
        toast.add(new Span("This is a toast message."));
        toast.addClosedListener(e -> Notification.show("Toast closed"));
        add(toast);

        // Panel
        add(new H2("Panel"));
        PdPanel panel = new PdPanel();
        panel.setCollapsible(true);
        PdPanelHeader panelHeader = new PdPanelHeader();
        panelHeader.add(new Span("Collapsible Panel Header"));
        panel.addToHeader(panelHeader);
        PdPanelContent panelContent = new PdPanelContent();
        panelContent.add(new Paragraph("This is the panel content that can be collapsed."));
        panel.add(panelContent);
        PdPanelFooter panelFooter = new PdPanelFooter();
        panelFooter.add(new Span("Footer"));
        panel.addToFooter(panelFooter);
        add(panel);

        // Tabs
        add(new H2("Tabs"));
        PdTabs tabs = new PdTabs();
        tabs.setTabs(List.of(
                new TabValue(1, "Tab 1", true),
                new TabValue(2, "Tab 2"),
                new TabValue(3, "Tab 3")
        ));
        tabs.addChangeListener(e -> Notification.show("Tab changed: " + e.getDetail()));
        add(tabs);

        // Sort
        add(new H2("Sort"));
        PdSort sort = new PdSort();
        sort.setItems(List.of(
                new SortDropdownItem("1", "Name", "asc"),
                new SortDropdownItem("2", "Date", "desc"),
                new SortDropdownItem("3", "Relevance", "desc")
        ));
        sort.setReverseItem(true);
        add(sort);

        // Progress Bar
        add(new H2("Progress Bar"));
        PdProgressBar progress = new PdProgressBar();
        progress.setColor("primary");
        progress.setValue(0.65);
        progress.setLabel("Progress");
        add(progress);

        // Skeleton
        add(new H2("Skeleton"));
        PdSkeleton skeleton = new PdSkeleton();
        skeleton.setHeight("40px");
        skeleton.setWidth("300px");
        add(skeleton);

        // Timeline
        add(new H2("Timeline"));
        PdTimeline timeline = new PdTimeline();
        timeline.setStart(true);
        timeline.setEnd(true);
        PdTimelineDate date1 = new PdTimelineDate();
        date1.setHeader("Session 1");
        date1.setDate("01.01.2025");
        date1.add(new Span("First session details"));
        PdTimelineDate date2 = new PdTimelineDate();
        date2.setHeader("Session 2");
        date2.setDate("15.02.2025");
        date2.add(new Span("Second session details"));
        timeline.add(date1, date2);
        add(timeline);

        // List with expandable items
        add(new H2("List"));
        PdList list = new PdList();
        PdListItem item1 = new PdListItem();
        item1.setStatus("success");
        item1.add(new Span("Approved item"));
        PdListItem item2 = new PdListItem();
        item2.setStatus("warning");
        item2.add(new Span("Pending item"));
        list.add(item1, item2);

        PdListItemExpandable expandItem = new PdListItemExpandable();
        expandItem.setStatus("info");
        expandItem.setExpandable(true);
        expandItem.setEdit(true);
        expandItem.add(new Span("Expandable list item"));
        Paragraph expandContent = new Paragraph("Expanded content here.");
        expandItem.addToExpandable(expandContent);
        list.add(expandItem);
        add(list);

        // Menu
        add(new H2("Menu"));
        PdMenu menu = new PdMenu();
        menu.setLabel("Actions");
        menu.add(new PdMenuItem("Edit"));
        menu.add(new PdMenuItem("Delete"));
        menu.add(new PdMenuItem("Export"));
        add(menu);

        // Icons
        add(new H2("Icons"));
        PdIcon icon1 = new PdIcon("edit", 2.4);
        PdIcon icon2 = new PdIcon("close", 2.4);
        PdIcon icon3 = new PdIcon("search", 2.4);
        PdIcon spinIcon = new PdIcon("settings", 2.4);
        spinIcon.setSpin(2000);
        add(icon1, icon2, icon3, spinIcon);
    }
}
