/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnessapp;

/**
 *
 * @author Capaciti
 */
public class StringComparison {
    
      
    // Declare the names of the two protein shakes 

        String shake1 = "VanillaShake"; 

        String shake2 = "VANILLAshake"; 
 
        
        public StringComparison(){
        // Convert both strings to lowercase to ignore case sensitivity 

        // This step ensures that the comparison treats both strings equally 

        String shake1Lower = shake1.toLowerCase(); 

        String shake2Lower = shake2.toLowerCase(); 

 

        // Compare the lowercase versions of the strings 

        // If they match, the products are considered the same 

        if (shake1Lower.equals(shake2Lower)) { 

            System.out.println("The two shakes are considered the same product."); 

        } else { 

            System.out.println("The two shakes are different products."); 

        } 
    } 
}
