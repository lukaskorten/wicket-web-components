package de.korten.wicket.examples.webcomponents;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.ResourceModel;

/**
 * The home page of the "hello-world"-application.
 */
public class HomePage extends WebPage {

    public HomePage() {

        add(new Label("greeting", new ResourceModel("greeting.helloWorld")));

    }
}
