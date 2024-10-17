package com.UnitTasks.ToDoList.dtos.request;

import lombok.Data;

@Data
public class UserRequestDTO {

    private String username;
    private String email;
    private String password;
}
