package co.com.ias.jpa.employee;

import co.com.ias.jpa.employee.entities.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<EmployeeEntity, Integer>, QueryByExampleExecutor<EmployeeEntity> {
}
