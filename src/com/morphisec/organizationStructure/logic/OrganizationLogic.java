package com.morphisec.organizationStructure.logic;

import com.morphisec.organizationStructure.domain.BaseEmployee;
import com.morphisec.organizationStructure.domain.Employee;
import com.morphisec.organizationStructure.domain.Task;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by netali on 8/10/2017.
 */
public class OrganizationLogic {

    public void defineEmployeesSalary(List<BaseEmployee> emps) {
        emps.forEach(BaseEmployee::updateSalary);
    }

    public void assignTask (String taskDescription, LocalDateTime dueDate, Employee employee) {
        Task task = new Task(taskDescription,dueDate);
        employee.addTask(task);
    }

}
