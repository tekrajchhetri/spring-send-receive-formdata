package com.tekrajchhetri.blog.formdatasend;

public class UserInfo {
    private String email;
    private int age;
    private boolean isEmployed;
    private String gender;

    //empty constructor
    public UserInfo(){}

    public UserInfo(String email, int age, boolean isEmployed, String gender) {
        this.email = email;
        this.age = age;
        this.isEmployed = isEmployed;
        this.gender = gender;
    }
}
