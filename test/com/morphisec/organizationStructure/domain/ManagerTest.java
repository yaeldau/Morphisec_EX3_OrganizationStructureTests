package com.morphisec.organizationStructure.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager emptyManager;
    Manager manager;

    @Before
    public void setUp() throws Exception {
        emptyManager = new Manager();
        manager = new Manager("Yael", "Dauber");
    }

    @Test
    public void updateSalary() {
        manager.updateSalary();
    }

    @Test
    public void getPoints() {
        assertEquals(1000, manager.getPoints());
    }

    @Test
    public void getSubordinates() {
        assertEquals(new ArrayList<>(), manager.getSubordinates());
    }

    @Test
    public void setSubordinates() {
        BaseEmployee emp = new Employee();
        List<BaseEmployee> emps = new ArrayList<>();
        emps.add(emp);
        manager.setSubordinates(emps);
        assertEquals(emps, manager.getSubordinates());
    }

    @Test
    public void addSubordinate() {
        BaseEmployee emp = new Employee();
        manager.addSubordinate(emp);
    }
}