package de.andrena.marsrover.view.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.Color;
import java.awt.Graphics2D;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.andrena.marsrover.model.Position;
import de.andrena.marsrover.view.ViewProperties;

class TileTest {

	private Tile tile;
	private Position position;

	@BeforeEach
	void setup() {
		position = new Position(3, 2);
		tile = new Tile(position, Color.GREEN) {
			@Override
			void fillGraphic(Graphics2D graphic) {
			}
		};

	}

	@Test
	void shouldConsiderBorderAndPositionCorrectly_forXPosition() {
		int translatedX = tile.translate(position.getX());
		assertThat(translatedX).isEqualTo(ViewProperties.border + (3 * ViewProperties.cellWidth + 3));
	}

	@Test
	void shouldConsiderBorderAndPositionCorrectly_forYPosition() {
		int translatedX = tile.translate(position.getY());
		assertThat(translatedX).isEqualTo(ViewProperties.border + (2 * ViewProperties.cellWidth + 2));
	}

}
