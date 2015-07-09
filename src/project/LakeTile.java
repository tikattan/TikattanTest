package project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class LakeTile {

	private Vector<Color> colorOfFourSides;
	private boolean hasPlatform;
	private Random random = new Random();

	public LakeTile() {
		Vector<Color> cos = new Vector<Color>(0);
		setPlatform(random.nextBoolean());
		for (int i = 0; i < 4; i++) {
			cos.insertElementAt(Color.randomColor(), i);
		}
		setColorOfFourSides(cos);
	}

	public Vector<Color> getColorOfFourSides() {
		return colorOfFourSides;
	}

	public void setColorOfFourSides(Vector<Color> colorOfFourSides) {
		this.colorOfFourSides = colorOfFourSides;
	}

	public boolean isPlatform() {
		return hasPlatform;
	}

	public void setPlatform(boolean hasPlatform) {
		this.hasPlatform = hasPlatform;
	}
}