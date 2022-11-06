package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    //these are instance variables. so any attributes or characteristics of the class are initialized first
    private String name;
    private Integer age;

    private double weight;

    private boolean areEarsPierced;

    private char sex;

    private String hairColor;

    private int heightInches;

    //Here are ALL the constructors.... -.-


    /*public Person(String name) {
        this.name = name;
    }*/
    /*public Person(String hairColor) {
        this.hairColor = hairColor;
    }*/
    public Person(double weight){
        this.weight = weight;
    }
    public Person(String name, Integer age){
        this.age = age;
        this.name = name;
    }
    public Person(Integer heightInches){
        this.heightInches = heightInches;
    }

    public Person(boolean areEarsPierced){
        this.areEarsPierced = areEarsPierced;
    }
    public Person(char sex){
        this.sex = sex;
    }
    public Person(){
        name = "";
        age = 0;
        weight = 0;
        hairColor = "";
        sex = ' ';
        heightInches = 0;
        areEarsPierced = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age=age;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getName() {return name;
    }

    public Integer getAge() {
        return age;
    }
    public double getWeight(){
        return weight;
    }

    public boolean getAreEarsPierced() {
        return areEarsPierced;
    }

    public void setAreEarsPierced(boolean areEarsPierced) {
        this.areEarsPierced = areEarsPierced;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }
}
