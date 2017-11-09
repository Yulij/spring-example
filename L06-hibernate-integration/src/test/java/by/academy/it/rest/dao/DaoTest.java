package by.academy.it.rest.dao;

import by.academy.it.rest.entity.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-dao.xml")
public class DaoTest {
    @PersistenceContext(name = "entityManagerFactory")
    EntityManager em;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void saveTest() {
        Employee e = new Employee();
        e.setFirstName("Yuli");
        e.setLastName("Slabko");
        e = employeeDao.add(e);
        em.clear();
        Assert.assertEquals("Yuli", employeeDao.get(e.getId()).getFirstName());
    }
}
