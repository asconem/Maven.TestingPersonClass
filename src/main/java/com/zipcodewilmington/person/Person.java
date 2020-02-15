package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private boolean isMale;


    private String hairColor;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public Person(String name, int age, String eyeColor, boolean isMale) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.isMale = isMale;
    }

    public Person(String name, int age, String eyeColor, boolean isMale, String hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.isMale = isMale;
        this.hairColor = hairColor;
    }

    ///SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    ///GETTERS

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }

    public String getEyeColor() {

        return eyeColor;
    }

    public boolean getIsMale() {

        return isMale;
    }

    public String getHairColor() {

        return hairColor;
    }
}
