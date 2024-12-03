/*
/ Contributors: Amber Baker, Scott Nguyen, Samuel Vaughn
/ Date: 12/2/2024
/ Class: C211 Final Project
/ Description:
/
*/
package C211FinalProject;

import java.util.Scanner;

public class GameLibrary {
    
    List library = new List();
    

    // main method for testing
    public static void main(String[] args) {

        GameLibrary library = new GameLibrary();
        library.displayMenu();

    } // close main

    public void displayMenu() {
        // this method will house the display menu for the game library
        // Contributors: Samuel Vaughn & Amber Baker

        boolean run = true;
        Scanner scan = new Scanner(System.in);
        int userChoice = 0;

        while (run != false) {

            System.out.println("Welcome to the Game Library!");
            System.out.println("1. Display All Games.");
            System.out.println("2. Search Games.");
            System.out.println("3. Rent Game.");
            System.out.println("4. Return Game.");
            System.out.println("5. Add New Game to Library.");
            System.out.println("6. Remove Game from Library.");
            System.out.println("6. Exit.");

            userChoice = scan.nextInt();
            switch (userChoice) { // need to add a try catch here

            case 1:
                // display all games
                break;
            case 2:
                // search games
                break;
            case 3:
                // rent game
                break;
            case 4:
                // return game
                break;
            case 5:
                // Add new game to library
                break;
            case 6:
                // remove game from library
                break;
            case 7:
                // exit 
                run = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            } // close switch
        } // close while loop
        scan.close();
        // menu options

    } // close displayMenu

} // close class
