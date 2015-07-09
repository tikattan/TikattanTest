package project;

public class ThreePairToken {

	static final int[] honorList = { 5, 5, 6, 6, 7, 7, 8, 8, 9 };

	private int honor;

	public void setHonor(int honor){
		this.honor = honor;
	}
	
	public int getHonor(){
		return this.honor;
	}
	
	public ThreePairToken(int indexOfHonor) {
		setHonor(honorList[indexOfHonor]);
	}
}