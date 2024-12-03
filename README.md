# C211DoCoolStuff
C211-37801 Team Repository 

Project Title: Virtual Library - Gaming Haven  

This virtual library will hold a list Game Of The Year titles available for rent. 
The library will track the number of available copies both on loan and in the existing inventory. 

Collaborators: 
Amber Baker, Scott Nguyen, Samuel Vaughn 

Contributors by Class: 
Amber Baker - List, GameLibrary 
Samuel Vaughn - Game, GameLibrary  
Scott Nguyen - Node

Class Outline: 
Game - Class used to instantiate a game oject. 
      Instance Variables: String title, String genre, String console, int yearPublished, int                              numAvail, int numRented  
Node - Will store the game and a link to the next game on the list 
      Instance Variables: Game game, Node next 
List - Creates a list of Nodes 
       Instance Variables: Node head, int Length 
       Methods: displayGames(); searchGames(); rentGame(); returnGame(); addGame();   
                removeGame(); 
GameLibrary - Will hold the Main and Display Menu 
       Methods: main(String[] args); displayMenu(); 
