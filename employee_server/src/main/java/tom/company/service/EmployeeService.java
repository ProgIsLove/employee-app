package tom.company.service;

import tom.company.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> findAllEmployees();

    Employee update(Employee employee);

    Employee findEmployeeById(Long id);

    void delete(Long id);
}
