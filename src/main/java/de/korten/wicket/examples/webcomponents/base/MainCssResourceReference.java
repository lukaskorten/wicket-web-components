package de.korten.wicket.examples.webcomponents.base;

import org.apache.wicket.request.resource.ContextRelativeResourceReference;

public class MainCssResourceReference extends ContextRelativeResourceReference {

    private final static MainCssResourceReference INSTANCE = new MainCssResourceReference();

    private MainCssResourceReference() {
        super("css/main.css");
    }

    public static MainCssResourceReference get() {
        return INSTANCE;
    }
}
