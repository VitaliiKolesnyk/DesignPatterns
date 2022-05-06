package patterns.structural.composite.employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Employee {
    private String name;
    private int salary;
}
