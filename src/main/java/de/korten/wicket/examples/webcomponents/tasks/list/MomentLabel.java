package de.korten.wicket.examples.webcomponents.tasks.list;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.GenericWebMarkupContainer;
import org.apache.wicket.model.IModel;

import java.time.LocalDateTime;

public class MomentLabel extends GenericWebMarkupContainer<LocalDateTime> {

    public MomentLabel(String id, IModel<LocalDateTime> model) {
        super(id, model);
    }

    @Override
    protected void onComponentTag(ComponentTag tag) {
        super.onComponentTag(tag);

        tag.setName("moment-label");
        tag.put("value", getModelObject().toString());
        tag.put("locale", getLocale().getCountry());
    }
}
