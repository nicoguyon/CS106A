/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

//Moves Karel to paper, picks it up and returns to starting position. Turns around at the end facing East.
	
public void run() { 
   moveToNewspaper();
   pickBeeper();
   moveBackToStartingPoint();
   turnAround();

}

//Moves karel to newspaper

private void moveToNewspaper() {
	move();
	move();
	turnRight();
	move();
	turnLeft();
	move();
}

//Moves karel back to starting point

private void moveBackToStartingPoint() {
	turnAround();
	move();
	turnRight();
	move();
	turnLeft();
	move();
	move();
}

}
