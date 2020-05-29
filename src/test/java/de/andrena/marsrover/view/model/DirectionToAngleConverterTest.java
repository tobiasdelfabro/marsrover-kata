package de.andrena.marsrover.view.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.andrena.marsrover.model.Direction;

class DirectionToAngleConverterTest {

	private DirectionToAngleConverter converter;

	@BeforeEach
	void setup() {
		converter = new DirectionToAngleConverter();
	}

	@Test
	void shouldReturn0Degrees_ifDirectionIsEast() {
		assertThat(converter.getAngle(Direction.EAST)).isEqualTo(0);
	}

	@Test
	void shouldReturn90Degrees_ifDirectionIsSouth() {
		assertThat(converter.getAngle(Direction.SOUTH)).isEqualTo(90);
	}

	@Test
	void shouldReturn180Degrees_ifDirectionIsWest() {
		assertThat(converter.getAngle(Direction.WEST)).isEqualTo(180);
	}

	@Test
	void shouldReturn270Degrees_ifDirectionIsNorth() {
		assertThat(converter.getAngle(Direction.NORTH)).isEqualTo(270);
	}

}
