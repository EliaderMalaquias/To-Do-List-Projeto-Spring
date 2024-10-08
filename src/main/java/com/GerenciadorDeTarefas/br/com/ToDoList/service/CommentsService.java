package com.GerenciadorDeTarefas.br.com.ToDoList.service;

import com.GerenciadorDeTarefas.br.com.ToDoList.entities.Comments;
import com.GerenciadorDeTarefas.br.com.ToDoList.repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {

    @Autowired
    private CommentsRepository commentsRepository;

    public Comments saveComments(Comments comments) {
        return commentsRepository.save(comments);
    }

    public List<Comments> getAll() {
        return commentsRepository.findAll();
    }

    public Comments getById(Long Id) {
        return commentsRepository.findById(Id).get();
    }

    public void delete(Long Id) {
        commentsRepository.deleteById(Id);
    }
}
