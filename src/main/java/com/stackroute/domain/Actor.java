package com.stackroute.domain;



public class Actor{
    private  String Name;
    private  String Gender;
    private int Age;

    public Actor(String name, String gender, int age) {
        Name = name;
        Gender = gender;
        Age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "Gender='" + Gender + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
