package com.marsproject.employee.service;


import com.marsproject.employee.entity.EmployeeEntity;
import com.marsproject.employee.entity.ProjectEntity;
import com.marsproject.employee.entity.UserEntity;
import com.marsproject.employee.model.Response;
import com.marsproject.employee.model.UserModel;
import com.marsproject.employee.repository.EmployeeRepo;
import com.marsproject.employee.repository.ProjectRepo;
import com.marsproject.employee.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllServicesImpl implements AllServices{


    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ProjectRepo projectRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<EmployeeEntity> getEmployee() {

        return employeeRepo.findAll();
    }

    @Override
    public List<ProjectEntity> getProjects() {
        return projectRepo.findAll();
    }

    @Override
    public Response signIn(UserModel userModel) {
        Response response = new Response();

        UserEntity ue = userRepo.findByUserName(userModel.getUsername());

        if (ue==null) {

            return null;
            /*response.setMessage("unsuccessful");
            response.setStatus("Bad-credentials");*/
        }
        else if(userModel.getUsername().equals(ue.getUserName()) && userModel.getPassword().equals(ue.getPassword()))
        {
            response.setMessage("successful");
            response.setStatus("ok");
        }

        return response;
    }
}
