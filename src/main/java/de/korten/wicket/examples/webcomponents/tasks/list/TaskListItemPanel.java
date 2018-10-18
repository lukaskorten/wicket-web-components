package de.korten.wicket.examples.webcomponents.tasks.list;

import de.korten.wicket.examples.webcomponents.tasks.TaskEntry;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LambdaModel;

import java.time.LocalDate;

public class TaskListItemPanel extends GenericPanel<TaskEntry> {

    public TaskListItemPanel(String id, IModel<TaskEntry> todoEntry) {
        super(id, todoEntry);

        IModel<String> textModel = LambdaModel.of(todoEntry, TaskEntry::getText);
        IModel<LocalDate> createdModel = LambdaModel.of(todoEntry, TaskEntry::getCreated);
        IModel<LocalDate> completedModel = LambdaModel.of(todoEntry, TaskEntry::getCompleted);

        add(new Label("text", textModel));
        add(new Label("created", createdModel));
        add(new Label("completed", completedModel));

    }
}
