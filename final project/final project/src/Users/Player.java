/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import Booking.booking;
import Users.owner;
import java.util.Scanner;
import Playground.playground;
import java.util.Iterator;
import Account.account;
import static java.lang.System.in;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
/**
 * this is the player class 
 * @author Nermeen
 */
public class Player {
    
            Scanner scanner = new Scanner(System.in);

    
    public String id,location,password,name,email,role="player",mobile;
    private double balance;
    /**
     * this is setbalance function
     * this function to set balance of the player
     * @param balance  
     */
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    /**
     * this function to get the balance
     * @return balance of player
     */
    public  double getbalance()
    {
        return balance;
    }
    /**
     * this is addbalance function 
     * if player want to add money in his balance
     */
    public void addbalance()
    {
     double balance; 
     int vc;
        System.out.println("Enter value you want to add to your balance");
        balance=scanner.nextDouble();
        System.out.println("Enter varification code ");
        vc=scanner.nextInt();
        balance=balance+getbalance();
        setbalance(balance);
        System.out.println("Balance added succsessfully");
        
    }
    /**
     * default constractor
     */
    public Player()
    {
        
    }
    /**
     * parametarize constractor
     * @param id of player
     * @param password of player
     * @param location of player
     * @param email of player
     * @param mobile of player
     * @param name  of player
     */
    public Player(String id,String password,String location, String email,String mobile,String name)
    {
        this.id=id;
        this.password=password;
        this.mobile=mobile;
        this.email=email;
        this.location=location;
        this.name=name;
        
    }
   
    
     //  Scanner scanner =new Scanner(System.in);
       Vector<String> Friends =new Vector<String>();
       String mail,NameofPlayer,selectPlayer;
       Vector<String> names =new Vector<String>();
       Vector<String> favnames =new Vector<String>();
       Vector<String> favmails =new Vector<String>();
       int numofplayer,ans1; 
    /** 
     * this function to chick if the mail is correct in written or or not
     * @param mail
     * @return  true or false
     */
    public boolean validmail(String mail)
    {
        String check = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
      Pattern pattern = Pattern.compile(check);
    Matcher matcher = pattern.matcher(mail);
         return matcher.matches();
    }
      /**
       * this is create team function
       */
    public void createTeam()
    {
       
        // ans1=scanner.nextLine();
        
             System.out.println("How many player will play with you ?");
             numofplayer=scanner.nextInt();
             //System.out.println("Send to them an email to invite them");
                
                 for(int i=0;i<numofplayer;i++)
                   { 
                       scanner.nextLine();
                               
                       System.out.println("Enter his name");
                       
                       NameofPlayer=scanner.nextLine();
                       
                       names.add(NameofPlayer);
                      System.out.println("Enter his email");
                      mail=scanner.nextLine();
                     if(validmail(mail)) 
                      {  
                          Friends.add(mail);
                       
                       
                     }
                     else
                       {
                             System.out.println("Enter valid email please as Yourmail@gmail.com");
                              mail= scanner.nextLine();
                       }
                           
                            
                   }
             
                 System.out.println("your team is created successfully"); 
                  System.out.println(); 
                 
             System.out.println("Your team is : ");
            
                  System.out.println("Names "+names+"  "+"Emails"+Friends);
                 
            
             
             
        
        
        
    }
    /**
     * this this favTeam function 
     *to choose his favorite players
     */
    public void favTeam ()
    {
        
        if(names.isEmpty()&&Friends.isEmpty())
        {
            System.out.println("You should Create team first");
            createTeam();
               
                          
                              System.out.println("Your favorite team is :"+Friends+" ::: "+names);
                         
                               System.out.println("how many friends do you like to choose");
                              int num=scanner.nextInt();
                              for(int j=0;j<num;j++)
                              {
                                 scanner.nextLine();
                                System.out.println("Select player");  
                                selectPlayer=scanner.nextLine();
                             for(int i=0; i<names.size();i++)
                             {
                                 if(selectPlayer.equalsIgnoreCase(names.get(i)))
                                 {
                                     favnames.add(selectPlayer);
                                     favmails.add(Friends.get(i));
                                 }
                                 else
                                     continue;
                             }
                             
                                  
                                  
                              }
                               System.out.println("Your  team is :"+favnames+" ::: "+favmails);
            
        }
        else
        {
            
             if(!names.isEmpty()&&!Friends.isEmpty())
                        {
                             
                              for(int i=0;i<Friends.size();i++ )
                          {
                              System.out.println("Your favorite team is :"+Friends+" ::: "+names);
                          }
                               System.out.println("how many friends do you like to choose");
                              int num=scanner.nextInt();
                              scanner.nextLine();
                              for(int j=0;j<num;j++)
                              {
                                System.out.println("Select player");  
                                selectPlayer=scanner.nextLine();
                             for(int i=0; i<names.size();i++)
                             {
                                 if(selectPlayer.equalsIgnoreCase(names.get(i)))
                                 {
                                     favnames.add(selectPlayer);
                                     favmails.add(Friends.get(i));
                                 }
                                 else
                                     continue;
                             }
                             
                                  
                                  
                              }
                            
                        }
                        
                         
                              System.out.println("Your favorite team is :"+favnames+" ::: "+favmails);
                          
            
            
        }
       
                          
           
        
    }
    /**
     * this is send invitation function
     */
       public void sendInvetation()
       {   
           int n;
           Scanner scanner1= new Scanner (System.in);
           System.out.println("Send to your team an email to invite them");
           System.out.println("would you like to send invetation to:1) all your team 2)to your favorate team ");
           n=scanner.nextInt();
           if(n==1)
           {
                System.out.println("Email sent successfully to all your Friends");
                System.out.println();
                System.out.println("Names "+names+"  "+"Emails"+Friends);
                
                
           }
           else
           {
               System.out.println("Email sent successfully to  your favorate Friends");
                System.out.println();
                System.out.println("Your favorite team is :"+favnames+" ::: "+favmails);
               
           }
           
           
       }
   
     /**
      * this is toString function
      * @return id,location,password,name,email,role,mobile,balance of player  
      */
     public String toString ()
     {
         return  id+" "+location+" "+password+" "+name+" "+email+" "+role +" "+" "+mobile+" "+balance;
     }
     
     
}
   

