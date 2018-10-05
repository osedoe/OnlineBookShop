/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.libreria_diazjose.model;

import java.util.Date;

/**
 *
 * @author josedg
 */
public class Visit {
    // Attributes
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    // Constructor methods of Visit class. 
    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }
    
    public Visit(Customer customer, Date date, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }
    
    // Getters & Setters
    public Customer getCustomer() {
        return customer;
    }
    
    public String getName(){
        return customer.getName();
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public double getServiceExpense() {
        return serviceExpense;
    }
    
    public void setServiceExpense(double ex) {
        this.serviceExpense= ex;
    }
    
    public double getProductExpense() {
        return productExpense;
    }
    
    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }
    
    
    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }
    
    // toString method to print information about the console.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-> A fecha ").append(getDate())
                .append(", el cliente ").append(getName())
                .append(" ha gastado un total de ").append(getTotalExpense())
                .append(".");
        String result = sb.toString();
        return result;
    }
}
