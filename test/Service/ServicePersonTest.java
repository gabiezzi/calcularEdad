/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entities.Person;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Gabi
 */
public class ServicePersonTest {

    private ServicePerson sPerson;
    private Person person;
    private Person testPerson;
    private Person testPerson2;

    @Before
    public void startClass() {

        sPerson = new ServicePerson();
        person = new Person("Gabi", new Date(90, 5, 4));

    }

    @Test
    public void shouldReturnObjectWhenParameteersAreOk() {

        //Arrange
        String serviceData = sPerson.newPersonCreated(person);
        testPerson = new Person("Manolo1", new Date(150, 4, 6));
        Person person2 = new Person("Gabi", new Date(90, 5, 4));

        //Act - Assert
        assertEquals("Gabi 4/6/1990", serviceData);
        assertNotEquals(person, testPerson);
        assertNotEquals(person, person2);
        assertNotNull("Data cannot be empty!", person);
        assertNotNull("Name cannot be empty!", person.getName());
        assertNotNull("Date cannot be empty!", person.getBirthDate());

    }

    @Test
    public void shouldReturnAgePersonWhenParameteersAreOK() {
        //PATRON AAA
        //Arrange
        Date actualDate = new Date();
        testPerson = new Person("Manolo1", new Date(150, 4, 6));
        testPerson2 = new Person("Manolo2", new Date(-50, 4, 6));
        int agePersonYounger = 11;
        int agePersonSameAge = 32;

        //Act
        int serviceData = sPerson.calculateAge(person.getBirthDate());
        boolean ageValidation = sPerson.validateAge(person.getBirthDate());

        //Assert
        assertEquals(serviceData, actualDate.getYear() - person.getBirthDate().getYear());
        assertEquals(serviceData, agePersonSameAge);
        assertNotEquals(serviceData, agePersonYounger);
        assertFalse("Age is not valid!", ageValidation);
        assertTrue(sPerson.validateAge(testPerson.getBirthDate()));
        assertTrue(sPerson.validateAge(testPerson2.getBirthDate()));

    }

    @Test
    public void shouldReturnDataPersonWhenParameteersAreOK() {

        //Arrange
        String dataExpected = "Name: Gabi\n"
                + "Birthdate : 4/6/90 \n"
                + "The age of the person is :32";
        Person person2 = new Person("Gabi", new Date(85, 10, 21));

        //Act
        String dataReceived = sPerson.showPersonData(person);
        String dataReceived2 = sPerson.showPersonData(person2);

        //Assert
        assertEquals("An error occurred when validating your data", dataExpected, dataReceived);
        assertNotEquals("An error occurred when validating your data", dataExpected, dataReceived2);
        assertNotNull("Data cannot be empty", dataReceived);

    }

    @Test
    public void shouldReturnTrueWhenPersonIsYounger() {
        int agePersonOlder = 48;
        int agePersonYounger = 11;
        int agePersonSameAge = 32;

        //Act
        //Assert
        assertTrue("Comparison Error!", sPerson.youngerThan(agePersonOlder, person.getBirthDate()));
        assertFalse("Comparison Error!", sPerson.youngerThan(agePersonYounger, person.getBirthDate()));
        assertEquals(sPerson.calculateAge(person.getBirthDate()), agePersonSameAge);
        assertNotEquals(agePersonOlder, sPerson.calculateAge(person.getBirthDate()));

    }
}
