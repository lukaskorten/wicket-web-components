package de.korten.wicket.examples.webcomponents.tasks.list;

import de.korten.wicket.examples.webcomponents.tasks.TaskEntry;
import de.korten.wicket.examples.webcomponents.tasks.TaskService;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.event.Broadcast;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LambdaModel;

import javax.inject.Inject;
import java.time.LocalDate;

import static org.wicketstuff.lambda.components.ComponentFactory.ajaxLink;

public class TaskListItemPanel extends GenericPanel<TaskEntry> {

    @Inject
    private TaskService taskService;

    public TaskListItemPanel(String id, IModel<TaskEntry> todoEntry) {
        super(id, todoEntry);

        IModel<String> textModel = LambdaModel.of(todoEntry, TaskEntry::getText);
        IModel<LocalDate> createdModel = LambdaModel.of(todoEntry, TaskEntry::getCreated);
        IModel<LocalDate> completedModel = LambdaModel.of(todoEntry, TaskEntry::getCompleted);

        add(new Label("text", textModel));
        add(new Label("created", createdModel));
        add(new Label("completed", completedModel));

        add(ajaxLink("deleteTask", this::onTaskDelete));

    }

    private void onTaskDelete(AjaxLink link, AjaxRequestTarget target) {
        TaskEntry deletedTask = getModelObject();
        taskService.delete(deletedTask);
        send(this, Broadcast.BUBBLE, new TaskDeletedPayload(target, deletedTask));
    }
}
