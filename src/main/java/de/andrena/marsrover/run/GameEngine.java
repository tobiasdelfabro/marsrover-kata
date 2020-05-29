package de.andrena.marsrover.run;

import de.andrena.marsrover.model.Direction;
import de.andrena.marsrover.model.GameProperties;
import de.andrena.marsrover.model.Landscape;
import de.andrena.marsrover.model.MarsRover;
import de.andrena.marsrover.model.Pose;
import de.andrena.marsrover.model.RoverTarget;
import de.andrena.marsrover.view.Display;
import de.andrena.marsrover.view.MarsDisplay;

public class GameEngine {

	private Display display;
	private MarsRover marsRover;
	private Landscape marsLandscape;
	private RoverTarget roverTarget;

	public GameEngine() {
		marsRover = new MarsRover(new Pose(0, 0, Direction.EAST), "MMRMMMM");
		roverTarget = new RoverTarget(3, 8);
		marsLandscape = new Landscape(marsRover, roverTarget);
		display = new MarsDisplay();
	}

	public void run() {
		while (marsRover.hasNextCommand()) {
			marsRover.executeNextCommand();
			display.update(marsLandscape);
			waitForNextTurn();
		}
	}

	private void waitForNextTurn() {
		try {
			Thread.sleep(GameProperties.TIME_BETWEEN_TURNS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}