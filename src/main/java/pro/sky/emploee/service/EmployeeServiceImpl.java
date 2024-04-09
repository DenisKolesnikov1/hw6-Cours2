package pro.sky.emploee.service;

import org.springframework.stereotype.Service;
import pro.sky.emploee.exception.ArrayIsFullException;
import pro.sky.emploee.exception.EmployeeAlreadyAddedException;
import pro.sky.emploee.exception.EmployeeNotFoundException;
import pro.sky.emploee.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final int COUNT_EMPLOYEE = 3;

    private List<Employee>employees = new ArrayList<>(COUNT_EMPLOYEE);

    @Override
    public Employee add(String firstName, String lastName) {
        if (employees.size() == COUNT_EMPLOYEE) {
            throw new ArrayIsFullException("ArrayIsFullException");
        }
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)){
            throw new EmployeeAlreadyAddedException();
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee newemployee = new Employee(firstName, lastName);
        for (Employee employee : employees) {
            if (employee.equals(newemployee)) ;
            return employee;
        }
        throw new EmployeeNotFoundException("EmployeeNotFoundException");
    }


    @Override
    public boolean delete(String firstName, String lastName) {
         Employee newemployee = new Employee(firstName, lastName);
         for (int i = 0; i < employees.size(); i++) {
             Employee employee = employees.get(i);
         if (employee.equals(newemployee)) {
             employees.remove(i);
         return true;
        }
    }
    return false;
}

    @Override
    public List<Employee> findAll() {
        return employees;
    }
}
