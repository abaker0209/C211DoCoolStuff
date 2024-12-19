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
    
    private List gameList; // Linked list for storing games
    private Scanner scanner;

    // Create game list and scanner
    public GameLibrary() {
        gameList = new List();
        scanner = new Scanner(System.in);
    }

    // Case 1: Display all games in the list
    public void displayGames() {
        if (gameList.head == null) {
            System.out.println("No games available.");
        } else {
            Node currentNode = gameList.head;
            while (currentNode != null) {
                System.out.println(currentNode.game.toString());
                System.out.println("--------------------------");
                currentNode = currentNode.next;
            }
        }
    }

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
            System.out.println("7. Exit.");

            userChoice = scan.nextInt();
            switch (userChoice) { // need to add a try catch here

            case 1:
                // display all games
                displayGames()
                break;
            case 2:
                // search games
                searchGames()
                break;
            case 3:
                // rent game
                rentGame()
                break;
            case 4:
                // return game
                returnGame()
                break;
            case 5:
                // Add new game to library
                addGame()
                break;
            case 6:
                // remove game from library
                removeGame()
                break;
            case 7:
                // exit 
                running = false;
                System.out.println("Exiting program...");
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
