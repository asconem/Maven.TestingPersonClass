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
    public void testConstructorWithNameAgeEyeColor() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedEyeColor = "hazel";

        // When
        Person person = new Person(expectedName, expectedAge, expectedEyeColor);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualEyeColor = person.getEyeColor();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

    @Test
    public void testConstructorWithNameAgeEyeColorGender() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedEyeColor = "hazel";
        boolean expectedIsMale = true;

        // When
        Person person = new Person(expectedName, expectedAge, expectedEyeColor, expectedIsMale);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualEyeColor = person.getEyeColor();
        boolean actualIsMale = person.getIsMale();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedIsMale, actualIsMale);
    }

    @Test
    public void testConstructorWithNameAgeEyeColorGenderHairColor() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedEyeColor = "hazel";
        boolean expectedIsMale = true;
        String expectedHairColor = "brown";

        // When
        Person person = new Person(expectedName, expectedAge, expectedEyeColor, expectedIsMale, expectedHairColor);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualEyeColor = person.getEyeColor();
        boolean actualIsMale = person.getIsMale();
        String actualHairColor = person.getHairColor();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertTrue(actualIsMale);
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

}
