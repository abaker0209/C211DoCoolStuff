/*
/ Contributor: Amber Baker
/ Date: 12/2/2024
/ Class: C211 Final Project
/ Description: List Object will hold nodes (games) and allow for insertion and removal of nodes. 
/
*/

package C211FinalProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; 

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
        while (temp != null) {
	        
        }
    } // close displayGames

    // case 2 
    public Node searchGames(String title) {
        // will traverse the list and return the referenced game object if found
        Node temp = head; 
        Node found = null;
        

			while (temp != null) {
				if (temp.game.getTitle().equals(title)) {
					found = temp;
					break;
				}
				temp = temp.next;
			} // close while 
        return found; 
    } // close searchGames
    
    // case 3 
    public Node rentGame(String title) {
        Node temp = searchGames(title);
        
        if (temp == null) {
            return null; 
        } else
           temp.game.setNumRented(temp.game.getNumRented() + 1);
           temp.game.setNumAvail(temp.game.getNumAvail() - 1);
         return null; 
    } // close rentGame
    
    // case 4
    public Node returnGame(String title) {
		Node temp = searchGames(title);
		// if game != null && game.numRented > 0
		// set numRented to numRented - 1
		// set numAvail to numAvail + 1
		// return game
		// return null if not found
		return null;
	} // close returnGame

    // case 5 
    public void addGame(Game game) {
        // will add a Node(game) to the list
        Node temp = head;
        Node newNode = new Node(game);

        if (temp == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            } // close while loop
            temp.next = newNode;
        } // close if-else
        write(newNode);
    } // close insertFront

    // case 6 
    public boolean removeGame(String title) {
        // Need print statements requesting game title
        // then search games to locate the game to be removed
        Node temp = searchGames(title);
        // if game != null traverse the list and remove the referenced game & return
        // true
        // return false if not found.
        return false;
    } // close removeGame
    
    public void write(Node newNode) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("games.txt"));
            writer.write(newNode.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
} // close class
