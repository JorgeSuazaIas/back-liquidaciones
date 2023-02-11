package co.com.ias.domain.model.employee.dto;

import co.com.ias.domain.model.employee.*;

public class EmployeeDTO {
    private Name name;
    private Id id;
    private Position position;
    private Salary salary;
    private StartDate startDate;

    public EmployeeDTO(Name name, Id id, Position position, Salary salary, StartDate startDate) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.startDate = startDate;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public void setStartDate(StartDate startDate) {
        this.startDate = startDate;
    }

    public Employee toDomain(EmployeeDTO employeeDTO){
        return new Employee(
                new Name(employeeDTO.getName()),
                new Id(employeeDTO.getId()),
                new Position(employeeDTO.getPosition()),
                new Salary(employeeDTO.getSalary()),
                new StartDate(employeeDTO.getStartDate())
        );
    }

    public static EmployeeDTO fromDomain(Employee employee){

    }
}
