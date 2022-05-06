package patterns.structural.composite;

import patterns.structural.composite.company.Company;
import patterns.structural.composite.company.Department;
import patterns.structural.composite.company.ItDepartment;
import patterns.structural.composite.company.SalesDepartment;
import patterns.structural.composite.employee.Developer;
import patterns.structural.composite.employee.Employee;
import patterns.structural.composite.employee.SalesManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee salesManager = new SalesManager("Andrew", 10000); 
        Employee salesHead = new SalesManager("Anna", 11000);
        
        Employee javaDeveloper = new Developer("Jack", 15000);
        Employee pythonDeveloper = new Developer("Bob", 16000);
        
        Department salesDepartment = new SalesDepartment("Sales", List.of(salesHead, salesManager));
        Department itDepartment = new ItDepartment("IT", List.of(javaDeveloper, pythonDeveloper));
        
        Company company = new Company("MyCompany", List.of(salesDepartment, itDepartment));

        System.out.println(company.getTotalCompanySalary());
    }
}
