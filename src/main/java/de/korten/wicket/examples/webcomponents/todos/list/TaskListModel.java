package de.korten.wicket.examples.webcomponents.todos.list;

import de.korten.wicket.examples.webcomponents.todos.TaskEntry;
import de.korten.wicket.examples.webcomponents.todos.TaskService;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;

import javax.inject.Inject;
import java.util.List;

public class TaskListModel extends LoadableDetachableModel<List<TaskEntry>> {

    @Inject
    private TaskService taskService;

    public TaskListModel() {
        Injector.get().inject(this);
    }

    @Override
    protected List<TaskEntry> load() {
        return taskService.findAll();
    }
}
