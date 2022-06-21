package io.akashstack.todoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.akashstack.todoapp.models.TaskModel;

public interface Task extends JpaRepository<TaskModel, Integer>{
    
}
