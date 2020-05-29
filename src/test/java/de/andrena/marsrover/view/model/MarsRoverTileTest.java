package de.andrena.marsrover.view.model;

import static org.mockito.ArgumentMatchers.anyInt;

import java.awt.Graphics2D;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import de.andrena.marsrover.model.Direction;
import de.andrena.marsrover.model.Pose;

class MarsRoverTileTest {

	private MarsRoverTile tile;
	private Pose roverPose;

	@BeforeEach
	void setup() {
		roverPose = new Pose(2, 3, Direction.EAST);
		tile = new MarsRoverTile(roverPose);
	}

	@Test
	void shouldInteractWithDirectionToAngleConverter() {
		DirectionToAngleConverter converter = Mockito.mock(DirectionToAngleConverter.class);

		tile.convertAngle(converter, roverPose.getDirection());

		Mockito.verify(converter, Mockito.times(1)).getAngle(roverPose.getDirection());
	}

	@Test
	void shouldDrawRoverUsing8Rectangles() {
		Graphics2D graphic = Mockito.mock(Graphics2D.class);

		tile.createRover(graphic);

		Mockito.verify(graphic, Mockito.times(8)).fillRect(anyInt(), anyInt(), anyInt(), anyInt());
	}

}
