package com.GerenciadorDeTarefas.br.com.ToDoList.repositories;

import com.GerenciadorDeTarefas.br.com.ToDoList.entities.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long>{
}
