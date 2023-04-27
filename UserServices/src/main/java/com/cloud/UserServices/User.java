package com.cloud.UserServices;

public class User {
    private String userId;
    private String lastname;
    private String firstname;

    public User(String userId, String lastname, String firstname) {
        this.userId = userId;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
