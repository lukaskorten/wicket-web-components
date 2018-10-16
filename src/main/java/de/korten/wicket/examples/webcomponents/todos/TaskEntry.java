package de.korten.wicket.examples.webcomponents.todos;


import java.io.Serializable;
import java.time.LocalDate;

public class TaskEntry implements Serializable {

    private Long id;
    private String text;
    private LocalDate created;
    private LocalDate completed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getCompleted() {
        return completed;
    }

    public void setCompleted(LocalDate completed) {
        this.completed = completed;
    }
}
