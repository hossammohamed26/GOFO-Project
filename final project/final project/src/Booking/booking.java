/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booking;

import Account.account;
import Playground.playground;
import Users.Player;
import Users.owner;
import java.util.Scanner;
import java.util.Vector;

/**
 *this is the booking class responsible for booking
 * @author Nermeen
 */
public class booking {
    public void booking( Vector <playground> playgrounddata,Player p,Vector <owner> oinfo)
     {
         double price=0;
         Scanner scanner =new Scanner(System.in);
         boolean x=false;
        account acc=new account();
        
             if(playgrounddata.size()==0)
             {
                 System.out.println("There is no playgrounds assigned");
             }
                     
        else
        {
         String n;
         System.out.println("Enter the name of the playground");
         n=scanner.nextLine();
         int z = 0;
              
         while(x==false)
         {
           
             
                 
             
                 for(int i=0;i<playgrounddata.size();i++)
               {
                   if (n.equalsIgnoreCase(playgrounddata.get(i).name))
                   {
                       z=i;
                       x=true;
                       break;
                   }
                  
                } 
                 if(x==true)
                 {
                    
                                 
         System.out.println("Enter the hour that you want to book");
                     int from=scanner.nextInt();
                     System.out.println("Enter how many hours you want to book");
                     int how=scanner.nextInt();
                     
                      price=playgrounddata.get(z).price*how;
                     System.out.println("The price will be "+price);
                     System.out.println("Enter yes to confirm booking or no to cancle");
                     scanner.nextLine();
                     String val=scanner.nextLine();
                     if(val.equalsIgnoreCase("yes"))
                     {
                         withdraw(playgrounddata, p, z,price);
                         
                         addowner(oinfo, z, price,playgrounddata.get(z).email);
                     }     
                //     System.out.println(oinfo.get(z).getbalance());
                           // scanner.nextLine();
                    
                             }
                 
             }
                 
         }
         
      
                  
     }
    /**
     * this is withdraw function
     * @param playgrounddata parameter vector of playground to show playground
     * @param p object of player to take money of player 
     * @param z to get specific index and double price
     * @param price money that taken from player to go to owner
     */
    public void withdraw( Vector <playground> playgrounddata,Player p ,int z,double price)
    {
                Scanner scanner =new Scanner(System.in);

            
                             
                                 if(p.getbalance()>=price)
                                 {
                                     p.setbalance(p.getbalance()-price);
                                     System.out.println("Your booked is successful");    
                                     System.out.println("Do you want to send invitation?(enter yes or no)");
                    String yes=scanner.nextLine();
                    if(yes.equalsIgnoreCase("yes"))
                    {
                        p.sendInvetation();
                    }

                                 }
                                 else 
                                 {
                                    System.out.println(p.getbalance()); 
                                     System.out.println("You don't have enough money");
                                 }
    
    }
    /**
     * this is addOwner function 
     * @param oinfo parameter vector of owner to deal with owner 
     * @param z parameter int z to get specific index 
     * @param price the money which token from specific player and added to specific owner 
     * @param mail string mail to add the money to the owner of the playground 
     */
    public void addowner( Vector <owner> oinfo,int z,double price,String mail)
    {
                          /*  System.out.println(z+ "  "+ price);
                            price=price+oinfo.get(z).getbalance();
                             oinfo.get(z).setbalance(price);
                             System.out.println(oinfo.get(z).getbalance());*/
                             
                        for(int i=0;i<oinfo.size();i++)
                             {
                                 if(oinfo.get(i).email.equals(mail))
                                 {
                                     
                                     price=price+oinfo.get(i).getbalance();
                             oinfo.get(i).setbalance(price);
                                 }
                             }
    }
}
