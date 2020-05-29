package de.andrena.marsrover.model;

public class MarsRover {

	private Pose pose;

	public MarsRover(Pose pose, String command) {
		this.pose = pose;
	}

	// TODO
	public Pose executeNextCommand() {
		return pose;
	}

	// TODO
	public boolean hasNextCommand() {
		return true;
	}

	public Pose getPose() {
		return pose;
	}

}
