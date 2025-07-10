/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnessapp;
import java.util.Scanner; 

/**
 *
 * @author Capaciti
 */

public class DietTrackerApp { 

        
        public DietTrackerApp(){ //Creating a constructor
            
            
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a character: "); 

        char inputChar = scanner.next().charAt(0); 

        scanner.close(); 


        if (Character.isLetterOrDigit(inputChar)) { 

            if (Character.isLetter(inputChar)) { 

                System.out.println("The character '" + inputChar + "' is a letter."); 

            } else { 

                System.out.println("The character '" + inputChar + "' is a digit."); 

            } 

        } else { 

            System.out.println("Invalid input: The character is neither a letter nor a digit."); 

        } 

    } 
}


