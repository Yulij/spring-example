package by.academy.it;

import by.academy.it.rest.entity.Employee;
import by.academy.it.services.impl.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-service.xml")
public class ServiceTest {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Test
    public void saveTest() {
        Employee e = new Employee();
        e.setFirstName("Yulij II");
        e.setLastName("Slabko");
        e = employeeService.add(e);

        Assert.assertEquals("Yulij II", employeeService.get(e.getId()).getFirstName());
    }
}
