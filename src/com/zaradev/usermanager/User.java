package com.zaradev.usermanager;

public class User {

    private String username;
    private String email;
    private int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
    	return username+" ("+email+")";
    }
}
