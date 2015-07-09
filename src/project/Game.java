package project;

import java.util.*;

public class Game {

	private int numberOfPlayers;
	private ArrayList<Player> players;
	private String[] playersNames;
	private PlayArea playArea;
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	public PlayArea getPlayArea() {
		return playArea;
	}
	public void setPlayArea(PlayArea playArea) {
		this.playArea = playArea;
	}
	public Game(String... playersNames) throws Exception {
		this.playersNames = playersNames;

		if (playersNames.length > 1 && playersNames.length < 5) {
			this.numberOfPlayers = playersNames.length;
		} else {
			throw new Exception();
		}
	}
	public void startGame() {
		createPlayers(playersNames);
		playArea = new PlayArea(players);
		// give lakeTiles to player
		for (Player player : players) {
			for (int i = 0; i < 3; i++) {
				player.getLakeTiles().add(playArea.getLakeTiles().pop());
			}
		}
	}
	private void createPlayers(String... names) {
		Player player = null;
		players = new ArrayList<Player>();

		// create players according to numberOfPlayers attribute
		for (int i = 0; i < names.length; i++) {
			player = new Player(names[i]);
			// initialize all the stuff for the new player
			players.add(player);
		}
	}
	public static void main(String args[]) throws Exception {

		Game game = new Game("Player1", "Player2");
		game.startGame();
		System.out.println("Four Of A Kind Token Stack");
		while (!game.playArea.getFourOfAKindTokens().isEmpty()) {
			System.out.println(game.playArea.getFourOfAKindTokens().pop()
					.getHonor());
		}
		System.out.println("\nSeven Unique Token Stack");
		while (!game.playArea.getSevenUniqueTokens().isEmpty()) {
			System.out.println(game.playArea.getSevenUniqueTokens().pop()
					.getHonor());
		}

		System.out.println("\nThree Pair Token Stack");
		while (!game.playArea.getThreePairTokens().isEmpty()) {
			System.out.println(game.playArea.getThreePairTokens().pop()
					.getHonor());
		}

		System.out.println("\nGeneric Token Stack");
		while (!game.playArea.getGenericTokens().isEmpty()) {
			System.out.println(game.playArea.getGenericTokens().pop()
					.getHonor());
		}

		System.out.println("\nLake Tiles Stack");
		while (!game.playArea.getLakeTiles().isEmpty()) {
			LakeTile l = game.playArea.getLakeTiles().pop();
			System.out.println(l.getColorOfFourSides().get(0).name() + " "
					+ l.getColorOfFourSides().get(1).name() + " "
					+ l.getColorOfFourSides().get(2).name() + " "
					+ l.getColorOfFourSides().get(3).name() + " \n Platform : "
					+ l.isPlatform());
		}

		for (int i = 0; i < game.numberOfPlayers; i++) {
			System.out.print("Player" + i + " name : "
					+ game.players.get(i).getName());
			System.out.println("\nTheir Lake Tiles :");
			for (int j = 0; j < game.players.get(i).getLakeTiles().size(); j++) {
				System.out.println(j
						+ 1
						+ " "
						+ game.players.get(i).getLakeTiles().get(j)
								.getColorOfFourSides().get(0).name()
						+ " "
						+ game.players.get(i).getLakeTiles().get(j)
								.getColorOfFourSides().get(1).name()
						+ " "
						+ game.players.get(i).getLakeTiles().get(j)
								.getColorOfFourSides().get(2).name()
						+ " "
						+ game.players.get(i).getLakeTiles().get(j)
								.getColorOfFourSides().get(3).name()
						+ " "
						+ "\nPlatform : "
						+ game.players.get(i).getLakeTiles().get(j)
								.isPlatform());
			}
			System.out.println("");
		}
	}
}