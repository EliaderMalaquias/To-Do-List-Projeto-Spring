package com.GerenciadorDeTarefas.br.com.ToDoList.repositories;

import com.GerenciadorDeTarefas.br.com.ToDoList.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
