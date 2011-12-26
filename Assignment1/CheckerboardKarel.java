import stanford.karel.*;
 
public class CheckerboardKarel extends SuperKarel {
 	
	
	public void run() {	
		sidesAreBlocked();
		putBeeperAndMove();
		frontBlocked();
	}

//	While front is clear, put beeper and move
//  If front is blocked, run blockCheck
//  If front was not blocked, move one more time
	
	private void putBeeperAndMove() {
		while (frontIsClear()) {
			putBeeper();
			move();
			if (frontIsBlocked()) {
				blockCheck();
			} else
					move();
		}
	}
	
	
//	While front is not clear anymore after twoSteps, putBeeper and run blockCheck
//  If front is blocked after performing blockCheck, i.e when Karel turns left and hits a wall facing north; break the loop.
	
	private void frontBlocked() {	
		while (frontIsBlocked()) {
			putBeeper();
			blockCheck();
			if (frontIsBlocked()) {
				break;
			}
			move();
			putBeeperAndMove();
		}
	}
	
	
//	While front is blocked when facing East; reposition Karel to face West. If front is blocked during the process; break the loop.
//  While front is blocked when facing West; reposition Karel to face East. If front is blocked during the process; break the loop.
	
	private void blockCheck() {	
		while (frontIsBlocked()) {
			if (facingEast()) {
				turnLeft();
				if (frontIsBlocked()) {
					break;
		}	
					move();
					turnLeft();	
		}
				else if (facingWest()) {
				turnRight();
				if (frontIsBlocked()) {
					break;
				}
					move();
					turnRight();
				}	
		}

	}


	// If both sides are blocked, i.e in a world with only one row; turn left
	// If front is clear after turning west, putBeeper, move, check if front is blocked, then move.
	
	private void sidesAreBlocked() {
	while (frontIsBlocked()) {
		if (rightIsBlocked()) {
			turnLeft();
		while (frontIsClear()) {
			putBeeper();
			move();
			blockCheck();
			move();
					}		
		
				}
			}
	
		}
	
	
 // end main
	
	}	