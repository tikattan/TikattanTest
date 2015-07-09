package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;

public class PlayArea {

	private int numberOfFavorTokens;
	private Supply supply;
	private LakeTile startLakeTile;
	private Stack<LakeTile> lakeTiles;
	private Stack<SevenUniqueToken> sevenUniqueTokens;
	private Stack<ThreePairToken> threePairTokens;
	private Stack<FourOfAKindToken> fourOfAKindTokens;
	private Stack<GenericToken> genericTokens;
	private int numberOfEachToken = 9;
	private int numberOfGenericToken = 3;
	private int numberOfLakeTiles = 35;
	
	public PlayArea(ArrayList<Player> players) {
		numberOfFavorTokens = 20;
		supply = new Supply(players.size());
		initializeLakeTiles();
		initializeDedicationTokens();
	}
	
	private void initializeLakeTiles() {
		// creation of Lake tiles
		lakeTiles = new Stack<LakeTile>();
		for (int i = 0; i < numberOfLakeTiles; i++) {
			lakeTiles.add(new LakeTile());
		}
	}

	private void initializeDedicationTokens() {

		// creation of Dedication Token
		sevenUniqueTokens = new Stack<SevenUniqueToken>();
		threePairTokens = new Stack<ThreePairToken>();
		fourOfAKindTokens = new Stack<FourOfAKindToken>();
		genericTokens = new Stack<GenericToken>();

		for (int i = 0; i < numberOfEachToken; i++) {
			fourOfAKindTokens.add(new FourOfAKindToken(i));
			threePairTokens.add(new ThreePairToken(i));
			sevenUniqueTokens.add(new SevenUniqueToken(i));
		}

		for (int i = 0; i < numberOfGenericToken; i++) {
			//add 4 generic token into generic token stack
			genericTokens.add(new GenericToken());
		}
	}
	
	public Supply getSupply() {
		return supply;
	}
	
	public void setSupply(Supply supply) {
		this.supply = supply;
	}
	
	public LakeTile getStartLakeTile() {
		return startLakeTile;
	}
	
	public void setStartLakeTile(LakeTile startLakeTile) {
		this.startLakeTile = startLakeTile;
	}

	public Stack<LakeTile> getLakeTiles() {
		return lakeTiles;
	}
	
	public void setLakeTiles(Stack<LakeTile> lakeTiles) {
		this.lakeTiles = lakeTiles;
	}
	
	public Stack<SevenUniqueToken> getSevenUniqueTokens() {
		return sevenUniqueTokens;
	}

	public void setSevenUniqueTokens(Stack<SevenUniqueToken> sevenUniqueTokens) {
		this.sevenUniqueTokens = sevenUniqueTokens;
	}

	public Stack<ThreePairToken> getThreePairTokens() {
		return threePairTokens;
	}

	public void setThreePairTokens(Stack<ThreePairToken> threePairTokens) {
		this.threePairTokens = threePairTokens;
	}
	
	public Stack<FourOfAKindToken> getFourOfAKindTokens() {
		return fourOfAKindTokens;
	}

	public void setFourOfAKindTokens(Stack<FourOfAKindToken> fourOfAKindTokens) {
		this.fourOfAKindTokens = fourOfAKindTokens;
	}

	public Stack<GenericToken> getGenericTokens() {
		return genericTokens;
	}

	public void setGenericToken(Stack<GenericToken> genericTokens) {
		this.genericTokens = genericTokens;
	}

	public int getNumberOfFavorTokens() {
		return numberOfFavorTokens;
	}

	public void setNumberOfFavorTokens(int numberOfFavorTokens) {
		this.numberOfFavorTokens = numberOfFavorTokens;
	}

}
