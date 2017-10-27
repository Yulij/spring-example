package by.academy.it.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierLoader {

    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("qualifier-context.xml");
        _Person bean = (_Person) context.getBean("person");
        System.out.println(bean);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
