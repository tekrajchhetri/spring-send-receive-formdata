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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
