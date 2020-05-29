package de.andrena.marsrover.view.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.andrena.marsrover.model.Landscape;

public class Tiles implements Iterable<Tile> {

	private List<Tile> tiles = new ArrayList<Tile>();

	public Tiles() {
	}

	public Tiles(Landscape landscape) {
		this.tiles = new LandscapeToTileConverter().convert(landscape);
	}

	@Override
	public Iterator<Tile> iterator() {
		return tiles.iterator();
	}
}
