package de.andrena.marsrover.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SurfaceTest {

	@Test
	void shouldCreateSurfaceWithFieldsAccordingToDimensionsInProperties() {
		Surface surface = new Surface();

		assertThat(surface.getFields()).hasSize(GameProperties.xMax * GameProperties.yMax);
	}

	@Test
	void shouldNotContainNullFields() {
		Surface surface = new Surface();

		surface.stream().forEach(f -> assertThat(f).isNotNull());
	}

}
