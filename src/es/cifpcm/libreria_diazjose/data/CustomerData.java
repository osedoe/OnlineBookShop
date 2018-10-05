/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.libreria_diazjose.data;

import es.cifpcm.libreria_diazjose.model.Customer;
import java.util.*;

/**
 *
 * @author josedg
 */
public class CustomerData {
    // Initialize a list of customers
    List<Customer> users = new ArrayList<>();
    
    /**
     * Function that creates eight customers and adds them to a list.
     * This is the only hard coded piece of the application
     * @return users - the list seen above populated with the customers
     */
    public List<Customer> createCustomerList() {
            
            Customer user1 = new Customer("Yodra", true, "Premium");
            Customer user2 = new Customer("Alberto", true, "Gold");
            Customer user3 = new Customer("Erik", true, "Silver");
            Customer user4 = new Customer("Daniel");
            Customer user5 = new Customer("Javier", true,"Premium");
            Customer user6 = new Customer("Alejandro", true, "Gold");
            Customer user7 = new Customer("Carla", true, "Silver");
            Customer user8 = new Customer("Richi");
        
            users.add(user1);
            users.add(user2);
            users.add(user3);
            users.add(user4);
            users.add(user5);
            users.add(user6);
            users.add(user7);
            users.add(user8);
            
            return users;
        
    }
    
}
