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


        //Making and listing sample Donors here
        for (int a = 1; a < 5; a++) {
            Donor myNewDonor = new Donor("Barry", "D.", "Stallings"+a);
            personController.AddDonors(myNewDonor);
        }



        Volunteer myNewVolunteer = new Volunteer(); // make an unknown (anonymous) volunteer
        myNewVolunteer.setEmailAddress("adumbadress@dummy.com");
        personController.AddVolunteer(myNewVolunteer);


        //Making and listing sample Volunteers here
        for (int a = 1; a < 5; a++) {
            myNewVolunteer = new Volunteer("Frederick", "R.", "Stallings");
            personController.AddVolunteer(myNewVolunteer);
        }

    }
}
