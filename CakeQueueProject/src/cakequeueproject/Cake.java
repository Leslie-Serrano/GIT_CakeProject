/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakequeueproject;// Defines the package name for the project

/**
 *
 * Cake class represents a cake object with details such as its name,
 * weight, and best before date.
 * @author lesli
 */
public class Cake {
    private String name;  // Name of the cake
    private int weight;   // Weight of the cake in grams
    private String bestBeforeDate; // Expiration date of the cake

    /**
     * Constructor to initialize a Cake object with name, weight, and best before date.
     * 
     * @param name The name of the cake
     * @param weight The weight of the cake in grams
     * @param bestBeforeDate The expiration date of the cake
     */
    public Cake(String name, int weight, String bestBeforeDate) {
        this.name = name;  // Assigns the provided name to the Cake's name
        this.weight = weight;  // Assigns the provided weight to the Cake's weight
        this.bestBeforeDate = bestBeforeDate;  // Assigns the provided best before date to the Cake's best before date
    }
    //Getter method to retrieve the name of the cake.
    public String getName() {
        return name;  // Returns the name of the cake
    }
    //Getter method to retrieve the weight of the cake.
    public int getWeight() {
        return weight;    // Returns the weight of the cake in grams
    }
    //Getter method to retrieve the best before date of the cake.
    public String getBestBeforeDate() {
        return bestBeforeDate;    // Returns the best before date of the cake
    }

    /**
     * Overridden toString method to represent the Cake object as a string.
     * It provides a formatted description of the cake's details.
     * 
     * @return A string representation of the cake's name, weight, and best before date
     */
    @Override
    public String toString() {
          // Returns a formatted string containing the details of the cake
        return """  
           Cake Details:
           Name: %s
           Weight: %d grams
           Best Before Date: %s
           """.formatted(name, weight, bestBeforeDate);
    }
}
