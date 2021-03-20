package company.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 20, 2021
 */
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;
	private String empFirstname;
	private String empLastName;
	@Autowired
	private Department department;

	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	/**
	 * @param empFirstname
	 * @param empLastName
	 */
	public Employee(String empFirstname, String empLastName) {
		super();
		this.empFirstname = empFirstname;
		this.empLastName = empLastName;
	}
	/**
	 * @param empId
	 * @param empFirstname
	 * @param empLastName
	 */
	public Employee(long empId, String empFirstname, String empLastName) {
		super();
		this.empId = empId;
		this.empFirstname = empFirstname;
		this.empLastName = empLastName;
	}
	
	/**
	 * @return the empId
	 */
	public long getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	/**
	 * @return the empFirstname
	 */
	public String getEmpFirstname() {
		return empFirstname;
	}
	/**
	 * @param empFirstname the empFirstname to set
	 */
	public void setEmpFirstname(String empFirstname) {
		this.empFirstname = empFirstname;
	}
	/**
	 * @return the empLastName
	 */
	public String getEmpLastName() {
		return empLastName;
	}
	/**
	 * @param empLastName the empLastName to set
	 */
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstname=" + empFirstname + ", empLastName=" + empLastName
				+ ", department=" + department + "]";
	}
	

	

}
