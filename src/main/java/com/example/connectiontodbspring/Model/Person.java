package com.example.connectiontodbspring.Model;

public class Person {

    // FIELDS -----------------------------------------------------------
    private int id;
    private String firstName;
    private String lastName;


    // CONSTRUCTOR ----------------------------------------------------------

    public Person(){

    }
    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // GETTERS ----------------------------------
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
