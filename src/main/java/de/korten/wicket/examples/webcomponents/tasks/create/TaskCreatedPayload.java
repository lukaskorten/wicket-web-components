package de.korten.wicket.examples.webcomponents.tasks.create;

import de.korten.wicket.examples.webcomponents.tasks.TaskListChangedPayload;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class TaskCreatedPayload extends TaskListChangedPayload {

    public TaskCreatedPayload(AjaxRequestTarget target) {
        super(target);
    }

}
