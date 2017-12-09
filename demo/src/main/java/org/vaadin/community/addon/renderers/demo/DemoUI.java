package org.vaadin.community.addon.renderers.demo;


import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.ValueContext;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.renderers.ClickableRenderer;
import org.vaadin.community.addon.renderers.AbstractClickableTextConverter;
import org.vaadin.community.addon.renderers.ClickableTextRenderer;
import org.vaadin.community.addon.renderers.ClickableTextRendererAdv;
import org.vaadin.community.addon.renderers.client.ClickableText;

@Theme("demo")
@Title("LinkTextRenderer Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI
{

    @Override
    protected void init(VaadinRequest request) {

        VerticalLayout layout = new VerticalLayout();
        layout.setSpacing(true);
        layout.setMargin(true);
        layout.setSizeFull();
        
        
        Grid<DemoPerson> grid = new Grid("<b>Demo Grid</b>", new ListDataProvider(DemoPerson.getPersonList()));
        grid.setCaptionAsHtml(true);
        grid.setSizeFull();
        grid.setSelectionMode(Grid.SelectionMode.NONE);

        Grid.Column<DemoPerson, String> idColumn = grid.addColumn(DemoPerson::getId).setCaption("Id");
        Grid.Column<DemoPerson, String> firstNameColumn = grid.addColumn(DemoPerson::getFirstName).setCaption("Firstname");
        Grid.Column<DemoPerson, String> surNameColumn = grid.addColumn(DemoPerson::getSurName).setCaption("Surname");
        Grid.Column<DemoPerson, String> companyColumn = grid.addColumn(DemoPerson::getCompany, 
                new ClickableTextRenderer(getCompanyClickListener())).setCaption("Company");
        Grid.Column<DemoPerson, String> companyTypeColumn = grid.addColumn(DemoPerson::getCompanyType).setCaption("Company Type");
        Grid.Column<DemoPerson, String> cityColumn = grid.addColumn(DemoPerson::getCity).setCaption("City");
        
        
        // Use the advanced form of the Clickable Text Renderer on 
        // column "city". This will require a value provider where the PRESENTATION
        // class is of type ClickableText. Because the city is of type String
        // the value provider must convert from String to ClickableText.
        cityColumn.setRenderer((String source) -> {
            ClickableText ct = new ClickableText();
            ct.description = "Will take you to " + source;  // Sets the HTML title attribute, aka tooltip
            
            // I want a space between the underlined text and the icon. To avoid the 
            // space being underlined (because of the link styling) I use a
            // a different style for the space itself.
            ct.value = source + "<span class=\"v-icon\">&nbsp;</span>" + VaadinIcons.EXTERNAL_LINK.getHtml();
            ct.isHTML = true;
            return ct;
        }, new ClickableTextRendererAdv<>(getCityClickListener()));
        
        
        layout.addComponent(grid);
        setContent(layout);
    }

    /**
     * Listener which determines what happens when a city is clicked upon.
     */
    private ClickableRenderer.RendererClickListener<DemoPerson> getCityClickListener() {
        return (ClickableRenderer.RendererClickEvent<DemoPerson> event) -> {
            DemoPerson rowClicked =  event.getItem();
            
            Notification.show("You clicked",
                    "A city : " + rowClicked.getCity(),
                    Notification.Type.HUMANIZED_MESSAGE);
        };
    }
    
    /**
     * Listener which determines what happens when a company is clicked upon.
     */
    private ClickableRenderer.RendererClickListener<DemoPerson> getCompanyClickListener() {
        return (ClickableRenderer.RendererClickEvent<DemoPerson> event) -> {
            DemoPerson rowClicked = event.getItem();
            
            Notification.show("You clicked",
                    "A company : " + rowClicked.getCompany(),
                    Notification.Type.HUMANIZED_MESSAGE);
        };
    }
    

    
    
    @WebServlet(value = "/*" , asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
    public static class Servlet extends VaadinServlet {
    }

}
