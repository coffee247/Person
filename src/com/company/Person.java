package com.company;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import static java.util.Objects.requireNonNullElse;

/**
 * Person implements Serializable because ...
 * Serialization is a mechanism of converting the state of an object into a byte stream.
 * so that it can be transmitted over the internet.
 * see https://www.javatpoint.com/q/1940/what-is-advantage-and-disadvantage-of-serialization
 * Person is abstract so that it can be extended by Manager, Donor, etc...
 */
public abstract class Person implements Serializable {
    private Integer ID = 0;
    private static int personCount = 0;
    private String firstName = "";
    private String middleName = "";
    private String lastName ="";
    private String email = "";
    private final LocalDate creationDate = LocalDate.now();
    private final LocalTime creationTime = LocalTime.now();
    private LocalDate lastModifiedDate;
    private LocalTime lastModifiedTime;
    private Sex sex;

    public Person(){
        this.ID = ++personCount;  // automatically increment ID
    }

    public Person(String firstName, String middleName, String lastName) {
        this();
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }

    public void setSex(Sex sex){
        this.sex = sex;
        setLastModified();
    }

    public Sex getSex(){
        return requireNonNullElse(this.sex, Sex.Un_Specified);
    }


    public void setFirstName(String firstName){
        if (!firstName.contentEquals("")){
            this.firstName = firstName;
            setLastModified();
        }
    }

    public void setEmailAddress(String email){
        this.email = email;
    }


    public void setMiddleName(String middleName){
        if(!middleName.contentEquals("")) {
            this.middleName = middleName;
            setLastModified();
        }
    }


    public void setLastName(String lastName){
        if(!lastName.contentEquals("")) {
            this.lastName = lastName;
            setLastModified();
        }
    }

    private void setLastModified()
    {
        this.lastModifiedDate = LocalDate.now();
        this.lastModifiedTime = LocalTime.now();
    }


    public void setFullName(String firstName, String middleName, String lastName){
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }

    public String getFirstName(){
    if(this.firstName.isEmpty()){
        return " ";
    }
    else{
        return this.firstName;
    }
    }

    public String getMiddleName(){
        if(this.middleName.isEmpty()){
            return " ";
        }
        else
        {
            return this.middleName;
        }
    }

    public String getLastName(){
        if(this.lastName.isEmpty()){
            return " ";
        }
        else return this.lastName;
    }

    public String getFullName() {
        String temp = getFirstName().trim() + " " + getMiddleName().trim() + " " + getLastName().trim();
        temp = temp.trim();
        temp = temp.replaceAll("\\s\\s", " ");
        if (temp.contentEquals("")) {
            return "*** Unknown person ***";
        } else {
            return temp;
        }
    }


    public String getEmail() {
        return email;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalTime getCreationTime(){
        return creationTime;
    }

    public Integer getID(){
        return this.ID;
    }

}
