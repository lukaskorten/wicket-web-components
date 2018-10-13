package de.korten.wicket.examples.webcomponents.todos;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodosService {

    public void save(TodoEntry todoEntry) {

    }

    public List<TodoEntry> findAll() {
        return new ArrayList<>();
    }

}
