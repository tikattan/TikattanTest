package project;

import java.util.*;

public enum Color {
	ORANGE, GREEN, PURPLE, WHITE, BLUE, RED, BLACK;
	private static final List<Color> VALUES = Collections
			.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Color randomColor() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}