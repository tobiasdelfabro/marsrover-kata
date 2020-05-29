package de.andrena.marsrover.model;

public class RoverTarget {

	private Position position;

	public RoverTarget(int x, int y) {
		this.position = new Position(x, y);
	}

	public Position getPosition() {
		return position;
	}
}
