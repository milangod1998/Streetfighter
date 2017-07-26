package Streetfighter.game.creature;

import static Streetfighterconstant.GameConstant.FORCE;
import static Streetfighterconstant.GameConstant.FRAME_FLOOR;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;





import Streetfighter.game.input.Controller;
import Streetfighter.game.main.Handler;
import Streetfighterconstant.gfx.Animation;
import Streetfighterconstant.gfx.Assets;
import Streetfighterconstant.gfx.Ball;

public class Enemy  extends Creature{
	 private int counter=0,slow =0,ecounter=0,eslow=0,rcounter=0,rslow=0; 
	Handler handler;
	
	private Rectangle enemybounds;
	private float currentposition;
	 private Controller controller ;
	 Animation leftmove,kick,idle,punch,jump,shoot,invertkick,squat,damage,edamage,visibledamage,reversal;
	 private String move= "idle";
	 private int gravity,ballx=200;
	 private int velocity;
	  private boolean isJump = false;
	  
	
	public Enemy(Handler handler,float x, float y) {
		super(x, y);
		this.handler=handler;
		 y = FRAME_FLOOR;
			controller = new Controller();
		 this.handler = handler;
		 leftmove=new Animation(120,Assets.enemy_left);
		 kick=new Animation(100,Assets.enemy_kick);
		 idle=new Animation(120,Assets.enemy_idle);
	     punch= new Animation(50,Assets.enemy_punch);
	     jump = new Animation(100,Assets.enemy_jump);
	     shoot = new Animation(50,Assets.enemy_shoot);
	     invertkick = new Animation(100,Assets.enemy_invertkick);
	      squat = new Animation(100,Assets.enemy_squat);
	     enemybounds = new Rectangle(0,0,width,height);
	   damage = new Animation(100,Assets.enemy_fall);
	  edamage = new Animation(100,Assets.enemy_2fall);
	  visibledamage= new Animation(120,Assets.visibledamage);
	 reversal = new Animation(120,Assets.enemy_reversal);
	}

	@Override
	public void tick() {
		currentposition = x;
		ballx=(int) x+width;
		
		if((move!="efall")&&(move!="fall")&&(move!="reversal"))
	    {idle.tick();
	    bound(80,0,10,300);
		move = "idle";
		}
		
		
		
		
		 if(handler.getKeymanager().key4)
			{
			     punch.tick();
			     move= "punch";
			}
	    
		if(handler.getKeymanager().key5)
		{
		     kick.tick();
		     move= "kick";
		}
		if(handler.getKeymanager().key_J)
	       
	    { leftmove.tick();
	      move = "walk";
	       x-=3;
	   }		
	    if(handler.getKeymanager().key_L){
	    	leftmove.tick();
	        move = "walk";
	         
	    	
	    	x+=3;}
	    if(handler.getKeymanager().key0){
	    	 jump.tick();
	    	 move ="jump";
	    	 jump();
	       }
	    if(handler.getKeymanager().key6){
	   	 shoot.tick();
	     move = "shoot";
	    controller.addBall(new Ball(ballx,((int)y+(int)enemybounds.y)/2));
		 	  
	     
	    
	    }
	    if(handler.getKeymanager().key7){
	      invertkick.tick();
	      move = "invertkick" ;   
	    }
	    
	    if(handler.getKeymanager().key_K){
	    	 squat.tick();
	      move = "squat";
	      }
	    fall();
	  
	    damage();
	    edamage();
	    reversal();
	    if(iscollision())
		 {   
			 x=currentposition;
		 }	

		  controller.tick();
	 
	  
	
	}
	

	@Override
	public void render(Graphics g) {
		g.drawImage(animation(), (int)x,(int) y-45, width, height+45, null, null);
		//g.fillRect((int)(x+enemybounds.x),(int)(y+enemybounds.y),enemybounds.width,enemybounds.height);
		if(handler.getGame().getPlayer().getvisibledamage()){ 
		{g.drawImage(visibledamage.getCurrentFrame(),(int)(handler.getGame().getPlayer().getX()+170),(int)(handler.getGame().getPlayer().getY()),100,100,null,null);
		handler.getGame().getPlayer().setvisibledamage(false);;
		}
		}
	
	}

	public BufferedImage animation()
	{ if("kick"==getMove())
		return kick.getCurrentFrame(); 
	 if("walk"==getMove())
		 return leftmove.getCurrentFrame();

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
		 if("fall"==getMove())
				 
		 return damage.getCurrentFrame();
	
		 if("efall"==getMove())
			 return edamage.getCurrentFrame();
		 if("reversal"==getMove()){
			 return reversal.getCurrentFrame();
		 }
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


	public void bound(int x,int y,int width,int height){
		enemybounds.x =x;
		enemybounds.y =y;
		enemybounds.width =width;
		enemybounds.height =height;
		
	}

	public Rectangle getBound()
	 {
		 return enemybounds;
	 }

	
	public void setMove(String move){
		 this.move= move;
	 }
	public String getMove(){
		 return move;
	 }
	public boolean iscollision()
	{
		
		if(((int)x+(int)(handler.getGame().getEnemy().getBound().x))<=((int)(handler.getGame().getPlayer().getBound().x+(int)(handler.getGame().getPlayer().getX())+(int)(handler.getGame().getPlayer().getBound().width))))
			return true;
		if(((int)y+(int)(handler.getGame().getEnemy().getBound().y))>=((int)(handler.getGame().getPlayer().getBound().y+(int)(handler.getGame().getPlayer().getY())+(int)(handler.getGame().getPlayer().getBound().height))))
			return true;
		else
		   return false;
	
	}

	public void damage()
	{ 
    if(move=="fall")
    {       
    	if(slow%6==0)
    	
    {     damage.tick();
    	 visibledamage.tick();
        counter++;
    	if(counter==3)
    	{
    		move = "idle";
    		counter=0;
    	}
    }

        
    slow++;
    }
	}
	
	public void edamage()
	{   
	    if("efall"==getMove())
	    {  if(ecounter!=2)
	           x+=2;
	            
	    	if(ecounter==0)
    		   jump();
	    	
	    	if((eslow)%25==0)
	   	  { 
	    		edamage.tick();
	    	   ecounter++;
	    		    	
	    	if(ecounter==3)
	    	     { 
	    		    move = "reversal";
	    		    ecounter=0;
	    	     }
	      }
	          eslow++;
	    }
	
	}

  public void reversal()
  {
	  if("reversal"==getMove())
	  {
		  if(rcounter!=2)
	           x+=2;
	            
	    	if(rcounter==0)
   		       jump();
	    	
	    	if((rslow)%17==0)
	   	  { 
	    		reversal.tick();
	    	   rcounter++;
	    		    	
	    	if(rcounter==3)
	    	     { 
	    		    move = "idle";
	    		    rcounter=0;
	    	     }
	      }
	          rslow++;
	    }
	  
  }
}