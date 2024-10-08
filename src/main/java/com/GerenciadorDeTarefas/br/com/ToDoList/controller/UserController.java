package com.GerenciadorDeTarefas.br.com.ToDoList.controller;

import com.GerenciadorDeTarefas.br.com.ToDoList.entities.User;
import com.GerenciadorDeTarefas.br.com.ToDoList.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping(value = "/{id}")
    public User getUserId(@PathVariable(value = "id") Long Id) {
        return userService.getById(Id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @DeleteMapping
    public void deleteUser(Long Id) {
        userService.delete(Id);
    }
}
