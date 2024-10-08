package com.GerenciadorDeTarefas.br.com.ToDoList.controller;

import com.GerenciadorDeTarefas.br.com.ToDoList.entities.Task;
import com.GerenciadorDeTarefas.br.com.ToDoList.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTask() {
        return taskService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Task getTaskId(@PathVariable(value = "id") Long Id) {
        return taskService.getById(Id);
    }

}
