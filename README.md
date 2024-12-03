# C211DoCoolStuff
C211-37801 Team Repository 

**Project Title:**  
Virtual Library - Gaming Haven  

**Project Description**
This virtual library will hold a list Game Of The Year titles available for rent. 
The library will track the number of available copies both on loan and in the existing inventory. 

**Collaborators**
Amber Baker, Scott Nguyen, Samuel Vaughn 


/*Project Phase 2 Updates*/

** Game Class **
- Contributor: Scott Nguyen                                                                   
- Description: Class used to instantiate a game oject.                                       
- Instance Variables: String title, String genre, String console, int yearPublished, int        numAvail, int numRented                                   

** Node Class **
- Contributor: Scott Nguyen 
- Description: Will store the game and a link to the next game on the list 
- Instance Variables: Game game, Node next 
      
** List Class **  
- Contributor: Amber Baker
- Description: Creates a list of Nodes 
- Instance Variables: Node head, int Length 
- Methods: displayGames(); searchGames(); rentGame(); returnGame(); addGame();             removeGame(); 
             
** GameLibrary **  
- Collaborators: Amber Baker, Scott Nguyen, Samuel Vaughn 
- Description: Will hold the Main and Display Menu 
- Methods: main(String[] args); displayMenu(); 
