package company.beans;

import javax.persistence.Embeddable;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 20, 2021
 */
@Embeddable
public class Department {
	private int deptNo;
	private String deptName;
	/**
	 * 
	 */
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param deptNo
	 */
	public Department(int deptNo) {
		super();
		this.deptNo = deptNo;
	}
	/**
	 * @param deptName
	 */
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
	/**
	 * @param deptNo
	 * @param deptName
	 */
	public Department(int deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
	}
	/**
	 * @return the deptNo
	 */
	public int getDeptNo() {
		return deptNo;
	}
	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
	
	

}
