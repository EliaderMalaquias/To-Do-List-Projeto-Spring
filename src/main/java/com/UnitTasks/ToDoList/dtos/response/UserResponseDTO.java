package com.UnitTasks.ToDoList.dtos.response;

import com.UnitTasks.ToDoList.model.User;

import java.util.Date;

public record UserResponseDTO(Long id,
                              String username,
                              String email,
                              Date createdIn) {

    public UserResponseDTO(User user) {
        this(user.getId(), user.getUsername(), user.getEmail(), user.getCreatedIn());
    }
}
