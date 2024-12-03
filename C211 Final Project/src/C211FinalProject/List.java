/*
/ Contributor: Amber Baker
/ Date: 12/2/2024
/ Class: C211 Final Project
/ Description: List Object will hold nodes (games) and allow for insertion and removal of nodes. 
/
*/

package C211FinalProject;

public class List {

    Node head;
    int length;

    // default constructor
    public List() {
        this.head = null;
        this.length = 0;
    } // close default constructor

    // non-default constructor
    public List(Node head) {
        this.head = head;
        this.length = 0;
    } // close non-default constructor

    // case 1
    public void displayGames() {
        // will display all nodes stored in the list
        Node temp = head;

    } // close displayGames

    // case 2 
    public Game searchGames(String title) {
        // will traverse the list and return the referenced game object if found
        return null;
    } // close searchGames
    
    // case 3 
    public Game rentGame(String title) {
        Game game = searchGames(title);
        
        // if game != null && game.numAvail > 0
        // set numRented to numRented + 1
        // set numAvail to numAvail - 1
        // return game 
		// return null if not found
        
        return null; 
    } // close rentGame
    
    // case 4
    public Game returnGame(String title) {
		Game game = searchGames(title);
		// if game != null && game.numRented > 0
		// set numRented to numRented - 1
		// set numAvail to numAvail + 1
		// return game
		// return null if not found
		return null;
	} // close returnGame

    // case 5 
    public void addGame(Node n) {
        // will add a Node(game) to the list
        Node temp = head;

        if (temp == null) {
            head = n;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            } // close while loop
            temp.next = n;
        } // close if-else
    } // close insertFront

    // case 6 
    public boolean removeGame() {
        // Need print statements requesting game title
        // then search games to locate the game to be removed
        String title;
        Game game = searchGames(title);
        // if game != null traverse the list and remove the referenced game & return
        // true
        // return false if not found.
        return false;
    } // close removeGame
} // close class
