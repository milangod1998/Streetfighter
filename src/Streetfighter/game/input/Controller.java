package Streetfighter.game.input;
import static Streetfighterconstant.GameConstant.FRAME_WIDTH;
import java.awt.Graphics;
import java.util.ArrayList;

import Streetfighterconstant.gfx.Ball;

public class Controller {
	
	private ArrayList<Ball> ball = new ArrayList<Ball>() ;
	
	Ball tempball;
	
	public void tick(){
		
		for(int i=0;i<ball.size();i++){
			 tempball = ball.get(i);
			 if(tempball.getX()==FRAME_WIDTH){
				 removeBall(tempball);
			 }
			 tempball.tick();
		}
	}
	

	public void render(Graphics g)
	{
		for(int i=0;i<ball.size();i++){
			 tempball = ball.get(i);
			 tempball.render(g);
		}
	}

 public void addBall(Ball ball){
	 this.ball.add(ball);
 }

  public void removeBall(Ball ball){
	  this.ball.remove(ball);
  }
}
