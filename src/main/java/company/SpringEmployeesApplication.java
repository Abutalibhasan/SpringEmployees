package company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import company.beans.Department;
import company.beans.Employee;
import company.controller.BeanConfiguration;
import company.repository.EmployeeRepository;

@SpringBootApplication
public class SpringEmployeesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		
		SpringApplication.run(SpringEmployeesApplication.class, args);
	}
		
	@Autowired
	EmployeeRepository repo;
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub

			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			Employee emp = appContext.getBean("employee", Employee.class);
			emp.setEmpFirstname("Eiman");	
			emp.setEmpLastName("Albasha");
			repo.save(emp);
			Employee emp1 = new Employee(200,"Ali","Omer");
			Department d = new Department(11,"Employees");
			emp1.setDepartment(d);
			repo.save(emp1);
		
		System.out.println(emp.toString());
	}

}
