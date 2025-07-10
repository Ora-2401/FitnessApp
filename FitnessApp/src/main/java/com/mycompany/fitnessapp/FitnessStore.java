/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnessapp;

/**
 *
 * @author Capaciti
 */
public class FitnessStore {
    public class beFit { 

    private String category; 

    private String equipment; 

    private double price; 

 

    public beFit(String category, String equipment, double price) { 

        this.category = category; 

        this.equipment = equipment; 

        this.price = price; 

    } 

 

    public static void main(String[] args) { 

        beFit[] equipmentArray = new beFit[4]; 

        equipmentArray[0] = new beFit("Strength Training", "Dumbbells", 300); 

        equipmentArray[1] = new beFit("Cardio", "Treadmill", 7000); 

        equipmentArray[2] = new beFit("Flexibility", "Yoga Mat", 150); 

        equipmentArray[3] = new beFit("Endurance", "Resistance Bands", 200); 

 

        for (int i = 0; i < equipmentArray.length; i++) { 

            System.out.println("Category: " + equipmentArray[i].category); 

            System.out.println("Equipment: " + equipmentArray[i].equipment); 

            System.out.println("Price: R" + equipmentArray[i].price); 

            System.out.println(); // Empty line for better readability 

        } 

    } 

} 

 

 

public class beFit { 

    private String category; 

    private String equipment; 

    private double price; 

 

    public beFit(String category, String equipment, double price) { 

        this.category = category; 

        this.equipment = equipment; 

        this.price = price; 

    } 

 

    public static void main(String[] args) { 

        beFit[] equipmentArray = new beFit[4]; 

        equipmentArray[0] = new beFit("Strength Training", "Dumbbells", 300); 

        equipmentArray[1] = new beFit("Cardio", "Treadmill", 7000); 

        equipmentArray[2] = new beFit("Flexibility", "Yoga Mat", 150); 

        equipmentArray[3] = new beFit("Endurance", "Resistance Bands", 200); 

 

        for (int i = 0; i < equipmentArray.length; i++) { 

            System.out.println("Category: " + equipmentArray[i].category); 

            System.out.println("Equipment: " + equipmentArray[i].equipment); 

            System.out.println("Price: R" + equipmentArray[i].price); 

            System.out.println(); // Empty line for better readability 

        } 

    } 

} 

 

public class beFit { 

    private String category; 

    private String equipment; 

    private double price; 

 

    public beFit(String category, String equipment, double price) { 

        this.category = category; 

        this.equipment = equipment; 

        this.price = price; 

    } 

 

    public static void main(String[] args) { 

        beFit[] equipmentArray = new beFit[4]; 

        equipmentArray[0] = new beFit("Strength Training", "Dumbbells", 300); 

        equipmentArray[1] = new beFit("Cardio", "Treadmill", 7000); 

        equipmentArray[2] = new beFit("Flexibility", "Yoga Mat", 150); 

        equipmentArray[3] = new beFit("Endurance", "Resistance Bands", 200); 

 

        for (int i = 0; i < equipmentArray.length; i++) { 

            System.out.println("Category: " + equipmentArray[i].category); 

            System.out.println("Equipment: " + equipmentArray[i].equipment); 

            System.out.println("Price: R" + equipmentArray[i].price); 

            System. 
    
}
