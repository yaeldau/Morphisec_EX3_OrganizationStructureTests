package com.morphisec.organizationStructure.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by netali on 8/10/2017.
 */
public class Manager extends BaseEmployee{

    private List<BaseEmployee> subordinates;

    public Manager() {
        super();
        subordinates = new ArrayList<>();
    }

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
        subordinates = new ArrayList<>();
    }

    @Override
    public void updateSalary() {
        final long[] salary = {0};
        subordinates.forEach(e -> salary[0] = salary[0] + e.getPoints());
        setSalary(salary[0]);
        System.out.println(getFirstName() + " " + getLastName() + " : " + getSalary() + "$");
    }

    @Override
    public long getPoints() {
        return 1000;
    }

    public List<BaseEmployee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<BaseEmployee> subordinates) {
        this.subordinates = subordinates;
    }

    public void addSubordinate(BaseEmployee subordinate) {
        this.subordinates.add(subordinate);
    }
}
