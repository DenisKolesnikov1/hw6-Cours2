package pro.sky.emploee;

import pro.sky.emploee.model.Employee;
import pro.sky.emploee.service.EmployeeService;
import pro.sky.emploee.service.EmployeeServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Petrov", "Ivan");
        Employee employee1 = new Employee("Novikov", "Oleg");

        Map<Employee, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(employee, "123");
        objectObjectHashMap.put(employee1, "456");
        System.out.println(objectObjectHashMap);

        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.add("Petrov", "Ivan");
        employeeService.add("rrr", "123");
        employeeService.add("vvv", "qq");

        employeeService.delete("rrr", "123");
        System.out.println(employeeService.findAll());

    }
}
