package com.marsproject.employee.service;


import com.marsproject.employee.entity.EmployeeEntity;
import com.marsproject.employee.entity.ProjectEntity;
import com.marsproject.employee.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AllServices  {

    public List<EmployeeEntity> getEmployee();

    public List<ProjectEntity> getProjects();

    public Object signIn(UserModel userModel);
}
