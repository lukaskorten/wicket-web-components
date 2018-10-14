package de.korten.wicket.examples.webcomponents.todos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodosService {

    private static final Logger LOG = LoggerFactory.getLogger(TodosService.class);


    public void save(TodoEntry todoEntry) {

        todoEntry.setCreated(new Date());

        LOG.info("Neues Todo {}", todoEntry.getText());
    }

    public List<TodoEntry> findAll() {
        return new ArrayList<>();
    }

}
