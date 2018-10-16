package de.korten.wicket.examples.webcomponents.todos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private static final Logger LOG = LoggerFactory.getLogger(TaskService.class);

    @Autowired
    private TaskRepository taskRepository;

    public void save(TaskEntry taskEntry) {

        LOG.info("Neues Todo {}", taskEntry.getText());

        Task task = new Task();
        task.setText(taskEntry.getText());
        task.setCreated(LocalDate.now());

        taskRepository.save(task);
    }

    public List<TaskEntry> findAll() {
        return taskRepository.findAll().stream().map(this::mapToTaskEntry).collect(Collectors.toList());
    }

    private TaskEntry mapToTaskEntry(Task entity) {
        TaskEntry taskEntry = new TaskEntry();
        taskEntry.setText(entity.getText());
        taskEntry.setCreated(entity.getCreated());
        taskEntry.setCompleted(entity.getCompleted());

        return taskEntry;
    }

    @PostConstruct
    public void postConstruct() {
        LOG.info("TODOS SERVICE CONSTRUCTED!");
    }


}
