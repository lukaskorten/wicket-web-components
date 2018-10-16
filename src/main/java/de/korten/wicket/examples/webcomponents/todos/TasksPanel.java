package de.korten.wicket.examples.webcomponents.todos;

import de.korten.wicket.examples.webcomponents.todos.create.CreateTaskPanel;
import de.korten.wicket.examples.webcomponents.todos.create.TaskCreatedPayload;
import de.korten.wicket.examples.webcomponents.todos.list.TaskListPanel;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.event.IEvent;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.util.ListModel;

import java.util.ArrayList;
import java.util.List;

public class TasksPanel extends GenericPanel<List<TaskEntry>> {

    private final TaskListPanel taskListPanel;

    public TasksPanel(String id) {
        super(id, new ListModel<>(new ArrayList<>()));

        add(new CreateTaskPanel("createTodoPanel"));
        taskListPanel = new TaskListPanel("taskListPanel");

        add(taskListPanel);
    }

    @Override
    public void onEvent(IEvent<?> event) {
        super.onEvent(event);

        if (event.getPayload() instanceof TaskCreatedPayload) {
            AjaxRequestTarget target = ((TaskCreatedPayload) event.getPayload()).getTarget();
            target.add(taskListPanel);
        }
    }
}
