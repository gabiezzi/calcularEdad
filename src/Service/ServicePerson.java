/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Date;
import java.util.Scanner;
import Entities.Person;

/**
 *
 * @author Gabi
 */
public class ServicePerson {
    
    public Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    
    
    public Person createNewPerson(){
        
        String name;
        int day, month, year;
        
        System.out.println("Please, insert your name:");
        name = read.next();
        
        System.out.println("Please, insert your birth date:");
        
        System.out.println("Day: ");
        day = read.nextInt();
        
        System.out.println("Month: ");
        month = read.nextInt();
        
        System.out.println("Year: ");
        year = read.nextInt();
        
        Date birthDate = new Date(year-1900,month-1,day);
        
   

        
        return new Person(name, birthDate);
        
        
        
    }
    
   public String newPersonCreated(Person person){
       
       
      return person.getName() +" "+ person.getBirthDate().getDate()+"/"+ (person.getBirthDate().getMonth()+1)+"/"+ (person.getBirthDate().getYear()+1900);
      
       
   }
    
    public int calculateAge(Date birthDate){
        
        Date todayDate = new Date();
        
        int edad = (todayDate.getYear()-birthDate.getYear());
        
     
         
        return edad;
        
    }
    
    public boolean validateAge(Date birthDate){
      
        if(calculateAge(birthDate)<0 || calculateAge(birthDate)>150){
            
            return true;
            
        }
        
        return false;
        
    }
    
    public boolean youngerThan(int edad, Date birthDate){
   
       
        
        
       if (calculateAge(birthDate) < edad) {

           return true;
        } 
            return false;
        


    }
    
    public String showPersonData(Person person){
     
       return  "Name: "+ person.getName() +"\n"
                + "Birthdate : "+ person.getBirthDate().getDate()+"/"+(person.getBirthDate().getMonth()+1)+"/"+person.getBirthDate().getYear()+" \n"
                + "The age of the person is :" + calculateAge(person.getBirthDate());
        
    }
    
    public void showMenu(Person p1){
        
        int opc = 0 ;
        
                    System.out.println("");
                    System.out.println("");
        System.out.println("-------Menu-------\n"
               
                + "1. Calculate the age.\n"
                + "2. Calculate the younger person.\n"
                + "3. Show the information of the person.\n"
                + "4. Quit");
                    System.out.println("");
                    System.out.println("");
        
        while(opc != 4 ){
            
                    System.out.println("");
            System.out.println("Choose the option number :");
                    System.out.println("");
            opc = read.nextInt();
            
            switch(opc){
                
                case 1 :
                    System.out.println("The age of the person is "+ calculateAge(p1.getBirthDate()));
                    System.out.println("");
                    break;
                
                case 2 :
                    
                    System.out.println("Insert the age of the other person");
                    int edad = read.nextInt();
                    System.out.println("");
                    
                    if(youngerThan(edad, p1.getBirthDate())){
                        
                        System.out.println("The first person is younger.");
                        
                    } else {
                        
                        System.out.println("The first person is older.");
                    }
                    
                    System.out.println("");
                    System.out.println("");
                    break;
                
                case 3 :
                    System.out.println("");
                    System.out.println(showPersonData(p1));
                    System.out.println("");
                    break;
                
                case 4 :
                    System.out.println("");
                    System.out.println("You have choosen to quit.");
                    System.out.println("-------The operation  has finished-------.");
                    System.out.println("------------------------------------------");
                    break;
                
                
            }
            
            
        }
        
    }
    
    
    
    
    
}
