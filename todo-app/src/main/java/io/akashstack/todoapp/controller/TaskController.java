package io.akashstack.todoapp.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.akashstack.todoapp.models.TaskModel;
import io.akashstack.todoapp.repo.Task;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/")
public class TaskController {
    @Autowired
    private Task taskRepo;

    //create Task
    @PostMapping(value="/task/create")
    public ResponseEntity<?> createEmp( @RequestParam("task_name") String task_name, @RequestParam("task_title") String task_title ) throws IOException {
        TaskModel task = new TaskModel(task_name, task_title);
        taskRepo.save(task);
        return new ResponseEntity<String>("Task created!", HttpStatus.CREATED);
    }
    
}
