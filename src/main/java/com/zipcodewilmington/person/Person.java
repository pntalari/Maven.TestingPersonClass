package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    //instance variables
    private String name;
    private int age;
    private char gender;
    private String school;
    private double height;
    private boolean isGraduate;
    private boolean isWorking;

    //constructors
    public Person() {
        this.name = "Leon";
        this.age = 5;
        this.gender = 'F';
        this.school = "Temple";
        this.height = 5.8;
        this.isGraduate = true;
        this.isWorking = true;
    }

    public Person(int age) {
        setAge(age);
    }

    public Person(String name, String school) {
        setName(name);
        setSchool(school);
    }

    public Person(double height) {
        setHeight(height);
    }

    public Person(boolean isGraduate, boolean isWorking) {
        setGrad(isGraduate);
        setWork(isWorking);
    }

    public Person(char gender) {
        setGender(gender);
    }

    public Person(String name, int age, boolean isWorking, boolean isGraduate, double height, char gender, String school) {
        setName(name);
        setAge(age);
        setHeight(height);
        setSchool(school);
        setGender(gender);
        setGrad(isGraduate);
        setWork(isWorking);
    }

    // set methods
    private void setGender(char gender) {
        this.gender = gender;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private void setGrad(boolean isGraduate) {
        this.isGraduate = isGraduate;
    }

    private void setWork(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // get methods
    public char getGender() {
        return this.gender;
    }

    public String getSchool() {
        return this.school;
    }

    public boolean getWork() {
        return this.isWorking;
    }

    public boolean getGrad() {
        return this.isGraduate;
    }

    public double getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

}
