/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Playground;

import Account.account;
import Users.owner;
import java.util.ArrayList;
import java.util.Vector;

/**
 * this is the playground class
 * @author Nermeen
 */
public class playground {
   
    public String name,location,email;
    
      public boolean approve=false,activation=true;
      public double size,price,avilablehours,cancelation;
      /**
       * default constarctor
       */
      
public playground()
{
    
}
/**
 * parametarize constractore
 * @param name of playground
 * @param location of playground
 * @param size of playground
 * @param price of playground
 * @param avilablehours of playground
 * @param cancelation of playground 
 * @param approve of playground from admain
 * @param acctivation of playground from admain
 * @param email of playground's owner
 */
    public playground(String name, String location, double size, double price, double avilablehours, double cancelation,boolean approve,boolean acctivation,String email)
    {
        this.name = name;
        this.location = location;
        this.size = size;
        this.price = price;
        this.avilablehours = avilablehours;
        this.cancelation = cancelation;
        this.approve=approve;
        this.activation=activation;
        this.email=email;
    }
    /**
     * this function to set the approve of the playground 
     * @param Approve 
     */
          public void setApprove(boolean Approve)
    {
        this.approve=Approve;
    }
          /**
           * this function to get the approve from the admain 
           * @return true or false
           */
    public boolean getApprove()
    {
        return approve;
    }
    /**
     * this function to set the activation on the playground 
     * @param acctivation if this ground is activated to be showen or not 
     */
    public void setAcctivation(boolean acctivation)
    {
        this.activation=acctivation;
        
    }
    /**
     * this function to get activation from the admain
     * @return  true or false
     */
    public boolean getAcctivation()
    {
        return activation;
    }
     /***
      * this toString function
       * @return  name ,location ,size ,price,avilableHours,cancelation of playground
      */
    public String toString()
    {
       return name +" "+location+" "+size+" "+price+" "+price+" "+avilablehours+" "+" "+cancelation; 
    }
    
       
}
