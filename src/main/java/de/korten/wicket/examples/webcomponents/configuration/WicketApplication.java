package de.korten.wicket.examples.webcomponents.configuration;

import de.korten.wicket.examples.webcomponents.HomePage;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WicketApplication extends WebApplication {


    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

    @Override
    protected void init() {
        super.init();
    }
}
