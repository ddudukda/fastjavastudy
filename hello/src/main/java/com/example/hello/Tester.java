package com.example.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tester {

    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Tester(){
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public Tester(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Tester defaultTester(){
        return new Tester("default", 0,"default");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
