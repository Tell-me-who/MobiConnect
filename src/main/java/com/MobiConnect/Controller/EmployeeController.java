package com.MobiConnect.Controller;

import com.MobiConnect.Entity.Client;
import com.MobiConnect.Entity.Employee;
import com.MobiConnect.Repository.ClientRepository;
import com.MobiConnect.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("memployee")
    public List<Employee> getEmployee(){
        return this.employeeRepository.findAll();
    }

    @PostMapping("/addEmp")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeRepository.save(employee);
    }
}
