package patterns.structural.composite.company;

import patterns.structural.composite.employee.Employee;

import java.util.List;

public class SalesDepartment extends Department {

    public SalesDepartment(String depName, List<Employee> employeeList) {
        super(depName, employeeList);
    }

}
