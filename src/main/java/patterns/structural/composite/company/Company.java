package patterns.structural.composite.company;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Company {
    private String name;
    private List<Department> departments;
    
    public int getTotalCompanySalary() {
        return departments.stream()
                .flatMap(dep -> dep.employeeList.stream())
                .mapToInt(employee -> employee.getSalary())
                .sum();
    }
}
