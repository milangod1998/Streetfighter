package Streetfighter.game.states;
import static Streetfighterconstant.GameConstant.FRAME_FLOOR;

import java.awt.Graphics;

import Streetfighter.game.creature.Enemy;
import Streetfighter.game.creature.Player;
import Streetfighter.game.main.Handler;

public class GameState extends State{
    private Player player;
    private Enemy enemy;
	public GameState(Handler handler){
     super(handler);
		player = new Player(handler,90,FRAME_FLOOR);
       enemy = new Enemy(handler,900,FRAME_FLOOR);
	}
	public void tick() {
		handler.getKeymanager().tick();
		player.tick();	
		enemy.tick();
	
	}

	@Override
	public void render(Graphics g) {
	player.render(g);
	enemy.render(g);
	}

	
	public Player getPlayer(){
		return player;
	}
	public Enemy getEnemy(){
		return enemy;
	}
	
}
