package de.korten.wicket.examples.webcomponents.tasks.list;

import de.korten.wicket.examples.webcomponents.tasks.TaskListChangedPayload;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class TaskDeletedPayload extends TaskListChangedPayload {

    public TaskDeletedPayload(AjaxRequestTarget target) {
        super(target);
    }
}
