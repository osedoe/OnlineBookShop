/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.libreria_diazjose.data;

import static es.cifpcm.libreria_diazjose.model.DiscountRate.getProductDiscountRate;
import static es.cifpcm.libreria_diazjose.model.DiscountRate.getServiceDiscountRate;

/**
 *
 * @author josedg
 */
public class DiscountRateData {
    /**
     * Function that takes the service/product, the member type and the total amount spent and calculates the
     * total amount already discounted.
     * Later on, we will call this function twice per visit / customer. Hence, the existence of the if/else statement.
     * @param transactionType - Service or Product
     * @param memberType - Premium, Gold and Silver
     * @param partialExpense - the total amount of money spent in each type of transaction
     * @return the total amount with the discount applied
     */
        public double applyDiscount(String transactionType, String memberType, double partialExpense) {
            
            double totalDiscounted = 0;
            
            if ("Service".equals(transactionType)) {
                
                double serviceDiscountAmount = partialExpense * getServiceDiscountRate(memberType);
                totalDiscounted = partialExpense - serviceDiscountAmount;
           
            } else if ("Product".equals(transactionType)) {
                
                double productDiscountAmount = partialExpense * getProductDiscountRate(memberType);
                totalDiscounted = partialExpense - productDiscountAmount;
            }
            
            return totalDiscounted;
        }
}

