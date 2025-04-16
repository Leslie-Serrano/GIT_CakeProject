/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakequeueproject; // Declares that this class is part of the "cakequeueproject" package
import java.util.*; // Imports all classes from the java.util package (needed for ArrayList)

/**
 * CakeMethods class implements the CakeInterface to provide concrete operations on a collection (oven) of Cake objects.
 * This implementation uses an ArrayList to simulate an oven with a maximum capacity of 5 cakes.
 *
 * @author lesli
 */
public class CakeMethods implements CakeInterface {
    // An ArrayList to store Cake objects, representing the oven
    private final ArrayList<Cake> oven;
    
    //Constructor for CakeMethods.
    //Initializes the oven as an empty ArrayList.
    public CakeMethods() {
        oven = new ArrayList<>();// Creates a new empty ArrayList to hold Cake objects
    }
    //Checks if the oven is empty.
    public boolean isEmpty(){
        return oven.isEmpty();// Calls the isEmpty method on the ArrayList to determine if it is empty
    }
    //Checks if the oven is full.
    public boolean isFull(){
        return oven.size() >= 5; // Compares the current number of cakes in the oven to the maximum capacity of 5
    } 
    //Adds a Cake object to the oven.
    //Before adding, it checks if the oven is not full.
    //If the oven has space, the cake is added; otherwise, nothing happens.
     public void addCake(Cake cake) {
        if (!isFull()) {     // Only add the cake if the oven isn't full
            oven.add(cake);  // Adds the provided Cake object to the ArrayList (oven)
        }
    } 
     //Removes a Cake object from the oven.
     //This method removes and returns the first cake in the oven (FIFO behavior),If the oven is empty, it returns null.
    public Cake removeCake() {
        if (!isEmpty()) {  // Only remove a cake if the oven is not empty
            return oven.remove(0);   // Removes and returns the first Cake object in the ArrayList
        }
        return null;  // Returns null if there are no cakes to remove
    }
    //Provides a textual representation of the current state of the oven.
    //If the oven is empty, it returns a message indicating so.
    public String displayOven() {
        if (oven.isEmpty()) {  
            return "Oven is empty!";// If no cakes are in the oven, return a message stating it is empty
        }
        StringBuilder sb = new StringBuilder(); // StringBuilder is used for efficiently creating strings
        for (Cake cake : oven) {    // Iterate through every Cake object in the oven
            sb.append(cake.toString()).append("\n**\n");  // Append the cake's details and a separator
        }
        return sb.toString();// Return the final string representing all cakes in the oven
    }
    //This method effectively clears the ArrayList used to store the cakes
    public void GetEmpty(){
         oven.clear(); // Clears all elements from the ArrayList, leaving an empty oven
    }
}
