package de.korten.wicket.examples.webcomponents.tasks;

import de.korten.wicket.examples.webcomponents.tasks.create.CreateTaskPanel;
import de.korten.wicket.examples.webcomponents.tasks.create.TaskCreatedPayload;
import de.korten.wicket.examples.webcomponents.tasks.list.TaskListPanel;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.event.IEvent;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.util.ListModel;

import java.util.ArrayList;
import java.util.List;

public class TasksPanel extends GenericPanel<List<TaskEntry>> {

    public TasksPanel(String id) {
        super(id, new ListModel<>(new ArrayList<>()));

        setOutputMarkupId(true);

        add(new CreateTaskPanel("createTodoPanel"));
        add(new TaskListPanel("taskListPanel"));
    }

    @Override
    public void onEvent(IEvent<?> event) {
        super.onEvent(event);

        if (event.getPayload() instanceof TaskCreatedPayload) {
            AjaxRequestTarget target = ((TaskCreatedPayload) event.getPayload()).getTarget();
            target.add(this);
        }
    }
}
