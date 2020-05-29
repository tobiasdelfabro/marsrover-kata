package de.andrena.marsrover.view;

import java.awt.Color;

import javax.swing.JFrame;

import de.andrena.marsrover.model.GameProperties;

public interface ViewProperties {

	int defaultCloseOperation = JFrame.EXIT_ON_CLOSE;

	int cellWidth = 60;
	int border = 1;

	int windowWidth = ((GameProperties.xMax) * (cellWidth + 1)) + 2 * border + 5;
	int windowHeigth = ((GameProperties.yMax) * (cellWidth + 2)) + 2 * border + 20;

	Color groundColor = new Color(227, 192, 157);
	Color backgroundColor = Color.DARK_GRAY;
	Color marsRoverColor = Color.BLACK;
	Color targetColor = Color.RED;

}
