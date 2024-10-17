package com.UnitTasks.ToDoList.controller;

import com.UnitTasks.ToDoList.dtos.request.UserRequestDTO;
import com.UnitTasks.ToDoList.dtos.response.UserResponseDTO;
import com.UnitTasks.ToDoList.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService service;

    public UserResponseDTO createUser(@RequestBody UserRequestDTO request) {

    }
}
