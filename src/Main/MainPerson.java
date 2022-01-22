/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entities.Person;
import Service.ServicePerson;
import java.util.Date;

/**
 *
 * @author Gabi
 */
public class MainPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicePerson newService = new ServicePerson();
       
        Person p1 = newService.createNewPerson();

        newService.showMenu(p1);

    }

}
