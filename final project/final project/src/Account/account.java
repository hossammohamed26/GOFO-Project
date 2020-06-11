/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;


import Users.Player;
import Users.owner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Playground.playground;
/**
 * this is the account class 
 * @author Nermeen
 */
public class account {

          Deque<String> emails = new ArrayDeque<String>(); 
          public Deque<Player> pinfo = new ArrayDeque<Player>();
        //  public Deque<owner> oinfo = new ArrayDeque<owner>();
            public   Vector <owner>oinfo= new Vector<owner>();
            
            public Player user;
            public owner own;
            
          //Vector <owner> v= new Vector<owner>();
     Vector <playground>playgrounddata= new Vector<playground>();
      Iterator iteratorVals = pinfo.iterator(); 
      String role="";
        Scanner scanner =new Scanner(System.in);
        public int counter=-1;
        //owner own =new owner();
        /**
         * this function to set role of any user is he owner or player
         * @param role to show if the role is player or owner
         */
        public void setrole(String role)
        {
            this.role=role; 
        }
        /**
         * this function to get role of the user
         * @return role could be player or playground owner
         */
        public String getrole()
        {
            return role;
        }
        /**
         * this is the register function
         */
public void register ()
    {     
                   
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your name");
           String n= scanner.nextLine();
           while(n.isEmpty() )
           {
               System.out.println("the name cant be empty");
                         System.out.println("Enter your name again");

                n= scanner.nextLine();
           }
           System.out.println("Enter your id");
           String id= scanner.nextLine();
            while(id.isEmpty() )
           {
               System.out.println("the id cant be empty");
                         System.out.println("Enter your id again");

                id= scanner.nextLine();
           }
           System.out.println("Enter your location");
           String loc= scanner.nextLine();
            while(loc.isEmpty() )
           {
               System.out.println("the location cant be empty");
                         System.out.println("Enter your location again");

                loc= scanner.nextLine();
           }
           System.out.println("Enter your mobile number");
           String mob= scanner.nextLine();
            while(mob.isEmpty() )
           {
               System.out.println("the mobile number cant be empty");
                         System.out.println("Enter your mobile number again");

                mob= scanner.nextLine();
           }
           System.out.println("Enter your password");
           String pass= scanner.nextLine();
            while(pass.isEmpty() )
           {
               System.out.println("the password cant be empty");
                         System.out.println("Enter your password again");

                pass= scanner.nextLine();
           }
           System.out.println("Enter your email");
           String mail= scanner.nextLine();
         
        while((validmail(mail)==false)||checkemails(mail)==true)
        {
            if(validmail(mail)==false)
            {
                 System.out.println("This is not email,Enter email as nada.hossam@gmail.com");
               mail= scanner.nextLine();
            }
            if(checkemails(mail)==true)
            {
                System.out.println("This email is already taken , enter another email");
               mail= scanner.nextLine();
            }
        
            
                   
            
        }
            emails.add(mail);
             System.out.println("Enter your role : player or playground owner");
           String role= scanner.nextLine();
          boolean z= false;
          while(z==false)
          {
               if(role.equalsIgnoreCase("player"))
           {
               user=new Player(id, pass,loc,mail, mob, n);   
               z=true;
               verificatin();  
               pinfo.add(user);
              // user.profile(playgrounddata);
              setrole("player");
                
           }
           else if(role.equalsIgnoreCase("playground owner"))
                   {       
                            
                           own=new owner(id, pass,loc,mail, mob, n);  
                           z=true;
                          verificatin();  
                          oinfo.add(own);    
                          setrole("playground owner");
                          //own.createprofile(playgrounddata);
                                   
                      
                   }
           else
           {
               System.out.println("You should enter only  player or playground owner ");
               role= scanner.nextLine();
                              z=false;

           }
          }
           
    }
/**
 * this function is chackMails 
 
 * @param mail to chick if the mail is signed before or or not
 * @return true or false 
 */
private boolean checkemails(String mail)
{
    if( emails.contains(mail))
        {
           return true;
        }
        else
            return false;  
}
/**
 * this is validMail function 
 * 
 * @param mail to chick if the mail is correct in written or or not
 * @return 
 */
    private boolean validmail(String mail)
    {
        String check = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
      Pattern pattern = Pattern.compile(check);
    Matcher matcher = pattern.matcher(mail);
         return matcher.matches();
    }
    /**
     * this is login function to login if you signed before 
     */
    public void login ()
    {
       
        scanner.nextLine();
        int y=0;
        setrole(" ");
        owner on=new owner();
        account x=new account();
         Player p=new Player();
        System.out.println("Enter your email");
         String mail= scanner.nextLine();
          System.out.println("Enter your password");
         String pass= scanner.nextLine();
          System.out.println("Enter your role");
         String role= scanner.nextLine();
         if(role.equalsIgnoreCase("player"))
           {
               counter++;
              for(Player b :pinfo)
               {   
                   if(b.email.equals(mail)&&b.password.equals(pass))
                        {
                            setrole("player");
                               System.out.println("Welcome "+b.name);
                               user=b;
                               break;
                        }
                  
                        
                } 
             // p.profile(playgrounddata);
           }
           else if(role.equalsIgnoreCase("playground owner"))
                   {               counter++;

                        for(owner b :oinfo)
               {    if(b.email.equals(mail)&&b.password.equals(pass))
               {
                              setrole("playground owner");
                               System.out.println("Welcome "+b.name);
                               own=b;
                               break;
                        }
                        
                }  
                      //  on.createprofile(playgrounddata);
                   }
    }
    /**
     * this function to print mail and user name of player
     */
    public void print()
    {
     for(Player b :pinfo)
               {
                   System.out.println(b.name+"  "+ b.email); 
                } 
    }
    /**
     * this is the verification function to send  verification code to any user make an account
     */
    private void verificatin()
    {
        System.out.println("please write the verification code that send in your email");
         int vr=scanner.nextInt();
          System.out.println("Signed Up succsessfully");

    }
   /* public String toString ()
    {
        return 
    }*/
    /**
     * this is showallPlayground function 
     * responsible to print all playground to the player
     * @param playgrounddata vector of playground class to have all data of any playground
     */
    public void showallplayground(Vector <playground>playgrounddata)
   { 
      
       int i=0;
      
       int s=playgrounddata.size();
       
       
      
      
       while(s>0)
       {      
         
           if(playgrounddata.get(i).getAcctivation()==true&&playgrounddata.get(i).getApprove()==true)
           {  
               System.out.println("name: location : size:  price per hour: avilable hour: cancelation  ");
               System.out.println(playgrounddata.get(i));
                i++;
           }
           
           
           s--;
           
       }
       
       
      
   }
    /**
     * this is spacificLocation function
     * responsible to print specific  playground to the player according to his location
     * @param playgrounddata vector of playground class to have all data of any playground
     */
   public void spacificLocation(Vector <playground>playgrounddata)
   {
	   scanner.nextLine();
       String location;
       System.out.println("Enter the location");
       location=scanner.nextLine();
      int s=playgrounddata.size();
          int i=0; 
           while(s>0)
    {
        if(location.equalsIgnoreCase(playgrounddata.get(i).location))
         {   
             if(playgrounddata.get(i).getAcctivation()==true&&playgrounddata.get(i).getApprove()==true)
            {
                 System.out.println("playground near to your location is :");
                 System.out.println("name: location : size:  price per hour: avilable hour: cancelation  ");
                 System.out.println(playgrounddata.get(i));
                 i++;
            }
             
            
        }
           
          s--;
     }
   }
   
}
   

