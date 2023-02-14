package co.com.ias.jpa.employee;

import co.com.ias.jpa.employee.entities.EmployeeEntity;
import co.com.ias.jpa.helper.AdapterOperations;
import co.com.ias.model.employee.Employee;
import co.com.ias.model.employee.gateways.EmployeeRepository;
import lombok.extern.log4j.Log4j2;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
public class JPARepositoryAdapter extends AdapterOperations<Employee, EmployeeEntity, Integer, JPARepository> implements EmployeeRepository {

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> {
            log.info("Model => {}", d);
            return mapper.mapBuilder(d, Employee.EmployeeBuilder.class).build();
        });
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }
}
