package com.company;

public class Donor extends Person {
    private int donor_ID;
    static int lastDonor_ID = 0;

    public Donor()
    {
        lastDonor_ID++;
        this.donor_ID = lastDonor_ID;
    }

    public Donor(String firstName, String middleName, String lastName){
        this();  // Call default Constructor first
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }

    public int getDonor_ID()
    {
        return donor_ID;
    }

    // ADD code specific to Donors here.


}
