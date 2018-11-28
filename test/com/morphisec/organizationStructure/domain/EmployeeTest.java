package com.morphisec.organizationStructure.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee emptyEmp;
    Employee emp;

    @Before
    public void setUp() throws Exception {
        emptyEmp = new Employee();
        emp = new Employee("Yael", "Dauber");
    }

    @Test
    public void updateSalary() {
        emp.updateSalary();
    }

    @Test
    public void getPoints() {
        assertEquals(0, emp.getPoints());
    }

    @Test
    public void getTasks() {
        assertEquals(new ArrayList<Task>(), emp.getTasks());
    }

    @Test
    public void setTasks() {
        emp.setTasks(new ArrayList<>());
        assertEquals(new ArrayList<Task>(), emp.getTasks());
    }

    @Test
    public void addTask() {
        emp.addTask(new Task());
    }

    @Test
    public void finishAllTasks() {
        emp.finishAllTasks();
    }

}