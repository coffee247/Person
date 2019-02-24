package com.company;

public class Main {

    public static void main(String[] args) {
        PersonController personController = new PersonController();


// ***** Data entry / retrieval tests below this line ****


        // Making and listing sample Managers here
        for (int a = 1; a < 5; a++) {
            Manager myNewManager = new Manager("James", "M.", "Stallings");
            personController.AddManager(myNewManager);
            myNewManager.setEmailAddress("stallingsjm@mymail.vcu.edu");
        }

        personController.Managers.forEach((k,v)->System.out.println("Manager ID: "+k+" is "+v.getFullName()+" and has email address: "+v.getEmail()));





        //Making and listing sample Donors here
        for (int a = 1; a < 5; a++) {
            Donor myNewDonor = new Donor("Barry", "D.", "Stallings");
            personController.AddDonors(myNewDonor);
        }

        // Getting more data from EACH Donor
        // (CreationDate and CreationTime were set automatically in PersonClass Constructor.)
        personController.Donors.forEach((k,v)->System.out.println("Donor ID: "+k+" is "+v.getFullName()+". " +
                "The record was created on "+v.getCreationDate()+" at "+v.getCreationTime()));







        //Making and listing sample Volunteers here
        for (int a = 1; a < 5; a++) {
            Volunteer myNewVolunteer = new Volunteer("Frederick", "R.", "Stallings");
            personController.AddVolunteer(myNewVolunteer);
        }

        personController.Volunteers.forEach((k,v)->System.out.println("Volunteer ID: "+k+" is "+v.getFullName()));


    }
}
