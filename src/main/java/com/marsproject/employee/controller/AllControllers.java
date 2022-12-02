package com.marsproject.employee.controller;

import com.marsproject.employee.entity.EmployeeEntity;
import com.marsproject.employee.entity.ProjectEntity;
import com.marsproject.employee.model.UserModel;
import com.marsproject.employee.service.AllServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AllControllers {

    @Autowired
    private AllServices services;

    @GetMapping("/employees")
    ResponseEntity<List<EmployeeEntity>> getEmp() {

        return new ResponseEntity<>(services.getEmployee(), HttpStatus.OK);
    }
    @GetMapping("/projects")
    ResponseEntity<List<ProjectEntity>> getProjects() {

        return new ResponseEntity<>(services.getProjects(),HttpStatus.OK);
    }

    @PostMapping("/login")
    ResponseEntity<Object> signIn(@RequestBody UserModel userModel) {

        if(userModel.getUsername()!=null && userModel.getPassword()!=null) {
            return new ResponseEntity<>(services.signIn(userModel), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
