package com.bridgelabz.EmployeePayRollApp.Controller;

import com.bridgelabz.EmployeePayRollApp.model.Employee;
import com.bridgelabz.EmployeePayRollApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeeRepository repository;

    // GET all employees
    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // GET employee by ID
    @GetMapping("/get/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return repository.findById(id);
    }

    // POST create new employee
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    // PUT update employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    // DELETE employee by ID
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
        return "Deleted employee with ID: " + id;
    }
}
