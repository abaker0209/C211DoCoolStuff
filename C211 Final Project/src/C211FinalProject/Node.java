/*
/ Contributor:  Scott Nguyen
/ Date: 12/2/2024
/ Class: C211 Final Project
/ Description:
/
*/

package C211FinalProject;

public class Node {
    // node object that stores a game value and a pointer to the next node
    Game game;
    Node next;
    
    // Default constructor
    public Node() {
        this.game = null;
        this.next = null;
    }
    
    // Constructor with a Game value
    public Node(Game game) {
        this.game = game;
        this.next = null;
    }
}

