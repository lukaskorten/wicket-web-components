package de.korten.wicket.examples.webcomponents.todos.create;

import de.korten.wicket.examples.webcomponents.todos.TodoEntry;
import de.korten.wicket.examples.webcomponents.todos.TodosService;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.event.Broadcast;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LambdaModel;
import org.apache.wicket.model.Model;

import javax.inject.Inject;

public class CreateTodoPanel extends GenericPanel<TodoEntry> {

    @Inject
    private TodosService todosService;

    public CreateTodoPanel(String id) {
        super(id, new Model<>(new TodoEntry()));

        setOutputMarkupId(true);

        Form<Void> form = new Form<>("form");

        IModel<String> textModel = LambdaModel.of(getModel(), TodoEntry::getText, TodoEntry::setText);
        TextField<String> todoInput = new TextField<>("todoInput", textModel);
        form.add(todoInput);

        AjaxButton submitButton = new AjaxButton("submitButton", form) {
            @Override
            protected void onSubmit(AjaxRequestTarget target) {
                super.onSubmit(target);
                todosService.save(CreateTodoPanel.this.getModelObject());
                target.add(CreateTodoPanel.this);
                send(this, Broadcast.BUBBLE, new TodoCreatedPayload(target));
            }
        };
        form.add(submitButton);

        add(form);
    }
}
