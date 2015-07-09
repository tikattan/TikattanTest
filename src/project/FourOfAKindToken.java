package project;

public class FourOfAKindToken {

	static final int[] honorList = { 4, 5, 5, 5, 6, 6, 7, 7, 8 };

	private int honor;

	public void setHonor(int honor){
		this.honor = honor;
	}
	
	public int getHonor(){
		return this.honor;
	}
	
	public FourOfAKindToken(int indexOfHonor) {
		setHonor(honorList[indexOfHonor]);
	}
}
