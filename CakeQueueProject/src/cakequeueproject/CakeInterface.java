/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cakequeueproject;// The package declaration groups related classes and interfaces.

/**
 *
 * @author lesli
 */
//CakeInterface defines a contract for handling operations on a collection or queue of Cake objects.
public interface CakeInterface {
    public boolean isEmpty(); //Checks whether the cake collection (or queue) is empty.
    public boolean isFull(); //Checks whether the cake collection (or queue) is full.
    public void addCake(Cake cake); //Adds a Cake object to the collection (or queue).
    public Cake removeCake(); //Removes a Cake object from the collection (or queue).
    public String displayOven(); //This method may be used to display details about the cakes currently inside the oven.
    public void GetEmpty(); //The purpose of this method is to clear or reset the container holding the cakes.
}

