package com.example.EmployeePayRoll;

import com.example.EmployeePayRoll.model.Employee;
import com.example.EmployeePayRoll.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component  // Marks this as a startup component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public DataLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) {
        // Adding sample employees
        employeeRepository.save(new Employee(8l,"Riya", 58200));
        employeeRepository.save(new Employee(7l,"Rashi",85200));
    }
}