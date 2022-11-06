package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();
        person.setName(expectedName);
        person.setAge(expectedAge);
        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person();

        person.setName(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person();
        person.setAge(expected);
        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);
        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setHeightInchesTest(){
        Person person = new Person();
        int expected = 69;

        person.setHeightInches(expected);
        int actual = person.getHeightInches();
        Assert.assertEquals(expected, actual);
    }
//    @Test
//    public void Test(){
//        Person person = new Person();
//        expected = ;
//
//        person.;
//        actual = ;
//        Assert.assertEquals(expected, actual);
//    }
    @Test
    public void testTestSetName() {
        Person person = new Person();
        String expected = "Troy";

        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        Person person = new Person();
        double expected = 300;

        person.setWeight(expected);
        double actual = person.getWeight();
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void testTestGetName() {
        Person person = new Person();
        String expected = "Troy";

        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetAge() {
        Person person = new Person();
        int expected = 25;

        person.setAge(expected);
        int actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetWeight() {
        Person person = new Person();
        double expected = 300;

        person.setWeight(expected);
        double actual = person.getWeight();
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void testGetAreEarsPierced() {
        Person person = new Person();
        boolean expected = true;

        person.setAreEarsPierced(expected);
        boolean actual = person.getAreEarsPierced();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetAreEarsPierced() {
        Person person = new Person();
        boolean expected = false;

        person.setAreEarsPierced(expected);
        boolean actual = person.getAreEarsPierced();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetSex() {
        Person person = new Person();
        char expected = 'f';

        person.setSex(expected);
        char actual = person.getSex();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetSex() {
        Person person = new Person();
        char expected = 'f';

        person.setSex(expected);
        char actual = person.getSex();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetHairColor() {
        Person person = new Person();
        String expected = "brown";

        person.setHairColor(expected);
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHairColor() {
        Person person = new Person();
        String expected = "brown";

        person.setHairColor(expected);
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetHeightInches() {
        Person person = new Person();
        int expected = 66;

        person.setHeightInches(expected);
        int actual = person.getHeightInches();
        Assert.assertEquals(expected, actual);
    }
}

    /*@Test
    public void Test(){
        Person person = new Person();
        expected = ;

        person.;
        actual = ;
        Assert.assertEquals(expected, actual);
    }*/