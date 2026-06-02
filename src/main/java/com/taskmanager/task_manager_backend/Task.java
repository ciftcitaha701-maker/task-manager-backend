package com.taskmanager.task_manager_backend;

public class Task {
    private int id;
    private String title;
    private String date;

    // Konstruktor (um später Aufgaben zu erstellen)
    public Task(int id, String title, String date) {
        this.id = id;
        this.title = title;
        this.date = date;
    }

    // Getter (Spring Boot braucht diese, um die Daten später in JSON umzuwandeln)
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDate() { return date; }
}