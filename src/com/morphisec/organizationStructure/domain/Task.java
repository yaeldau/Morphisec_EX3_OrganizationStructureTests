package com.morphisec.organizationStructure.domain;

import java.time.LocalDateTime;

/**
 * Created by netali on 8/10/2017.
 */
public class Task {

    private String taskText;
    private LocalDateTime assignedDate;
    private LocalDateTime dueDate;
    private boolean isFinished;

    public Task() {
        this.isFinished = false;
        this.assignedDate = LocalDateTime.now();
    }

    public Task(String taskText, LocalDateTime dueDate) {
        this.taskText = taskText;
        this.dueDate = dueDate;
        this.isFinished = false;
        this.assignedDate = LocalDateTime.now();
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public LocalDateTime getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(LocalDateTime assignedDate) {
        this.assignedDate = assignedDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public void finishTask(){
        this.isFinished = true;
    }
}
