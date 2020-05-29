package de.andrena.marsrover.view.model;

import static de.andrena.marsrover.view.ViewProperties.cellWidth;
import static de.andrena.marsrover.view.ViewProperties.marsRoverColor;

import java.awt.Graphics2D;

import de.andrena.marsrover.model.Direction;
import de.andrena.marsrover.model.Pose;

public class MarsRoverTile extends Tile {

	private Direction roverDirection;

	public MarsRoverTile(Pose pose) {
		super(pose.getPosition(), marsRoverColor);
		roverDirection = pose.getDirection();
	}

	@Override
	void fillGraphic(Graphics2D graphic) {
		rotateToCorrectDirection(graphic);
		createRover(graphic);
	}

	private void rotateToCorrectDirection(Graphics2D graphic) {
		int angle = convertAngle(new DirectionToAngleConverter(), roverDirection);
		graphic.rotate(Math.toRadians(angle), cellWidth / 2, cellWidth / 2);
	}

	void createRover(Graphics2D graphic) {
		int block = cellWidth / 10;
		graphic.fillRect(0, 0, 7 * block, 2 * block);
		graphic.fillRect(0, 8 * block, 7 * block, 2 * block);
		graphic.fillRect(block, 3 * block, 5 * block, 4 * block);
		graphic.fillRect(2 * block, 2 * block, 2 * block, block);
		graphic.fillRect(2 * block, 7 * block, 2 * block, block);
		graphic.fillRect(7 * block, 4 * block, block, 2 * block);
		graphic.fillRect(8 * block, 3 * block, block, 4 * block);
		graphic.fillRect(9 * block, 2 * block, block, 6 * block);
	}

	int convertAngle(DirectionToAngleConverter converter, Direction direction) {
		return converter.getAngle(direction);
	}

}
