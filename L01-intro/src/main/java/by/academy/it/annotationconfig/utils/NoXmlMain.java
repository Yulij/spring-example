package by.academy.it.annotationconfig.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.stereotype.Component;

import by.academy.it.annotationconfig.service.PersonService;

/**
 * Class NoXmlMain
 *
 * Created by yslabko on 11/30/2016.
 */
@Component
public class NoXmlMain {
    @Autowired
    private PersonService personService;

    public static void main(String[] args) throws Exception {
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(NoXmlMain.class);
        applicationContext.register(NoXmlConfiguration.class);
        applicationContext.getEnvironment().getPropertySources().addLast(new SimpleCommandLinePropertySource(args));
        applicationContext.refresh();
        applicationContext.start();
        try {
            NoXmlMain noXmlMain = applicationContext.getBean(NoXmlMain.class);
            System.out.println("Name = " + noXmlMain.personService.getPersonName());
        } catch (Exception e) {
            //some handling
        } finally {
            applicationContext.close();
        }
    }
}
