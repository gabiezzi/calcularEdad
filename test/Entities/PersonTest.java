/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Gabi
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    Person person ;
  
    @Test
    public void testToString() {
       
         String nameExpected = "Gabi";
        Date birthDateExpected = new Date(90,4,5);
        person = new Person(nameExpected, birthDateExpected);
       String toStringReceived = "Person{" + "name=" + nameExpected + ", birthDate=" + birthDateExpected + '}';
       String toStringExpected = person.toString();
        assertEquals(toStringReceived, toStringExpected);
        assertNotNull(person.getName());
        assertNotNull(person.getBirthDate());
        
        
    }
    
}
