package by.academy.it.annotationconfig.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import by.academy.it.annotationconfig.service.PersonService;

/**
 * Class Main
 *
 * Created by yslabko on 11/30/2016.
 */
@Component
public class Main {
    @Autowired
    private PersonService personService;
    public static void main(String [] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("by.academy.it.annotationconfig");

        Main main = ctx.getBean(Main.class);
        System.out.println("Name = " + main.personService.getPersonName());
    }
}
