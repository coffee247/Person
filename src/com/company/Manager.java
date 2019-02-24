package com.company;

public class Manager extends Volunteer {

    public Manager(){

    }

    public Manager(String firstName, String middleName, String lastName){
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }

    @Override
    public void setEmailAddress(String email) {
        super.setEmailAddress(email);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }
    // ADD code specific to Managers here.

}

