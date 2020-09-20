package com.rajkumar.spring.boot.controller;

import com.rajkumar.spring.boot.domain.Employee;
import com.rajkumar.spring.boot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/Users")
public class EmployeeController {

    @Autowired
    private EmployeeRepository userRepository;

    @GetMapping
    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        users.add("Rajkumar");
        users.add("Chidha");
        users.add("Meenal");

        return users;
    }
    @PostMapping
    public Employee createUser(@RequestBody Employee user) {
        System.out.println("user"+user);
        return userRepository.save(user);

    }
}
