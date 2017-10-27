package by.academy.it.inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Class InjectTest
 *
 * Created by yslabko on 10/25/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/inject-qualifier-context.xml")
public class InjectTest {
    @Autowired
    _Person person;

    @Test
    public void testInject() {
        person.getAddresses().forEach(System.out::println);
        person.initAddresses();
        person.getAddresses().forEach(System.out::println);
    }
}
