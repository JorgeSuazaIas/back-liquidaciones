package co.com.ias.model.employee.gateways;

import co.com.ias.model.employee.Employee;

public interface EmployeeRepository {
    Employee saveEmployee(Employee employee);
}
