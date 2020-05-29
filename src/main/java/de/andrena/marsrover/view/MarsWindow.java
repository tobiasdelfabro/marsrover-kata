package de.andrena.marsrover.view;

import javax.swing.JFrame;

public class MarsWindow extends JFrame {

	private static final long serialVersionUID = -6455776789647073154L;
	private JFrame frame;

	public MarsWindow(TilePanel tilePanel) {
		frame = new JFrame("MarsRover UI");
		frame.setDefaultCloseOperation(ViewProperties.defaultCloseOperation);
		frame.setSize(ViewProperties.windowWidth, ViewProperties.windowHeigth);
		frame.add(tilePanel);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	JFrame getFrame() {
		return frame;
	}

}
