package de.korten.wicket.examples.webcomponents.tasks;

import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.annotation.mount.MountPath;

@MountPath("/tasks")
public class TasksPage extends WebPage {

    public TasksPage() {

        add(new TasksPanel("todos"));

    }
}
