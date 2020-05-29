package de.andrena.marsrover.view;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.Color;

import org.junit.jupiter.api.Test;

class ViewPropertiesTest {

	@Test
	void backgroundShouldBeDarkGray() {
		assertThat(ViewProperties.backgroundColor).isEqualTo(Color.DARK_GRAY);
	}

	@Test
	void groundShouldBeDusty() {
		assertThat(ViewProperties.groundColor).isEqualTo(new Color(227, 192, 157));
	}

	@Test
	void roverShouldBeBlack() {
		assertThat(ViewProperties.marsRoverColor).isEqualTo(Color.BLACK);
	}

	@Test
	void targetShouldBeRed() {
		assertThat(ViewProperties.targetColor).isEqualTo(Color.RED);
	}

}
