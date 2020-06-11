package Users;
import Account.account;
import Users.owner;
import Playground.playground;

import java.util.*; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * this is the owner class
 * @author Nermeen
 */
public  class owner {  
    public String id,location,password,name,email,role="playground owner",address,mobile;
    private double ewallet,balance;
  /**
   * default constractor
   */
    public owner()
    {
        
    }
    /**
     * parametarize constractor
     * @param id of owner
     * @param password of owner
     * @param location of owner
     * @param email of owner
     * @param mobile of owner
     * @param name  of owner
     */
    public owner(String id,String password,String location, String email,String mobile,String name)
    {
        this.id=id;
        this.password=password;
        this.mobile=mobile;
        this.email=email;
        this.location=location;
        this.name=name;
        role="playground owner";
    }
    /**
     * this addPlayground function
     * @param playgrounddata vector of playground to add in it any new playground will be add to the system
     */
    public void addPlayground(Vector <playground>playgrounddata)
    {
        
         int n;
        account acc =new account ();
        String ans;
        String name,location;
        double size,price,avilablehours, cancelation;
        playground pl=new playground();
        admin adm=new admin();
       Scanner scanner =new Scanner(System.in);
        System.out.println("Enter how meny playground you want to add");
            n = scanner.nextInt();
            
              for (int i = 0; i < n; i++) 
              {
                    scanner.nextLine();
                   System.out.println("Enter name of playground ");
                   name= scanner.nextLine();
            
             while(name.isEmpty() )
           {
               System.out.println("the name of playground can't be empty");
                         System.out.println("Enter the name again  again");

                name= scanner.nextLine();
           }
            System.out.println("Enter your location");
            location= scanner.nextLine();
            
             while(location.isEmpty() )
           {
               System.out.println("the location cant be empty");
               System.out.println("Enter location again");

                location= scanner.nextLine();
           }
           System.out.println("Enter the price of the playground for one hour ");
           price=scanner.nextDouble();          
           System.out.println("Enter the size of playground");
            size= scanner.nextDouble();
           System.out.println("Enter the avilablehours for the  playground");
            avilablehours=scanner.nextDouble();
           System.out.println("Enter the cancilation time");
           cancelation= scanner.nextDouble();
           playground p=new playground ( name,  location,  size,  price,  avilablehours,  cancelation,false,true,email); 
             playgrounddata.add(p);  
            }
         
    }
    /**
     * this toString function
     * @return id,location,password,name,email,role,address,mobile of owner
     */
   public String toString()
   {
       return id+" "+location+" "+password+" "+name+" "+email+" "+role+" "+address+" "+mobile;
   }
   /**
    * this is setBalance function
    * to set balance of the owner
    * @param balance to deal with owner's balance 
    */
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    /**
     * this is getBalance function 
     * to get balance of the owner
     * @return  balance of the owner
     */
    public  double getbalance()
    {
        return balance;
    }
  
}
