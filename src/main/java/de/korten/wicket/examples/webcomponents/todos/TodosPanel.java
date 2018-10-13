package de.korten.wicket.examples.webcomponents.todos;

import de.korten.wicket.examples.webcomponents.todos.create.CreateTodoPanel;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.util.ListModel;

import java.util.ArrayList;
import java.util.List;

public class TodosPanel extends GenericPanel<List<TodoEntry>> {

    public TodosPanel(String id) {
        super(id, new ListModel<>(new ArrayList<>()));
        add(new CreateTodoPanel("createTodoPanel"));
    }
}
