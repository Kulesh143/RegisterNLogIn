package com.kulesh.myapplicationregister;

import java.util.ArrayList;

public class User {
    public static ArrayList<User>userslist=new ArrayList<User>();
    private String name;
    private String password;
    private String mobile;
    private String email;
    private String gender;

    public User(String name, String password, String mobile, String email, String gender) {
        this.name = name;
        this.password = password;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
