package project;

public class LanternCard {

	private Color c;
	public LanternCard(Color c){
		setColor(c);
	}
	
	public void setColor(Color c){
		this.c = c;
	}
	
	public Color getColor(){
		return c;
	}
	
}
