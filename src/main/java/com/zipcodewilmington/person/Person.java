package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    //these are instance variables. so any attributes or characteristics of the class are initialized first
    private String name;
    private int age;

    private double weight;

    private boolean areEarsPierced;

    private char sex;

    private String hairColor;

    private byte heightInches;

    //Here are ALL the constructors.... -.-
    public Person(String name, int age, double weight, boolean areEarsPierced, char sex, String hairColor, byte heightInches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.areEarsPierced = areEarsPierced;
        this.sex = sex;
        this.hairColor = hairColor;
        this.heightInches = heightInches;
    }

    /*public Person(int age) {
        this.age = age;
    }

    public Person (double weight){
        this.weight = weight;
    }


    public Person(String name, int age) {

    }*/

    public void setName(String name) {
    }

    public void setAge(int age) {
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
