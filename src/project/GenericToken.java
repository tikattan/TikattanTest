package project;

public class GenericToken {

	private int honor;

	public void setHonor(int honor){
		this.honor = honor;
	}
	
	public int getHonor(){
		return this.honor;
	}
	
	public GenericToken() {
		this.setHonor(4);
	}
}
