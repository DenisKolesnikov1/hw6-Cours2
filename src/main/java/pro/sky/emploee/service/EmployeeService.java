package pro.sky.emploee.service;

import pro.sky.emploee.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee add(String firstName, String lastName);
    Employee find(String firstName, String lastName);
    boolean delete(String firstName, String lastName);
    List<Employee> findAll();
}
