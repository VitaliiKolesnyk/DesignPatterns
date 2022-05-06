package patterns.structural.composite.company;

import patterns.structural.composite.employee.Employee;

import java.util.List;

public class ItDepartment extends Department {

    public ItDepartment(String depName, List<Employee> employeeList) {
        super(depName, employeeList);
    }
}
