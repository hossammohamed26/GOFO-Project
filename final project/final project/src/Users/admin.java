/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Playground.playground;
import java.util.Scanner;
import java.util.Vector;

/**
 *this is the admain class
 * @author Nermeen
 */
public class admin {
    /**
     * this is the approve function 
    
     * @param playgrounddata parameter vector of playground to set the approve to the playground
     */
    public void Approve(Vector<playground> playgrounddata) {
        String groundName;
        
        Scanner scanner = new Scanner(System.in);
            System.out.println("Entre name of playground to be approved");
            groundName = scanner.nextLine();
            search(playgrounddata,groundName);
          

    }
    /**
     * this is search function 
     * search for specific playground 
     * @param playgrounddata vector of playground to search in all playground found in the system  
     * @param s location of the ground
     */
public void search(Vector<playground> playgrounddata,String s)
{
    boolean flage = false;
          for (int j = 0; j < playgrounddata.size(); j++) {
                if (s.equalsIgnoreCase(playgrounddata.get(j).name)) {
                    playgrounddata.get(j).setApprove(true);
                    
                    flage = true;
                }
            }
            if (flage == true) {
                System.out.println("Approved");
            } else {
                System.out.println("Not approved");
            }
        
    
        
    
}
/**
 * this is the activation function 

 * @param playgrounddata  parameter vector of playground to set the activation to the playground
 */
    public void activation(Vector<playground> playgrounddata) {
        String groundName;
        boolean flage = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println(playgrounddata);
        System.out.println("Entre name of playground that you want to be activated");
        groundName = scanner.nextLine();
        if (!playgrounddata.isEmpty()) {
            for (int i = 0; i < playgrounddata.size(); i++) {
                if (groundName.equalsIgnoreCase(playgrounddata.get(i).name)) {
                    playgrounddata.get(i).setAcctivation(true);
                    flage = true;
                }
            }
            if (flage == true) {
                System.out.println("Activated");
            }

        } else {
            System.out.println("No owner sign up yet");
        }

    }
/**
 * this is the suspended function 
 * @param playgrounddata parameter vector of playground to suspend specific playground
 */
    public void suspented(Vector<playground> playgrounddata) {
        String groundName;
        boolean flage = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println(playgrounddata);
        System.out.println("Entre name of playground that you want to deactivate");
        groundName = scanner.nextLine();

        if (!playgrounddata.isEmpty()) {

            for (int i = 0; i < playgrounddata.size(); i++) {
                if (groundName.equalsIgnoreCase(playgrounddata.get(i).name)) {
                    playgrounddata.get(i).setAcctivation(false);
                    flage = true;
                }
            }
            if (flage == true) {
                System.out.println("deactivated");
            }

        } else {
            System.out.println("No owner sign up yet");
        }

    }
    /**
     * this is the delete function 
    
     
     * @param playgrounddata parameter vector of playground to delete a playground
     */
    public void delete(Vector<playground> playgrounddata) {
        String groundName;
        boolean flage = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println(playgrounddata);
        System.out.println("Entre name of playground that you want to remove");
        groundName = scanner.nextLine();
        if (!playgrounddata.isEmpty()) {

            for (int i = 0; i < playgrounddata.size(); i++) {
                if (groundName.equalsIgnoreCase(playgrounddata.get(i).name)) {
                    playgrounddata.remove(i);

                }
            }
            System.out.println(playgrounddata);

        } else {
            System.out.println("No owner sign up yet");
        }

    }

}
