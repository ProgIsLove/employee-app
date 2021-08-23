package tom.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tom.company.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeById(Long id);

}
