package de.andrena.marsrover.view;

import java.awt.Graphics;

import javax.swing.JPanel;

import de.andrena.marsrover.view.model.Tile;
import de.andrena.marsrover.view.model.Tiles;

public class TilePanel extends JPanel {

	private static final long serialVersionUID = -3750350995067764816L;
	private Tiles tiles = new Tiles();

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		this.setBackground(ViewProperties.backgroundColor);

		for (Tile tile : tiles) {
			tile.paint(graphics);
		}
	}

	void fill(Tiles tiles) {
		this.tiles = tiles;
	}

}