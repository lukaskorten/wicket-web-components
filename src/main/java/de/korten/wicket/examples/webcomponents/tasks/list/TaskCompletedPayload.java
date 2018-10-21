package de.korten.wicket.examples.webcomponents.tasks.list;

import de.korten.wicket.examples.webcomponents.tasks.TaskEntry;
import de.korten.wicket.examples.webcomponents.tasks.TaskListChangedPayload;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class TaskCompletedPayload extends TaskListChangedPayload {

    private TaskEntry completedTask;

    public TaskCompletedPayload(AjaxRequestTarget target, TaskEntry completedTask) {
        super(target);
        this.completedTask = completedTask;
    }

    public TaskEntry getCompletedTask() {
        return completedTask;
    }
}
