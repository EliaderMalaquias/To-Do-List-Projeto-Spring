package com.GerenciadorDeTarefas.br.com.ToDoList.repositories;

import com.GerenciadorDeTarefas.br.com.ToDoList.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
