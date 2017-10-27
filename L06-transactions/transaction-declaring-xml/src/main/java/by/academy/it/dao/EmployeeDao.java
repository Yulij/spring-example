package by.academy.it.dao;

import by.academy.it.entity.Employee;

import java.util.List;

public interface EmployeeDao extends Dao<Employee> {
    List<Employee> getEmployee();
}
