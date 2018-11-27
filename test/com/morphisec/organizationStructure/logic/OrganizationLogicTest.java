package com.morphisec.organizationStructure.logic;

import com.morphisec.organizationStructure.domain.BaseEmployee;
import com.morphisec.organizationStructure.domain.Employee;
import com.morphisec.organizationStructure.domain.Manager;
import com.morphisec.organizationStructure.domain.Task;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OrganizationLogicTest {

    OrganizationLogic ol;

    LocalDateTime ldt;

    @Before
    public void setUp() throws Exception {
        ol = new OrganizationLogic();

        ldt = LocalDateTime.of(2019, Month.JANUARY, 1, 10, 10, 30);
    }

    @Test
    public void defineEmployeesSalary_noTasks() {
        List<BaseEmployee> emps = new ArrayList<>();
        BaseEmployee emp1 = new Employee();
        emps.add(emp1);
        ol.defineEmployeesSalary(emps);

        assertEquals(0, (long)emp1.getSalary());
    }

    @Test
    public void defineEmployeesSalary_employeeTask() {
        List<BaseEmployee> emps = new ArrayList<>();
        // emp1
        BaseEmployee emp1 = new Employee();
        ((Employee) emp1).addTask(new Task());
        ((Employee) emp1).finishAllTasks();
        emps.add(emp1);

        // emp2
        BaseEmployee emp2 = new Employee("Yael", "Dauber");
        ((Employee) emp2).addTask(new Task());
        ((Employee) emp2).finishAllTasks();
        emps.add(emp2);

        ol.defineEmployeesSalary(emps);

        for (BaseEmployee e: emps) {
            assertEquals(100, (long)e.getSalary());
        }
    }

    @Test
    public void defineEmployeesSalary_manager() {
        List<BaseEmployee> emps = new ArrayList<>();

        BaseEmployee emp1 = new Employee("Yael1", "Dauber");
        BaseEmployee emp2 = new Employee("Yael2", "Dauber");
        ((Employee) emp1).addTask(new Task());
        ((Employee) emp2).addTask(new Task());
        ((Employee) emp1).finishAllTasks();
        ((Employee) emp2).finishAllTasks();
        emps.add(emp1);
        emps.add(emp2);

        BaseEmployee manager = new Manager();
        ((Manager) manager).addSubordinate(emp1);
        ((Manager) manager).addSubordinate(emp2);
        emps.add(manager);

        ol.defineEmployeesSalary(emps);

        assertEquals(120*2, (long)manager.getSalary());
    }

    @Test
    public void assignTask() {
        BaseEmployee emp1 = new Employee("Yael1", "Dauber");
        ol.assignTask("text", ldt, (Employee)emp1);
    }
}