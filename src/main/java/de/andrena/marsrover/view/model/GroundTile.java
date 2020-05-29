package de.andrena.marsrover.view.model;

import static de.andrena.marsrover.view.ViewProperties.cellWidth;

import java.awt.Graphics2D;

import de.andrena.marsrover.model.Position;
import de.andrena.marsrover.view.ViewProperties;

public class GroundTile extends Tile {

	public GroundTile(Position position) {
		super(position, ViewProperties.groundColor);
	}

	@Override
	void fillGraphic(Graphics2D graphic) {
		graphic.fillRect(0, 0, cellWidth, cellWidth);
	}

}
