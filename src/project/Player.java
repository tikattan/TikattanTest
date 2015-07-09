package project;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
	private String name;
	private int numberOfFavorTokens;
	private ArrayList<LanternCard> lanternCards;
	private ArrayList<LakeTile> lakeTiles;
	private ArrayList<GenericToken> genericTokens;
	private ArrayList<SevenUniqueToken> sevenUniqueTokens;
	private ArrayList<ThreePairToken> threePairTokens;
	private ArrayList<FourOfAKindToken> fourOfAKindTokens;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfFavorTokens() {
		return numberOfFavorTokens;
	}

	public void setNumberOfFavorTokens(int numberOfFavorTokens) {
		this.numberOfFavorTokens = numberOfFavorTokens;
	}

	public ArrayList<LanternCard> getLanternCards() {
		return lanternCards;
	}

	public void setLanternCards(ArrayList<LanternCard> lanternCards) {
		this.lanternCards = lanternCards;
	}

	public ArrayList<GenericToken> getGenericTokens() {
		return genericTokens;
	}

	public void setGenericTokens(ArrayList<GenericToken> genericTokens) {
		this.genericTokens = genericTokens;
	}

	public ArrayList<SevenUniqueToken> getSevenUniqueTokens() {
		return sevenUniqueTokens;
	}

	public void setSevenUniqueTokens(ArrayList<SevenUniqueToken> sevenUniqueTokens) {
		this.sevenUniqueTokens = sevenUniqueTokens;
	}

	public ArrayList<ThreePairToken> getThreePairTokens() {
		return threePairTokens;
	}

	public void setThreePairTokens(ArrayList<ThreePairToken> threePairTokens) {
		this.threePairTokens = threePairTokens;
	}

	public ArrayList<FourOfAKindToken> getFourOfAKindTokens() {
		return fourOfAKindTokens;
	}

	public void setFourOfAKindTokens(ArrayList<FourOfAKindToken> fourOfAKindTokens) {
		this.fourOfAKindTokens = fourOfAKindTokens;
	}

	public ArrayList<LakeTile> getLakeTiles() {
		return lakeTiles;
	}

	public void setLakeTiles(ArrayList<LakeTile> lakeTiles) {
		this.lakeTiles = lakeTiles;
	}

	public Player(String name) {
		this.name = name;
		lanternCards = new ArrayList<LanternCard>();
		lakeTiles = new ArrayList<LakeTile>();
		fourOfAKindTokens = new ArrayList<FourOfAKindToken>();
		threePairTokens = new ArrayList<ThreePairToken>();
		sevenUniqueTokens = new ArrayList<SevenUniqueToken>();
		genericTokens = new ArrayList<GenericToken>();
		numberOfFavorTokens = 0;
	}

	public Player(String name, ArrayList<LanternCard> lanternCards,
			ArrayList<LakeTile> lakeTiles,
			ArrayList<SevenUniqueToken> sevenUniqueTokens, 
			ArrayList<ThreePairToken> threePairTokens,
			ArrayList<FourOfAKindToken> fourOfAKindTokens,
			ArrayList<GenericToken> genericTokens,
			int numberOfFavorTokens) {
		this.name = name;
		this.lanternCards = lanternCards;
		this.lakeTiles = lakeTiles;
		this.sevenUniqueTokens = sevenUniqueTokens;
		this.threePairTokens = threePairTokens;
		this.fourOfAKindTokens = fourOfAKindTokens;
		this.genericTokens = genericTokens;
		this.numberOfFavorTokens = numberOfFavorTokens;
	}

}