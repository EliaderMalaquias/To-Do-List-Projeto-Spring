package com.GerenciadorDeTarefas.br.com.ToDoList.controller;

import com.GerenciadorDeTarefas.br.com.ToDoList.entities.Comments;
import com.GerenciadorDeTarefas.br.com.ToDoList.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @GetMapping(value = "/{id}")
    public Comments getCommentsId(@PathVariable(value = "id") Long Id) {
        return commentsService.getById(Id);
    }

    @GetMapping
    public List<Comments> getAllComments() {
        return commentsService.getAll();
    }
}
