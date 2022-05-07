package com.ims.model;

public class User {
    private String firstname;
    private String lastname;
    private String email;
    private long mobilenumber;
    private String password;
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getMobilenumber() {
        return mobilenumber;
    }
    public void setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public User(String firstname, String lastname, long mobilenumber, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobilenumber = mobilenumber;
        this.password = password;
    }
    public User(){
        super();
    }
}
