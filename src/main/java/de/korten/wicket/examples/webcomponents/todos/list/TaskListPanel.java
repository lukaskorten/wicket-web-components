package de.korten.wicket.examples.webcomponents.todos.list;

import de.korten.wicket.examples.webcomponents.todos.TaskEntry;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.GenericPanel;

import java.util.List;

public class TaskListPanel extends GenericPanel<List<TaskEntry>> {

    public TaskListPanel(String id) {
        super(id, new TaskListModel());
        setOutputMarkupId(true);

        add(new ListView<TaskEntry>("tasks", getModel()) {
            @Override
            protected void populateItem(ListItem<TaskEntry> item) {

                item.add(new TaskListItemPanel("task", item.getModel()));

            }
        });
    }
}
