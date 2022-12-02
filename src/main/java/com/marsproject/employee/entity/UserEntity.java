package com.marsproject.employee.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name="user_name")
    private String userName;

    @Column(name="user_password")
    private String password;

    @Column(name ="created_date",nullable = false,updatable = false)
    @CreationTimestamp
    private Timestamp createdTime;

    @Column(name = "updated_date")
    @UpdateTimestamp
    private Timestamp updatedTime;

    @Column(name = "last_logged", nullable = false,updatable = true)
    @CreationTimestamp
    private Timestamp lastLoggedTime ;

}
