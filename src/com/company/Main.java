package com.company;

import javax.lang.model.type.NullType;

public class Main {

    public static void main(String[] args) {
        PersonController personController = new PersonController();


// ***** Data entry / retrieval tests below this line ****


        // Making and listing sample Managers here
        for (int a = 1; a < 5; a++) {
            Manager myNewManager = new Manager("James"+a, "Michael", "Stallings");
            personController.AddManager(myNewManager);
            myNewManager.setEmailAddress("stallingsjm@mymail.vcu.edu");
            myNewManager.setDepartment("test Department" + a);
        }

        personController.Managers.forEach((k,v)->System.out.println("Person ID: " + k + " is Manager ID: "+v.getManagerID()+" who is known as "+
                v.getFullName()+" and has email address: "+v.getEmail() + " and is in Department: "+v.getDepartment()));



        //Making and listing sample Donors here
        for (int a = 1; a < 5; a++) {
            Donor myNewDonor = new Donor("Barry", "D.", "Stallings"+a);
            personController.AddDonors(myNewDonor);
        }

        // Getting more data from EACH Donor
        personController.Donors.forEach((k,v)->System.out.println("Person ID: " + k + " is Donor ID: "+v.getDonor_ID()+" who is known as "+
                v.getFullName()+" and has email address: "+v.getEmail()));


        Volunteer myNewVolunteer = new Volunteer(); // make an unknown (anonymous) volunteer
        myNewVolunteer.setEmailAddress("adumbadress@dummy.com");
        personController.AddVolunteer(myNewVolunteer);


        //Making and listing sample Volunteers here
        for (int a = 1; a < 5; a++) {
            myNewVolunteer = new Volunteer("Frederick", "R.", "Stallings");
            personController.AddVolunteer(myNewVolunteer);
        }

        // Print data from EACH Volunteer
        personController.Volunteers.forEach((k,v)->System.out.println("Person ID: " + k + " is Volunteer ID: "+v.getVolunteer_ID()+" who is known as "+
                v.getFullName()+" and has email address: "+v.getEmail()));
    }
}
