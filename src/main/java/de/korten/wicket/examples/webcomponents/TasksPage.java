package de.korten.wicket.examples.webcomponents;

import de.korten.wicket.examples.webcomponents.todos.TasksPanel;
import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.annotation.mount.MountPath;

@MountPath("/")
public class TasksPage extends WebPage {

    public TasksPage() {

        add(new TasksPanel("todos"));

    }
}
