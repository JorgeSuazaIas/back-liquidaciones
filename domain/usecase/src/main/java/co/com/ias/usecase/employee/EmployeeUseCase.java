package co.com.ias.usecase.employee;

import co.com.ias.model.employee.Employee;
import co.com.ias.model.employee.gateways.EmployeeRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeUseCase {
    private final EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.saveEmployee(employee);
    }
}
