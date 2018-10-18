package de.korten.wicket.examples.webcomponents.tasks.create;

import org.apache.wicket.ajax.AjaxRequestTarget;

public class TaskCreatedPayload {

    private AjaxRequestTarget target;

    public TaskCreatedPayload(AjaxRequestTarget target) {
        this.target = target;
    }

    public AjaxRequestTarget getTarget() {
        return target;
    }
}
