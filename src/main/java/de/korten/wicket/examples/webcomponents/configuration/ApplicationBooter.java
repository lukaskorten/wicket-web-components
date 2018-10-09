package de.korten.wicket.examples.webcomponents.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("de.korten.wicket.examples.webcomponents")
public class ApplicationBooter {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBooter.class, args);
    }

}
