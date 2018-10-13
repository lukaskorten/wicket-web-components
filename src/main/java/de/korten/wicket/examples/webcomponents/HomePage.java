package de.korten.wicket.examples.webcomponents;

import de.korten.wicket.examples.webcomponents.todos.TodosPanel;
import org.apache.wicket.markup.html.WebPage;

/**
 * The home page of the "hello-world"-application.
 */
public class HomePage extends WebPage {

    public HomePage() {

        add(new TodosPanel("todos"));

    }
}
