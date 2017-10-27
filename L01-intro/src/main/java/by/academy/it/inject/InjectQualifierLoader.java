package by.academy.it.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yslabko on 02/16/2016.
 */
public class InjectQualifierLoader {

    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("inject-qualifier-context.xml");
        _Person bean = (_Person) context.getBean("person");
        System.out.println("Address:" + bean.getAddresses());
        for (IAddress address: bean.getAddresses()) {
            System.out.println(address.toString());
        }
        System.out.println(bean);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
