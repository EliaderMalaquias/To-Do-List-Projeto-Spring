package com.UnitTasks.ToDoList.service;

import com.UnitTasks.ToDoList.dtos.request.UserRequestDTO;
import com.UnitTasks.ToDoList.dtos.response.UserResponseDTO;
import com.UnitTasks.ToDoList.model.User;
import com.UnitTasks.ToDoList.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository repository;

    public void save(User user) {
        repository.save(user);
    }

    public UserResponseDTO createUser(UserRequestDTO request) {
        User user = new User(request);
        save(user);

        return new UserResponseDTO(user);
    }
}
