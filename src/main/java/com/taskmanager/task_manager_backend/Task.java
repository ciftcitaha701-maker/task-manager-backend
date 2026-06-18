package com.taskmanager.task_manager_backend;

public class Task {
    private int id;
    private String title;
    private String date;

    public Task() {}

    public Task(int id, String title, String date) {
        this.id = id;
        this.title = title;
        this.date = date;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
