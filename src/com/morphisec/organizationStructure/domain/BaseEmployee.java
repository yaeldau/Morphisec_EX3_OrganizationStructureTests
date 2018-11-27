package com.morphisec.organizationStructure.domain;

/**
 * Created by netali on 8/10/2017.
 */
public abstract class BaseEmployee {

    private String firstName;
    private String lastName;
    private String id;
    private Long salary;

    public BaseEmployee() {
    }

    public BaseEmployee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void updateSalary();

    public abstract long getPoints();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
