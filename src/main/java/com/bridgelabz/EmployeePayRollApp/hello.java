package com.bridgelabz.EmployeePayRollApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/abhi")
    public String hello1() {
        return "Welcome to Employee Payroll App!";
    }
}
