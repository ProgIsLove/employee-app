package tom.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tom.company.exception.UserNotFoundException;
import tom.company.model.Employee;
import tom.company.repository.EmployeeRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
                           .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found."));
    }

    @Override
    public void delete(Long id) {
        employeeRepo.deleteById(id);
    }
}
