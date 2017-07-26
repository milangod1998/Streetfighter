package Streetfighter.game.states;

import java.awt.Graphics;

import Streetfighter.game.creature.Enemy;
import Streetfighter.game.creature.Player;
import Streetfighter.game.main.Handler;

public abstract class State {
	private static State currentState = null;
	public static void setState(State state){
		currentState = state;
	}

	 public static State getState(){
		 return currentState;

	 }
  
	protected Handler handler;
	public State(Handler handler){
		this.handler = handler;
	}
	 
	public abstract Player getPlayer();
	public abstract Enemy getEnemy();
	public abstract void tick();
  public abstract void render (Graphics g);
  
}
