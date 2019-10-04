package com.stackroute.domain;



public class Actor{
    private  String Name;
    private  String Gender;
    private int Age;

    public Actor(String Name, String Gender, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
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
