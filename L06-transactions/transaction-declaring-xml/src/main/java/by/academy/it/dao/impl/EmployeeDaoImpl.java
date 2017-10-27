package by.academy.it.dao.impl;

import by.academy.it.dao.EmployeeDao;
import by.academy.it.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl extends BaseDao<Employee> implements EmployeeDao {
    public EmployeeDaoImpl() {
        super();
        clazz = Employee.class;
    }

    @Override
    public List<Employee> getEmployee() {
        return getEm().createQuery("from Employee").getResultList();
    }
}
