package com.morphisec.organizationStructure.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by netali on 8/10/2017.
 */
public class Employee extends BaseEmployee {

    private List<Task> tasks;

    public Employee() {
        super();
        this.tasks = new ArrayList<>();
    }

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.tasks = new ArrayList<>();
    }

    @Override
    public void updateSalary() {
        long finishedTasksCount = tasks.stream().filter(Task::isFinished).count();
        setSalary(finishedTasksCount * 100);
        System.out.println(getFirstName() + " " + getLastName() + " : " + getSalary() + "$");
    }

    @Override
    public long getPoints() {
        return tasks.stream().filter(Task::isFinished).count() * 120;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void finishAllTasks() {
        tasks.forEach(t -> t.setFinished(true));
    }

}
