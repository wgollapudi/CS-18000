/**
 *Simple User class
 *
 *Purdue University -- CS18000 -- Fall 2023 -- Homework 06 -- Walkthrough
 *
 *@author Walker Gollapudi
 *@version September 25, 2023
 */

public class User {
    private String name;
    private int age;
    private String username;
    private String password;

    public User(String name, int age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
