package de.andrena.marsrover.view.model;

import de.andrena.marsrover.model.Direction;

public class DirectionToAngleConverter {

	public int getAngle(Direction roverDirection) {
		switch (roverDirection) {
		case EAST:
			return 0;
		case SOUTH:
			return 90;
		case WEST:
			return 180;
		case NORTH:
			return 270;
		default:
			return 0;
		}
	}

}
