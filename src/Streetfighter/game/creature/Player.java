package Streetfighter.game.creature;

import static Streetfighterconstant.GameConstant.FORCE;
import static Streetfighterconstant.GameConstant.FRAME_FLOOR;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import Streetfighter.game.input.Controller;
import Streetfighter.game.main.Handler;
import Streetfighterconstant.gfx.Animation;
import Streetfighterconstant.gfx.Assets;
import Streetfighterconstant.gfx.Ball;

public class Player extends Creature {
 private Handler handler;
 
  private float currentposition;
private Rectangle playerbounds;
private Controller controller ;
private boolean isvisibledamage= false;
Animation rightmove,kick,idle,punch,jump,shoot,invertkick,squat;
private String move;
private int gravity,ballx=200;
private int velocity;
 private boolean isJump = false;
   public Player(Handler handler,float x,float y){
	   super(x,y);	
	   y = FRAME_FLOOR;
	  controller = new Controller();					
	 this.handler = handler;
	
	 rightmove=new Animation(120,Assets.player_right);
	 kick=new Animation(100,Assets.player_kick);
	 idle=new Animation(120,Assets.player_idle);
     punch= new Animation(80,Assets.player_punch);
     jump = new Animation(100,Assets.player_jump);
     shoot = new Animation(50,Assets.player_shoot);
     invertkick = new Animation(100,Assets.player_invertkick);
      squat = new Animation(100,Assets.player_squat);
     playerbounds = new Rectangle(0,0,width,height);
     
   }
@Override
public void tick() {
	currentposition = x;
	ballx=(int) x+width;
	 idle.tick();
	 { move = "idle";
	 bound(100,0,10,300);
	  
	 }
	 if(handler.getKeymanager().key_A)
		{  bound(80,60,110,10);
		     punch.tick();
		     move= "punch";
		     if(iscollision())
			 {   
		    	 isvisibledamage= true;
		    	 handler.getGame().getEnemy().setMove("fall");
		    	// handler.getGame().getEnemy().setX(handler.getGame().getEnemy().getX());
			     
		    	
			 }
		
		}
    
	if(handler.getKeymanager().key_S)
	{  bound(100,60,110,10);
	     kick.tick();
	     move= "kick";
	     if(iscollision())
		 {   
	    	 handler.getGame().getEnemy().setMove("efall");
	    	handler.getGame().getEnemy().setX(handler.getGame().getEnemy().getX()+50);
		   
		 }
	}
	if(handler.getKeymanager().right)
       
    { rightmove.tick();
      move = "walk";
      bound(100,0,10,300);
      x+=5;
   }		
    if(handler.getKeymanager().left){
    	rightmove.tick();
        move = "walk";
         
    	
    	x-=3;}
    if(handler.getKeymanager().key_space){
    	bound(40,10,40,246);
    	jump.tick();
    	 move ="jump";
    	 
    	 jump();
       }
    if(handler.getKeymanager().key_D){
   	 shoot.tick();
     move = "shoot";
    controller.addBall(new Ball(ballx,(int)((int)y+(int)height+100)/2));
	 	  
     
    
    }
    if(handler.getKeymanager().key_Q){
    	bound(100,60,110,10);
    	invertkick.tick();
      move = "invertkick" ;   
      if(iscollision())
		 {   
	    	 handler.getGame().getEnemy().setMove("efall");
	    	handler.getGame().getEnemy().setX(handler.getGame().getEnemy().getX()+50);
		   
		 }
    }
    
    if(handler.getKeymanager().down){
    	 squat.tick();
      move = "squat";
      }
   
    fall();
    controller.tick();
	  if(iscollision())
		 {
			 x=currentposition;
		 }	 

}


public void render(Graphics g) {
	
	g.drawImage(animation(), (int)x, (int)y, width, height, null, null);//take integer value
   g.setColor(Color.red);
  
	 
   
   //g.fillRect((int)(x+playerbounds.x),(int)(y+playerbounds.y),playerbounds.width,playerbounds.height);
    	controller.render(g);
	  
		
}




 
public BufferedImage animation()
{ 
	if("kick"==getMove())
	return kick.getCurrentFrame(); 
 if("walk"==getMove())
	 return rightmove.getCurrentFrame();

 if("punch"==getMove())
		return punch.getCurrentFrame(); 
 if("jump"==getMove())
  return jump.getCurrentFrame();
 
 if("shoot"==getMove())
	  return shoot.getCurrentFrame();
    if("invertkick"==getMove()){
    	return invertkick.getCurrentFrame();
    }
 if("squat"==getMove())
	 return squat.getCurrentFrame();
	 
	 return idle.getCurrentFrame();
	
}


public void jump(){
	if(!isJump){
		isJump = true;
	gravity = 1;
	velocity =FORCE;
	this.y = this.y + this.velocity;
	}
}
public void fall(){
	if(this.y<FRAME_FLOOR){
		this.velocity = this.velocity + this.gravity;
		this.y = this.y + this.velocity;
	}
	if(this.y>=FRAME_FLOOR){
		isJump = false;
	}
}

		  
void bound(int x,int y,int width,int height){
	playerbounds.x =x;
	playerbounds.y =y;
	playerbounds.width =width;
	playerbounds.height =height;
	
}
	
public String getMove(){
	return move;
	
}
 public Rectangle getBound()
 {
	 return playerbounds;
 }

public boolean iscollision()
{
	
	if(((int)x+(int)(handler.getGame().getPlayer().getBound().x)+(int)(playerbounds.width))>=((int)(handler.getGame().getEnemy().getBound().x+(int)(handler.getGame().getEnemy().getX()))))
		return true;
	
	if(((int)y+(int)(handler.getGame().getPlayer().getBound().y)+(int)(playerbounds.height))==( (int)(handler.getGame().getEnemy().getY())))
		return true;
	else
	   return false;
}

public Boolean getvisibledamage(){
	return isvisibledamage;
}
public void setvisibledamage(Boolean isvisibledamage){
 	this.isvisibledamage= isvisibledamage;
  
}

}



