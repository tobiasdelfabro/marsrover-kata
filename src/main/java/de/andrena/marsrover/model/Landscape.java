package de.andrena.marsrover.model;

public class Landscape {

	private MarsRover marsRover;
	private RoverTarget roverTarget;
	private Surface surface = new Surface();

	public Landscape(MarsRover marsRover, RoverTarget roverTarget) {
		this.marsRover = marsRover;
		this.roverTarget = roverTarget;
	}

	public Surface getSurface() {
		return surface;
	}

	public Pose getMarsRoverPose() {
		return marsRover.getPose();
	}

	public Position getTargetPosition() {
		return roverTarget.getPosition();
	}

}
