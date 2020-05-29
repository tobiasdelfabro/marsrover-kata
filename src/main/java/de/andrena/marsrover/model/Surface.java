package de.andrena.marsrover.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Surface {

	private List<Field> fields = new ArrayList<Field>();

	public Surface() {
		for (int x = 0; x < GameProperties.xMax; x++) {
			for (int y = 0; y < GameProperties.yMax; y++) {
				fields.add(new Field(new Position(x, y)));
			}
		}
	}

	public Stream<Field> stream() {
		return fields.stream();
	}

	List<Field> getFields() {
		return fields;
	}

}
