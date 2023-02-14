package co.com.ias.model.employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private int docNumber;
    private String startDate;
    private String position;
    private int salary;
}
