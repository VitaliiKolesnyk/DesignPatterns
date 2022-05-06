package patterns.structural.composite.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import patterns.structural.composite.employee.Employee;

import java.util.List;

@AllArgsConstructor
@Data
public abstract class Department {
    private String depName;
    List<Employee> employeeList;
    
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
