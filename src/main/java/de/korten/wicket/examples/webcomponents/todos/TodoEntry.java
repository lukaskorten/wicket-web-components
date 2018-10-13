package de.korten.wicket.examples.webcomponents.todos;


import java.io.Serializable;
import java.util.Date;

public class TodoEntry implements Serializable {

    private String text;
    private Date created;
    private Date completed;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCompleted() {
        return completed;
    }

    public void setCompleted(Date completed) {
        this.completed = completed;
    }
}
