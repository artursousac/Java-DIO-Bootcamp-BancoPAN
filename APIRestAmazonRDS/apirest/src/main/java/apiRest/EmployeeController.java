package apiRest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	private final EmployeeRepository repository;
	
	public EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/employees")
	public List<Employee> listOfEmployeeAll(){
		return repository.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee Employee(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
	}
	
	@PostMapping("/employees")
	public Employee newEmployee(@RequestBody Employee newEmployee) {
		return repository.save(newEmployee);
	}
	
	 @PutMapping("/employees/{id}")
	    Employee replaceEmployee(@RequestBody Employee newEmployee, long id){
	        return repository.findById(id).map(employee -> {
	            employee.setName(newEmployee.getName());
	            employee.setAddress(newEmployee.getAddress());
	            employee.setRole(newEmployee.getRole());
	            return repository.save(newEmployee);
	        }).orElseGet(() -> {
	            newEmployee.setId(id);
	            return repository.save(newEmployee);
	        });
	    }

	    @DeleteMapping("/employees/{id}")
	    void deleteEmployee(@PathVariable long id){
	        repository.deleteById(id);
	    }
}
