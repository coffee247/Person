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

    @Override
    public void setEmailAddress(String email)
    {
        super.setEmailAddress(email);
    }

    @Override
    public String getEmail()
    {
        return super.getEmail();
    }

    public void setDepartment(String dept)
    {
        Department = dept;
    }

    public String getDepartment()
    {
        return Department;
    }

    public int getManagerID()
    {
        return manager_ID;
    }
        // ADD code specific to Managers here.

}

