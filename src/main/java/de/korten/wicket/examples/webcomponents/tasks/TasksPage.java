package de.korten.wicket.examples.webcomponents.tasks;

import de.korten.wicket.examples.webcomponents.base.BasePage;
import org.wicketstuff.annotation.mount.MountPath;

@MountPath("/tasks")
public class TasksPage extends BasePage {

    public TasksPage() {

        add(new TasksPanel("todos"));

    }
}
