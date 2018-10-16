package de.korten.wicket.examples.webcomponents;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.wicketstuff.annotation.scan.AnnotatedMountScanner;

@SpringBootApplication
public class TaskApplication extends WebApplication implements ApplicationContextAware {


    private ApplicationContext applicationContext;

    @Override
    public Class<? extends Page> getHomePage() {
        return TasksPage.class;
    }

    @Override
    protected void init() {
        super.init();

        getComponentInstantiationListeners().add(new SpringComponentInjector(this, applicationContext));

        AnnotatedMountScanner mountScanner = new AnnotatedMountScanner();
        mountScanner.scanPackage("de.korten.wicket.examples.webcomponents").mount(this);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
    }
}
