package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "Leon";
        Integer expectedAge = 5;
        char expectedgender = 'F';
        String expectedschool = "Temple";
        double expectedheight = 5.8;
        boolean expectedisGraduate = true;
        boolean expectedisWorking = true;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        double actualHeight = person.getHeight();
        boolean actualGraduate = person.getGrad();
        boolean actualWorking = person.getGrad();
        String actualSchool = person.getSchool();
        char actualGender = person.getGender();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedheight, actualHeight, 0);
        Assert.assertEquals(expectedgender, actualGender);
        Assert.assertEquals(expectedisWorking, actualWorking);
        Assert.assertEquals(expectedisGraduate, actualGraduate);
        Assert.assertEquals(expectedschool, actualSchool);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expectedName = "Leon";

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expectedAge = 5;

        // When
        Person person = new Person();

        // Then
        Integer actualAge = person.getAge();
        Assert.assertEquals(expectedAge, actualAge);
    }


    @Test
    public void testConstructorWithNameAndSchool() {
        // Given
        String expectedSchool = "Temple";
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedSchool);

        // Then
        String actualSchool = person.getSchool();
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedSchool, actualSchool);
    }

    @Test
    public void testConstructorWithGradWork() {
        //Given
        boolean expectedIsWork = true;
        boolean expectedIsGrad = false;
        //When
        Person obj = new Person(expectedIsGrad, expectedIsWork);

        //Then
        boolean actualIsWork = obj.getWork();
        boolean actualIsGrad = obj.getGrad();

        Assert.assertEquals(expectedIsGrad, actualIsGrad);
        Assert.assertEquals(expectedIsWork, actualIsWork);
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
    public void testSetSchool() {
        // Given
        Person person = new Person();
        String expectedSchool = "Temple";

        // When
        String actual = person.getSchool();

        // Then
        Assert.assertEquals(expectedSchool, actual);
    }
}
