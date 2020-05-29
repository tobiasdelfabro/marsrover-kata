package de.andrena.marsrover.view.model;

import static de.andrena.marsrover.view.ViewProperties.cellWidth;

import java.awt.Graphics2D;

import de.andrena.marsrover.model.Position;
import de.andrena.marsrover.view.ViewProperties;

public class RoverTargetTile extends Tile {

	public RoverTargetTile(Position position) {
		super(position, ViewProperties.targetColor);
	}

	@Override
	void fillGraphic(Graphics2D graphic) {
		graphic.fillOval(0, 0, cellWidth - 1, cellWidth - 1);
	}

}
