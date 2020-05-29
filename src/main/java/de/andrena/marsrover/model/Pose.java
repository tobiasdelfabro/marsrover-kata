package de.andrena.marsrover.model;

public class Pose {

	private Direction direction;
	private Position position;

	public Pose(int x, int y, Direction direction) {
		this.position = new Position(x, y);
		this.direction = direction;
	}

	public Position getPosition() {
		return this.position;
	}

	public Direction getDirection() {
		return direction;
	}

}
