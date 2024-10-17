package com.UnitTasks.ToDoList.model;

import com.UnitTasks.ToDoList.dtos.request.UserRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    @Temporal(TemporalType.DATE)
    private Date createdIn = new Date();

    public User(UserRequestDTO request) {
        username = request.getUsername();
        email = request.getEmail();
        password = request.getPassword();
    }
}
