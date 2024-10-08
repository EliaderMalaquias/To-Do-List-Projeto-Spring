package com.GerenciadorDeTarefas.br.com.ToDoList.service;

import com.GerenciadorDeTarefas.br.com.ToDoList.entities.Task;
import com.GerenciadorDeTarefas.br.com.ToDoList.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public Task getById(Long Id) {
        return taskRepository.findById(Id).get();
    }

    public void delete(Long Id) {
        taskRepository.deleteById(Id);
    }
}
