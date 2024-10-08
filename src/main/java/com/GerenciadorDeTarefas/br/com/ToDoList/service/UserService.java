package com.GerenciadorDeTarefas.br.com.ToDoList.service;

import com.GerenciadorDeTarefas.br.com.ToDoList.entities.User;
import com.GerenciadorDeTarefas.br.com.ToDoList.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(Long Id) {
        return userRepository.findById(Id).get();
    }

    public void delete(Long Id) {
        userRepository.deleteById(Id);
    }
}
