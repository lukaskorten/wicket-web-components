package de.korten.wicket.examples.webcomponents.configuration;

import org.apache.wicket.protocol.http.WicketFilter;
import org.apache.wicket.spring.SpringWebApplicationFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;

@Configuration
public class ServletInitializer implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {

        FilterRegistration registration = servletContext.addFilter("wicket-filter", WicketFilter.class);
        registration.setInitParameter(WicketFilter.APP_FACT_PARAM, SpringWebApplicationFactory.class.getName());
        registration.setInitParameter("filterMappingUrlPattern", "/*");
        registration.addMappingForUrlPatterns(null, false, "/*");

    }
}
