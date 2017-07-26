package Streetfighter.game.main;

import Streetfighter.game.input.KeyManager;

public class Handler {

	
	Game game;
	
	public Handler(Game game){
		
		this.game = game;
	}

	 
	
	public KeyManager getKeymanager(){
		return game.getkeymanger();
	}
	
		
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	
}
