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

    // Case 2: Search for a game by title
    public void searchGames() {
        System.out.print("Enter the title of the game to search: ");
        String title = scanner.nextLine();
        Game game = gameList.searchGames(title);
        if (game != null) {
            System.out.println("Game Found: " + game.toString());
        } else {
            System.out.println("Game not found.");
        }
    }

    // Case 3: Rent a game
    public void rentGame() {
        System.out.print("Enter the title of the game to rent: ");
        String title = scanner.nextLine();
        Game game = gameList.rentGame(title);
        if (game != null) {
            System.out.println("You have rented: " + game.getTitle());
        } else {
            System.out.println("The game is not available for rent.");
        }
    }

    // Case 4: Return a rented game
    public void returnGame() {
        System.out.print("Enter the title of the game to return: ");
        String title = scanner.nextLine();
        Game game = gameList.returnGame(title);
        if (game != null) {
            System.out.println("You have returned: " + game.getTitle());
        } else {
            System.out.println("This game was not rented.");
        }
    }

    // Case 5: Add a game to the library
    public void addGame() {
        System.out.print("Enter the title of the game: ");
        String title = scanner.nextLine();
        System.out.print("Enter the genre of the game: ");
        String genre = scanner.nextLine();
        System.out.print("Enter the console of the game: ");
        String console = scanner.nextLine();
        System.out.print("Enter the year of release: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of available games: ");
        int numAvail = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the price of the game: ");
        double price = Double.parseDouble(scanner.nextLine());

        Game newGame = new Game(title, genre, console, year, numAvail, 0, price);
        Node newNode = new Node(newGame);
        gameList.addGame(newNode);
        System.out.println("Game added successfully!");
    }

    // Case 6: Remove a game from the library
    public void removeGame() {
        System.out.print("Enter the title of the game to remove: ");
        String title = scanner.nextLine();
        boolean success = gameList.removeGame(title);
        if (success) {
            System.out.println("Game removed successfully.");
        } else {
            System.out.println("Game not found.");
        }
    }

    // main method for testing
    public static void main(String[] args) {

        GameLibrary library = new GameLibrary();
        library.displayMenu();

    } // close main

    public void displayMenu() {
        boolean running = true;
        // this method will house the display menu for the game library
        // Contributors: Samuel Vaughn & Amber Baker

        while (run != false) {

            System.out.println("Welcome to the Game Library!");
            System.out.println("1. Display All Games.");
            System.out.println("2. Search Games.");
            System.out.println("3. Rent Game.");
            System.out.println("4. Return Game.");
            System.out.println("5. Add New Game to Library.");
            System.out.println("6. Remove Game from Library.");
            System.out.println("7. Exit.");

            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

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
