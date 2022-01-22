/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;



/**
 *
 * @author Gabi
 */
public class Person {
    
    
   private String name;
    
   private Date birthDate ;
    
    public Person(){
         
    }
    
    public Person(String name,Date birthDate){
        
        this.name = name;
        
        this.birthDate = birthDate;
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthDate=" + birthDate + '}';
    }

    
    
    
    
    
}
