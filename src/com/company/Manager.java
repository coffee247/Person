package com.company;

public class Manager extends Person {
    private String Department = "";
    private int manager_ID;
    static int lastManager_ID = 0;

    public Manager(){
        lastManager_ID++;
        manager_ID = lastManager_ID;
    }

    public Manager(String firstName, String middleName, String lastName){
        this();
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);

    }

    public String getDepartment() {
        return Department;
    }

    public int getManager_ID() {
        return manager_ID;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}

