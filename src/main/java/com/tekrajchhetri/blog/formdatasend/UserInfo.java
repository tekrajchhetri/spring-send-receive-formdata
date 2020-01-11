package com.tekrajchhetri.blog.formdatasend;

public class UserInfo {
    private String email;
    private int age;
    private boolean employed;
    private String gender;

    //empty constructor
    public UserInfo(){}

    public UserInfo(String email, int age, boolean employed, String gender) {
        this.email = email;
        this.age = age;
        this.employed = employed;
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
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
