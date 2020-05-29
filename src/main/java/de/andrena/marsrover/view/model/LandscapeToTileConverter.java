package de.andrena.marsrover.view.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import de.andrena.marsrover.model.Field;
import de.andrena.marsrover.model.Landscape;
import de.andrena.marsrover.model.Pose;
import de.andrena.marsrover.model.Position;
import de.andrena.marsrover.model.Surface;

public class LandscapeToTileConverter {

	public List<Tile> convert(Landscape landscape) {
		List<Tile> gridpoints = new ArrayList<Tile>();
		gridpoints.addAll(toGroundTiles(landscape.getSurface()));
		gridpoints.add(toTargetTile(landscape.getTargetPosition()));
		gridpoints.add(toRoverTile(landscape.getMarsRoverPose()));
		return gridpoints;
	}

	private Tile toTargetTile(Position position) {
		return new RoverTargetTile(position);
	}

	private Tile toRoverTile(Pose pose) {
		return new MarsRoverTile(pose);
	}

	private List<Tile> toGroundTiles(Surface surface) {
		return surface.stream().map(f -> toGroundTile(f)).collect(Collectors.toList());
	}

	private Tile toGroundTile(Field field) {
		return new GroundTile(field.getPosition());
	}

}
