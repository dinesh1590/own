package com.marsproject.employee.repository;

import com.marsproject.employee.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,String> {


public UserEntity findByUserName(String name);
}
