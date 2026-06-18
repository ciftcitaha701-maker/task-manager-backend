package com.taskmanager.task_manager_backend;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return tasks;
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task newTask) {
        newTask.setId(tasks.size() + 1);
        tasks.add(newTask);
        return newTask;
    }
}
