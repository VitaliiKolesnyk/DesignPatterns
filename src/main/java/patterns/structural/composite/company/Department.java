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
}
