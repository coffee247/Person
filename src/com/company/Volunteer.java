package com.company;

public class Volunteer extends Person{
    private int volunteer_ID;
    static int lastVolunteer_ID = 0;

    public Volunteer(){
        lastVolunteer_ID++;
        this.volunteer_ID = lastVolunteer_ID;
    }

    public Volunteer(String firstName, String middleName, String lastName){
        this();  // Call default constructor
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }

    public int getVolunteer_ID()
    {
        return volunteer_ID;
    }


    // ADD code specific to Volunteers here.

}
