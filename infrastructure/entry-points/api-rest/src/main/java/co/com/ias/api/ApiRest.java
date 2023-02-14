package co.com.ias.api;

import co.com.ias.model.employee.Employee;
import co.com.ias.usecase.employee.EmployeeUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final EmployeeUseCase employeeUseCase;

    @PostMapping(path = "/create-employee")
    public ResponseEntity<Employee> createEmployee(Employee employee) {
        return ResponseEntity.ok(employeeUseCase.createEmployee(employee));
    }
}