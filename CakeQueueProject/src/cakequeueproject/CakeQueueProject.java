/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cakequeueproject; // Declares that this class belongs to the 'cakequeueproject' package

/**
 * CakeQueueProject serves as the main entry point for the application.
 * It is responsible for launching the graphical user interface (GUI) for managing cakes.
 * 
 * @author lesli
 */
public class CakeQueueProject {

    /**
     * @param args the command line arguments
     */
    //The main method is the application's entry point. It is executed when the application starts.
    public static void main(String[] args) {
        // Creates an instance of the CakeGUI class, which manages the graphical user interface
        CakeGUI cakeapp = new CakeGUI(); 
        // Sets the GUI to be visible, allowing user interaction with the application
        cakeapp.setVisible(true);
    }
    
}
