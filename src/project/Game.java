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
	public static void main(String args[]) {
	}
}