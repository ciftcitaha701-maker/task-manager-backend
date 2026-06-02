package com.taskmanager.task_manager_backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Löst das CORS-Problem
public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        // Hier geben wir unsere "fiktive" Liste zurück
        return Arrays.asList(
            new Task(1, "Vue.js Grundlagen lernen", "2026-05-10"),
            new Task(2, "Milestone 2 abgeben", "2026-05-15"),
            new Task(3, "Das Wochenende genießen", "2026-05-09")
        );
    }
}