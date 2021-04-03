package company.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import company.beans.Department;
import company.beans.Employee;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 20, 2021
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	Employee employee() {
		Employee bean = new Employee("Abutalib","Hasan");
		return bean;
	}
	
	@Bean 
	Department department() {
		Department bean = new Department(1,"Employee");
		return bean;
	}
}
