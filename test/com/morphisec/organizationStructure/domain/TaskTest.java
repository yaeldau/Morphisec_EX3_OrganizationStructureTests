package com.morphisec.organizationStructure.domain;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

public class TaskTest {

    Task simpleTask;
    Task timeTask;

    private LocalDateTime ldt;

    @Before
    public void setUp() throws Exception {
        ldt = LocalDateTime.of(2019, Month.JANUARY, 1, 10, 10, 30);

        simpleTask = new Task();
        timeTask = new Task("text", ldt);
    }

    @Test
    public void getTaskText() {
        assertEquals("text", timeTask.getTaskText());
    }

    @Test
    public void setTaskText() {
        simpleTask.setTaskText("text");
        assertEquals("text", simpleTask.getTaskText());
    }

    @Test
    public void getAssignedDate() {
        assertEquals(LocalDateTime.now(), timeTask.getAssignedDate());
    }

    @Test
    public void setAssignedDate() {
        LocalDateTime now = LocalDateTime.now();
        simpleTask.setAssignedDate(now);
        assertEquals(now, simpleTask.getAssignedDate());
    }

    @Test
    public void getDueDate() {
        assertEquals(ldt, timeTask.getDueDate());
    }

    @Test
    public void setDueDate() {
        simpleTask.setDueDate(ldt);
        assertEquals(ldt, simpleTask.getDueDate());
    }

    @Test
    public void isFinished() {
        assertEquals(false, timeTask.isFinished());
    }

    @Test
    public void setFinished() {
        timeTask.setFinished(true);
        assertEquals(true, timeTask.isFinished());
    }

    @Test
    public void finishTask() {
        timeTask.finishTask();
        assertEquals(true, timeTask.isFinished());
    }
}