package de.korten.wicket.examples.webcomponents.todos.create;

import org.apache.wicket.ajax.AjaxRequestTarget;

public class TodoCreatedPayload {

    private AjaxRequestTarget target;

    public TodoCreatedPayload(AjaxRequestTarget target) {
        this.target = target;
    }
}
