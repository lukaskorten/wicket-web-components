package de.korten.wicket.examples.webcomponents.todos.item;

import de.korten.wicket.examples.webcomponents.todos.TodoEntry;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LambdaModel;

import java.util.Date;

public class TodoListItemPanel extends GenericPanel<TodoEntry> {

    public TodoListItemPanel(String id, IModel<TodoEntry> todoEntry) {
        super(id, todoEntry);

        IModel<String> textModel = LambdaModel.of(todoEntry, TodoEntry::getText);
        IModel<Date> createdModel = LambdaModel.of(todoEntry, TodoEntry::getCreated);
        IModel<Date> completedModel = LambdaModel.of(todoEntry, TodoEntry::getCompleted);

        add(new Label("text", textModel));
        add(new Label("created", createdModel));
        add(new Label("completed", completedModel));

    }
}
