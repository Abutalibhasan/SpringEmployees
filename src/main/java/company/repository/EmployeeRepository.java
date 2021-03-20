package company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import company.beans.Employee;
import company.beans.*;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 20, 2021
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	void save(Department d);

}
