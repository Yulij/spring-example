package by.academy.it.annotationconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.academy.it.annotationconfig.service.PersonService;
import by.academy.it.annotationconfig.utils.NoXmlConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {NoXmlConfiguration.class})
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    public void personTest() {
        Assert.assertEquals("Yuli", personService.getPersonName());
    }
}
