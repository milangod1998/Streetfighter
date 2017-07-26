package Streetfighter.game.creature;

import Streetfighter.game.entities.Entity;

public abstract class Creature extends Entity {
   public final static int DEFAULT_WIDTH= 200;
   public final static int DEFAULT_HEIGHT= 300; 
	protected int health;
	public Creature(float x, float y) {
		super(x, y,DEFAULT_WIDTH,DEFAULT_HEIGHT);
		// TODO Auto-generated constructor stub
	  health=10;
	 
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;

	}

	
}
