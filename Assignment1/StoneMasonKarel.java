/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	
//	Runs cleanRow. While front is blocked, run switchColumn

	public void run() {
		cleanRow();
		
		while (frontIsBlocked()) {
			switchColumn();
		}
	}

	
//	Positions Karel if left/right is clear, depending on position
	
	private void switchColumn() {
		while (leftIsClear()) {
			upAndTurnLeft();
			cleanRow();
		if (rightIsClear()) {
			upAndTurnRight();
			cleanRow();

			}
	}
		
}
	
//	If beepersPresent, skip beeper and move instead. If not, put beeper. If front is clear, keep moving

	private void cleanRow() {
		while (beepersPresent()) {
			moveFourTimes();
		}
			putBeeper();
			while (frontIsClear()) {
			moveFourTimes();
				
		while (noBeepersPresent()) {
			putBeeper();
		}
	}
}
	
//	Positions karel to face west at next upper column
	
	private void upAndTurnLeft() {
		turnLeft();
		move();
		turnLeft();
	}
	
//	Positions karel to face east at next upper column
	
	private void upAndTurnRight() {
		turnRight();
		move();
		turnRight();
	}
	
//	Moves karel four times
	
	private void moveFourTimes() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}

}
