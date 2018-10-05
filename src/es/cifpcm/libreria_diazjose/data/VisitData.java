/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.libreria_diazjose.data;

import es.cifpcm.libreria_diazjose.model.Customer;
import es.cifpcm.libreria_diazjose.model.Visit;
import toolbox.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author josedg
 */
public class VisitData {
    /**
     * Relying on a list of customers, we are going to create a list of visits for our user profile demo
     * @param customerList 
     * @return visitList
     */
    public List<Visit> createVisitList(List<Customer> customerList) {
        
        List<Visit> visitList = new ArrayList<>();
        
        /** We are going to iterate over each customer in the customerList, and instantiate a visit per customer,
         * generating randomly possible service and product expenses.
         * For the sake of simplicity, we are going to create a new simple standard object Date
         */
        for (int i = 0; i < customerList.size(); i++) {
            
            Customer customer = customerList.get(i);
            
            Visit visit = new Visit(customer, new Date(), RandomNumber.generateRandomNumber(1, 500), RandomNumber.generateRandomNumber(1, 500));
            visitList.add(visit);
        }
        return visitList;
    }
    
}
