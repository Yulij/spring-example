package by.academy.it.dao;

import java.util.List;
import by.academy.it.entity.Employee;

public interface EmployeeDao extends Dao<Employee> {
    List<Employee> getEmployee();
}
