package test.mechtatell.employeeManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import test.mechtatell.employeeManager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
