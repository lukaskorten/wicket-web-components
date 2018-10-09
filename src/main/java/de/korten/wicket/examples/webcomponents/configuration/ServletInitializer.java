package de.korten.wicket.examples.webcomponents.configuration;

import org.apache.wicket.protocol.http.WicketFilter;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class ServletInitializer implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        FilterRegistration registration = servletContext.addFilter("wicket-filter", WicketFilter.class);
        registration.setInitParameter("applicationClassName", WicketApplication.class.getName());
        registration.setInitParameter("filterMappingUrlPattern", "/*");
        registration.addMappingForUrlPatterns(null, false, "/*");

    }
}
