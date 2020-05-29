package de.andrena.marsrover.view;

import de.andrena.marsrover.model.Landscape;
import de.andrena.marsrover.view.model.Tiles;

public class MarsDisplay implements Display {

	private TilePanel tilePanel;

	public MarsDisplay() {
		tilePanel = new TilePanel();
		new MarsWindow(tilePanel);
	}

	@Override
	public void update(Landscape landscape) {
		tilePanel.fill(new Tiles(landscape));
		tilePanel.repaint();
	}

}
