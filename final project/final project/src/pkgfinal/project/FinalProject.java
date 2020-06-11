/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import Account.account;
import Booking.booking;
import Users.Player;
import Users.owner;
//import Account.linkedlist;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Playground.playground;
import Users.admin;
/**
 * this is finalProject class to run our System
 * @author Nermeen
 */
public class FinalProject {

    /**
     * main function
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String ans = "yes";
        boolean flage = false;
        account account = new account();
        owner own = new owner();
        admin adm = new admin();
        
        Vector<playground> playgrounddata = new Vector<playground>();
        Scanner scanner = new Scanner(System.in);
        booking book=new booking();
        do {

            System.out.println("Wecome,Do you want to:");
            System.out.println("1-SignUp");
            System.out.println("2-Login");
             System.out.println("3-Exit");
             System.out.println("Choose number");
            int n = scanner.nextInt();
            while (n != 1 && n != 2&& n != 3) {
                System.out.println("Please enter only number 1 or 2 or 3");
                n = scanner.nextInt();
            }
            if(n==1|| n==2)
            {
            if (n == 1) {
                account.register();
            

            } else if (n == 2) 
            {
                account.login();
                
                }
           
            if(account.getrole().equalsIgnoreCase("player"))
            {
             playermain(playgrounddata,account,book);
                        
            }
            if(account.getrole().equalsIgnoreCase("playground owner"))
            {
            ownermain(playgrounddata, account, adm);
            
                     
                        
            }
            }
              else if(n == 3) 
              {
                     
                     flage=true;
            }
            

        } while (flage==false);
        
    }
/*account.register();
        own.addPlayground(playgrounddata);
        account.register();
        play.addbalance();   
                
        book.booking(playgrounddata, play);
        System.out.println("player: "+ play.getbalance());
    
        System.out.println("owner: "+own.getbalance());*/
    /**
     * this is playerMain function
     * @param playgrounddata to view all playground in the system
     * @param account object of account any player should make an account
     * @param book object oh booking if he prefer to book a ground
     */
    public static void playermain( Vector<playground> playgrounddata, account account,booking book)
            
    {
        
             Scanner scanner = new Scanner(System.in);
           boolean e=true;
           while(e==true)
           {
               
           

            
                int num,chooseNum;
                
                 System.out.println("Welcome to our page....." );
             System.out.println("would you like to ::"
                     + " 1) Show playgrounds "
                     + "2)Create team"
                     + "3)booking "
                     + "4)Add balance "
                     + "5)Show balance "
                     + "6)logout  ");
             num=scanner.nextInt();
             if(num==1)
             {
                 boolean w=true;
                while(w==true)
                {
                    System.out.println("1) show all playgrounds that exist "
                            + "2) show all playgrounds  that exist near to your location "
                            + "3) Back to player menu" );
        
      
        chooseNum=scanner.nextInt();
        scanner.nextLine();
       
            
            if(chooseNum==1)
       {
                
                   account.showallplayground(playgrounddata);
                
       }      
                  else if(chooseNum==2)
        {
            account.spacificLocation(playgrounddata);
        }
                  else if(chooseNum==3)
                  {
                      w=false;
                              
                  }
             }
            }
             
            
             else if(num==2)
             {
                 boolean q=true;
       while(q==true)
       {
           
       int ans1;
        System.out.println(" 1)Create team"
                + "2) choose your friends from your team"
                + " 3)Back");
        ans1=scanner.nextInt();
      
        
        
            if(ans1==1)
         {
            	account.user.createTeam();
         }
            else if(ans1==2)
                
                    {
            	account.user.favTeam();
                    }
           else if(ans1==3)
                    {
                        q=false;
                    }
             }
             }
                else if(num==3)
                {
                 
                   book.booking(playgrounddata, account.user,account.oinfo);
                    

               }
                else if(num==4)
                {
                	account.user.addbalance();
                }
             else if(num==5)
                {
                    System.out.println("Your balance is: " + account.user.getbalance());
               }
      else if(num==6)
                {
                    
                    System.out.println("Your are logged out");
                    account.setrole("");
                   e=false;
               }
    
             
    }
    }
    /**
     * this is ownerMain function
     * @param playgrounddata to add a playground to the system 
     * @param account any owner should make an account
     * @param object of admain to make any function on the ground    
     */
    public static void ownermain(Vector<playground> playgrounddata,account account,admin adm)
{
    
 Scanner scanner = new Scanner(System.in);
   boolean  flag=true;
     while(flag==true)
       {
       System.out.println("choose  "
               + "1-Add playground  "
               + "2-Send play ground to be approved  "
               + "3-view balance "
               + "4)logut");
       int num=scanner.nextInt();
       if(num==1)
       {
    	   account.own.addPlayground(playgrounddata);  
              
       }
       else if(num==2)
       {
           System.out.println("How many playground you want to approve");
           int y=scanner.nextInt();
           
             for(int j=0;j<y;j++)
                 adm.Approve(playgrounddata);
       }
       else if(num==3)
       {
           System.out.println( account.own.getbalance());
                   
                  
       }
       else if (num==4)
       {
           System.out.println("You are logged out");
           flag=false;
       }
       
}
}
}
