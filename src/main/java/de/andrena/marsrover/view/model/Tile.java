package de.andrena.marsrover.view.model;

import static de.andrena.marsrover.view.ViewProperties.cellWidth;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import de.andrena.marsrover.model.Position;
import de.andrena.marsrover.view.ViewProperties;

public abstract class Tile {

	private Position position;
	private Color color;

	public Tile(Position position, Color color) {
		this.position = position;
		this.color = color;
	}

	public void paint(Graphics graphics) {
		graphics.setColor(color);
		Graphics2D graphic = (Graphics2D) graphicForTile(graphics);

		fillGraphic(graphic);
	}

	abstract void fillGraphic(Graphics2D graphic);

	int translate(int position) {
		return ViewProperties.border + (position * cellWidth + position);
	}

	Graphics graphicForTile(Graphics graphics) {
		return graphics.create(translate(position.getX()), translate(position.getY()), cellWidth, cellWidth);
	}

}
