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
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

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
    public void testConstructorWithNameAndAgeAndHeight() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Double expectedHeight = 5.8;

        // When
        Person person = new Person(expectedName, expectedAge, expectedHeight);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Double actualHeight = person.getHeight();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testConstructorWithNameAndAgeAndHeightAndWeight() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Double expectedHeight = 5.8;
        Integer expectedWeight = 165;

        // When
        Person person = new Person(expectedName, expectedAge, expectedHeight, expectedWeight);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Double actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testConstructorWithNameAndAgeAndHeightAndWeightAndAddress() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Double expectedHeight = 5.8;
        Integer expectedWeight = 165;
        String expectedAddress = "Delaware";

        // When
        Person person = new Person(expectedName, expectedAge, expectedHeight, expectedWeight, expectedAddress);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Double actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();
        String actualAddress = person.getAddress();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedAddress, actualAddress);
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
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Double expected = 5.8;

        // When
        person.setHeight(expected);

        // Then
        Double actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Integer expected = 165;

        // When
        person.setWeight(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress() {
        // Given
        Person person = new Person();
        String expected = "Delaware";

        // When
        person.setAddress(expected);

        // Then
        String actual = person.getAddress();
        Assert.assertEquals(expected, actual);
    }
}