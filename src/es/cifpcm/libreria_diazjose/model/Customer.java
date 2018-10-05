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
public class Customer {
    // Attributes
    private String name;
    private boolean member = false;
    private String memberType = "No es miembro";
    
    /** Constructor method
    * If we create a customer object with just a name, it will get non-member as
    * default parameters
    */
    public Customer(String name) {
        this.name = name;
    }
    
    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isMember() {
        return member;
    }
    
    public void setMember(boolean member) {
        this.member = member;
    }
    
    public String getMemberType() {
        return memberType;
    }
    
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre del cliente: ")
                .append(getName())
                .append("\n")
                .append("Miembro: ");
                
                if (isMember()) {
                    
                    sb.append("Si\n")
                            .append("Tipo: ")
                            .append(memberType)
                            .append("\n");
                    
                } else {
                    
                    sb.append("No\n");
                    
                }
                
        return sb.toString();
    }
    
    
}
