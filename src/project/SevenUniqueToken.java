package project;

public class SevenUniqueToken {

	static final int[] honorList = { 5, 6, 7, 7, 8, 8, 9, 9, 10 };

	private int honor;

	public void setHonor(int honor){
		this.honor = honor;
	}

	public int getHonor(){
		return this.honor;
	}

	public SevenUniqueToken(int indexOfHonor){
		setHonor(honorList[indexOfHonor]);
	}
}
