package com.UnitTasks.ToDoList.service;

import com.UnitTasks.ToDoList.model.User;
import com.UnitTasks.ToDoList.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository repository;

    public void save(User user) {
        repository.save(user);
    }
}
