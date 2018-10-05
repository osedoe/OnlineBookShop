/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.libreria_diazjose;

import es.cifpcm.libreria_diazjose.data.CustomerData;
import es.cifpcm.libreria_diazjose.data.DiscountRateData;
import es.cifpcm.libreria_diazjose.data.VisitData;
import es.cifpcm.libreria_diazjose.model.Customer;
import es.cifpcm.libreria_diazjose.model.DiscountRate;
import es.cifpcm.libreria_diazjose.model.Visit;
import java.util.List;

/**
 *
 * @author josedg
 */
public class Libreria_DiazJose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // We are going to create two lists, one with customer and other one with the visits
        
        CustomerData customerData = new CustomerData();
        List<Customer> customerList = customerData.createCustomerList();
        
        VisitData visitData = new VisitData();
        List<Visit> visitList = visitData.createVisitList(customerList);
        
        
        /**
         * We are going apply the discount to each visit item of the list
         */
        for (Visit visit : visitList) {
        
           DiscountRateData discountRateData = new DiscountRateData();
           // Returns totalDiscounted from Service
           double totalServiceDiscounted = discountRateData.applyDiscount("Service", visit.getCustomer().getMemberType(), visit.getServiceExpense());
        
            // Returns totalDiscounted from product
           double totalProductDiscounted = discountRateData.applyDiscount("Product", visit.getCustomer().getMemberType(), visit.getProductExpense());
        
            // Print the bill
            StringBuilder sb = new StringBuilder();
            sb.append("\n\n===========================================[ Factura ]==============================================\n\n")
//                    .append("Nombre del cliente: ").append(visit.getName()).append("\n")
//                    .append("Fidelizaci\u00f3n: ").append(visit.getCustomer().getMemberType()).append("\n\n")
                    .append(visit.getCustomer().toString())
                    .append("\nTRANSACCI\u00d3N\t\tTOTAL SIN DESCUENTO\t"
                            + "\tDESCUENTO\t\tTOTAL CON DESCUENTO\n")
                    
                    .append("  Servicio\t\t\t")
                        .append(visit.getServiceExpense())
                        .append("\t\t\t  ")
                        .append(DiscountRate.getServiceDiscountRate(visit.getCustomer().getMemberType()))
                        .append("\t\t\t     ")
                        .append(totalServiceDiscounted)
                        .append("\n")
                    
                    .append("  Producto\t\t\t")
                        .append(visit.getProductExpense())
                        .append("\t\t\t  ")
                        .append(DiscountRate.getProductDiscountRate(visit.getCustomer().getMemberType()))
                        .append("\t\t\t     ")
                        .append(totalProductDiscounted)
                        .append("\n\n")
                    
                    .append(visit.toString())
                    .append("\n\n====================================================================================================")
                        .append("\n");
            
            System.out.println(sb);
            
        }
        
    }
    
}
