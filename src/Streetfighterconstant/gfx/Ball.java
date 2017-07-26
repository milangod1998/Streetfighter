package Streetfighterconstant.gfx;

import java.awt.Graphics;


public class Ball {

 private int x,y,width=50,height=50;
 private Animation ball;
 public Ball(int x,int y){
	 this.x=x;
	 this.y=y;
	Animation ball= new Animation(100,Assets.player_ball);
	 this.ball= ball;
	 
 }
 
 public void tick(){
	
	x+=3;
 
 
 }
 
public void render(Graphics g)
{  
	ball.tick(); 
	g.drawImage(ball.getCurrentFrame(), x, y, width, height, null, null);
	
}

public int getX()
{
	return x;
}

}
