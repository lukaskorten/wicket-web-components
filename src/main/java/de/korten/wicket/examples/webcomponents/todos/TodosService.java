package de.korten.wicket.examples.webcomponents.todos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodosService {

    private final static Logger LOGGER = LoggerFactory.getLogger(TodosService.class);

    public void save(TodoEntry todoEntry) {
        LOGGER.info("Todo gespeichert: ", todoEntry.getText());
    }

    public List<TodoEntry> findAll() {
        return new ArrayList<>();
    }

}
