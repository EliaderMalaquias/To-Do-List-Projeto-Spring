package com.UnitTasks.ToDoList.controller;

import com.UnitTasks.ToDoList.dtos.request.UserRequestDTO;
import com.UnitTasks.ToDoList.dtos.response.UserResponseDTO;
import com.UnitTasks.ToDoList.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService service;

    @PostMapping
    public UserResponseDTO createUser(@RequestBody UserRequestDTO request) {
        return service.createUser(request);
    }

    @GetMapping
    public List<UserResponseDTO> getAllUsers() {
        return service.getAll();
    }

    @GetMapping(value = "/{id}")
    public UserResponseDTO getUserById(@PathVariable(value = "id") Long Id) {
        return service.getById(Id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable(value = "id") Long Id) {
        service.delete(Id);
    }
}
