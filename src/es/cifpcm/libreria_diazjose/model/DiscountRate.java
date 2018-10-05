/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.libreria_diazjose.model;

/**
 *
 * @author josedg
 */
public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;
    
    
    public static double getServiceDiscountRate(String type) {
        double serviceDiscountRate = 0;
        switch(type) {
            case "Premium":
                serviceDiscountRate = serviceDiscountPremium;
                break;
            case "Gold":
                serviceDiscountRate = serviceDiscountGold;
                break;
            case "Silver":
                serviceDiscountRate = serviceDiscountSilver;
                break;
        }
        
        return serviceDiscountRate;
    }
    
    public static double getProductDiscountRate(String type) {
        double productDiscountRate = 0;
        switch(type) {
            case "Premium":
                productDiscountRate = productDiscountPremium;
                break;
            case "Gold":
                productDiscountRate = productDiscountGold;
                break;
            case "Silver":
                productDiscountRate = productDiscountSilver;
                break;
        }
        
        return productDiscountRate;
    }
}
