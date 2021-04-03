package company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import company.beans.Employee;
import company.repository.EmployeeRepository;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 30, 2021
 */
@Controller
public class WebController {
	
	@Autowired
	EmployeeRepository repo;
	
	@GetMapping("viewAll")
	public String viewAllEmloyees(Model model) {
		model.addAttribute("emp", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputEmployee")
	public String addNewContact(Model model) {
		//Contact c = new Contact();
		Employee e = new Employee();
		model.addAttribute("newEmp", e);
		return "input";
	}

	@PostMapping("/inputEmployee")
	public String addNewEmployee(@ModelAttribute Employee e, Model model) {
		repo.save(e);
		return viewAllEmloyees(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateEmpoyee(@PathVariable("id") long id,Model model) {
	Employee e = repo.findById(id).orElse(null);
	model.addAttribute("newEmp", e);
	return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseContact(Employee e, Model model) {
	repo.save(e);
	return viewAllEmloyees(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
	Employee e = repo.findById(id).orElse(null);
	repo.delete(e);
	return viewAllEmloyees(model);
	}

}