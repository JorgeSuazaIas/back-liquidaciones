package co.com.ias.jpa.employee.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "tbl_employee")
public class EmployeeEntity {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ") //auto incrementable
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ") //serializar ID
    private Integer employeeId;
    @Column(name = "employee_name")
    private String name;
    @Column(name = "employee_docNumber")
    private int docNumber;
    @Column(name = "employee_startDate")
    private String startDate;
    @Column(name = "employee_position")
    private String position;
    @Column(name = "employee_salary")
    private int salary;
}
