package Streetfighterconstant.gfx;

import java.awt.image.BufferedImage;



public class Assets {
	public static BufferedImage visibledamage0;
	public static BufferedImage fall0,fall1,fall2;
	public static BufferedImage walk0,walk1,walk2;
	public static BufferedImage kick0,kick1,kick2,kick3;
	public static BufferedImage jump0,jump1,jump2,jump3,jump4;
	public static BufferedImage  idle0,idle1,idle2,idle3;
	public static BufferedImage  punch0,punch1,punch2;
	public static BufferedImage  shoot0,shoot1,shoot2,shoot3;
	public static BufferedImage ball0,ball1;
	public static BufferedImage invertkick0,invertkick1,invertkick2,invertkick3,invertkick4;
	public static BufferedImage squat;
	public static BufferedImage[] player_squat;
	public static BufferedImage[] player_right;
	public static BufferedImage[] player_kick;
	public static BufferedImage[] player_idle;
	public static BufferedImage[] player_punch;
	public static BufferedImage[] player_jump;
	public static BufferedImage[] player_shoot;
	public static BufferedImage[] player_ball;
	public static BufferedImage[] player_invertkick;
	public static BufferedImage[] player_fall;
	public static BufferedImage[] visibledamage;
	
	//
	  public static BufferedImage enemy2fall0,enemy2fall1,enemy2fall2;
	    public static BufferedImage enemyfall0,enemyfall1,enemyfall2;
	    public static BufferedImage enemywalk0,enemywalk1,enemywalk2;
		public static BufferedImage enemykick0,enemykick1,enemykick2,enemykick3;
		public static BufferedImage enemyjump0,enemyjump1,enemyjump2,enemyjump3,enemyjump4;
		public static BufferedImage  enemyidle0,enemyidle1,enemyidle2,enemyidle3;
		public static BufferedImage  enemypunch0,enemypunch1,enemypunch2;
		public static BufferedImage  enemyshoot0,enemyshoot1,enemyshoot2,enemyshoot3;
		public static BufferedImage enemyball0,enemyball1;
		public static BufferedImage enemyinvertkick0,enemyinvertkick1,enemyinvertkick2,enemyinvertkick3,enemyinvertkick4;
		public static BufferedImage enemysquat;
		public static BufferedImage enemyreversal0,enemyreversal1,enemyreversal2;
		
		public static BufferedImage[] enemy_squat;
		public static BufferedImage[] enemy_left;
		public static BufferedImage[]enemy_kick;
		public static BufferedImage[] enemy_idle;
		public static BufferedImage[]enemy_punch;
		public static BufferedImage[] enemy_jump;
		public static BufferedImage[] enemy_shoot;
		public static BufferedImage[]enemy_ball;
		public static BufferedImage[] enemy_fall;
		public static BufferedImage[] enemy_2fall;
		public static BufferedImage[]enemy_invertkick;
		public static BufferedImage[]enemy_reversal;
		
	public static void init(){
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/ken.png"));
		
		
		//player details
		player_right= new BufferedImage[3];
		player_kick = new BufferedImage[3];
		player_idle = new BufferedImage[4];
		player_punch = new BufferedImage[3];
		player_jump= new BufferedImage[5];
		player_shoot = new BufferedImage[4];
       player_ball = new BufferedImage[2];
       player_invertkick = new BufferedImage[5];
       player_squat = new BufferedImage[1];
       
       enemy_left= new BufferedImage[3];
		enemy_kick = new BufferedImage[4];
		enemy_idle = new BufferedImage[4];
		enemy_punch = new BufferedImage[3];
		enemy_jump= new BufferedImage[5];
		enemy_shoot = new BufferedImage[4];
      enemy_ball = new BufferedImage[2];
      enemy_invertkick = new BufferedImage[5];
      enemy_squat = new BufferedImage[1];
	  enemy_fall= new BufferedImage[3];
	  enemy_2fall= new BufferedImage[3];
       visibledamage= new BufferedImage[1];
       enemy_reversal= new BufferedImage[3];
       
       
       
       
       walk0 = sheet.crop(15, 242, 53, 78);
	   walk1 = sheet.crop(229, 242, 53, 78);
	   walk2 = sheet.crop(156, 242, 53 , 78);
	   player_right[0]= walk0;
       player_right[1]= walk1;
       player_right[2]= walk2;
  
  
       kick0 = sheet.crop(19, 481, 60, 79);
       //kick1 = sheet.crop(65, 480, 60, 80);
      kick1 = sheet.crop(141, 480, 67, 80);
      kick2 = sheet.crop(215, 480, 60, 80);
       player_kick[0]= kick0;
       player_kick[1]= kick1;
       player_kick[2]= kick2;
       //player_kick[3]= kick2;
  
   
  
      idle0 =  sheet.crop(16, 81, 53, 79);
      idle1 = sheet.crop(88, 80, 53, 80);
	  idle2 =sheet.crop(158, 81, 53, 79);
	  idle3 = sheet.crop(226, 82, 53, 78);
      player_idle[0]= idle0;
	  player_idle[1]= idle1;
	  player_idle[2]= idle2;
	  player_idle[3]= idle3;
	  
	  punch0 = sheet.crop(15, 161, 53, 79);
      punch1 = sheet.crop(86, 161, 53, 79);
	  punch2 = sheet.crop(157, 161, 53, 79);
	  player_punch[0]= punch0;
	  player_punch[1]= punch1;
	  player_punch[2]= punch2;
	     
	 
	    
	  jump0 = sheet.crop(70, 644, 53, 73);
	  jump1 = sheet.crop(141, 644, 53, 73);
	  jump2 = sheet.crop(218, 640, 53, 73);
	  jump3 = sheet.crop(290, 644, 53, 73);
	  jump4 = sheet.crop(356, 644, 53, 73);
	  player_jump[0]= jump0;
	  player_jump[1]= jump1;
	  player_jump[2]= jump2;
	  player_jump[3]= jump3;
	  player_jump[4]= jump4;
	     
	     
	  shoot0 = sheet.crop(10, 3, 53, 73);
	  shoot1 = sheet.crop(80, 6, 53, 70);
	  shoot2 = sheet.crop(146, 9, 62, 67);
	  shoot3 = sheet.crop(218, 9, 62, 67);
	  player_shoot[0]= shoot0;
	  player_shoot[1]= shoot1;
	  player_shoot[2]= shoot2;
	  player_shoot[3]= shoot3;  
	  
	  
	  ball0 = sheet.crop(9, 340, 32, 23);
	  ball1 = sheet.crop(84, 338, 25, 27);
	  player_ball[0]= ball0;
	  player_ball[1]= ball1;
	   
	   
	   invertkick0 = sheet.crop(7, 561, 53, 79);
	   invertkick1 = sheet.crop(70, 561, 56, 79);
	   invertkick2= sheet.crop(141, 560, 69, 79);
	   invertkick3=sheet.crop(218, 561, 59, 79);
	   invertkick4 = sheet.crop(296, 561, 53, 71);
	   player_invertkick[0]= invertkick0;
	   player_invertkick[1]= invertkick1;
	   player_invertkick[2]= invertkick2;
	   player_invertkick[3]= invertkick3;
	   player_invertkick[4]= invertkick4;
	
	 squat = sheet.crop(17, 720, 53, 79);
	 player_squat[0] = squat;
	
	
	
	//Enemy details
	 
	 SpriteSheet enemysheet = new SpriteSheet(ImageLoader.loadImage("/textures/ryu.png"));
	   
	    enemyidle0 = enemysheet.crop(946, 0, 54,89);
	    enemyidle1 = enemysheet.crop(878, 0, 54,89);
		enemyidle2= enemysheet.crop(816, 0, 54,89);
		enemyidle3 = enemysheet.crop(751, 0, 54,89);
		enemy_idle[0]= enemyidle0;
		enemy_idle[1]= enemyidle1;
		enemy_idle[2]= enemyidle2;
		enemy_idle[3]= enemyidle3;
		
		
		 enemywalk0 = enemysheet.crop(883, 88, 54,89);
		 enemywalk1 = enemysheet.crop(823, 88, 54,89);
		 enemywalk2 = enemysheet.crop(700, 90, 54,89);
		 enemy_left[0]= enemywalk0;
		 enemy_left[1]= enemywalk1;
		 enemy_left[2]= enemywalk2;
		 
		 
		  enemykick0 = enemysheet.crop(19, 481, 60, 79);
	      enemykick1 = enemysheet.crop(65, 480, 60, 80);
	      enemykick2 = enemysheet.crop(141, 480, 67, 80);
	      enemykick3 = enemysheet.crop(215, 480, 60, 80);
	       enemy_kick[0]= enemykick0;
	       enemy_kick[1]= enemykick1;
	       enemy_kick[2]= enemykick2;
	       enemy_kick[3]= enemykick3;
	  
		
	       enemypunch0 = enemysheet.crop(944, 180, 53, 89);
	       enemypunch1 = enemysheet.crop(889, 180, 53, 89);
	 	  enemypunch2 = enemysheet.crop(816, 181, 53, 89);
	 	  enemy_punch[0]= enemypunch0;
	 	  enemy_punch[1]= enemypunch1;
	 	  enemy_punch[2]= enemypunch2;
	 	     
		
		
	 	 enemyjump0 = enemysheet.crop(70, 644, 53, 73);
		  enemyjump1 = enemysheet.crop(141, 644, 53, 73);
		  enemyjump2 = enemysheet.crop(218, 640, 53, 73);
		  enemyjump3 = enemysheet.crop(290, 644, 53, 73);
		  enemyjump4 = enemysheet.crop(356, 644, 53, 73);
		  enemy_jump[0]= enemyjump0;
		  enemy_jump[1]= enemyjump1;
		  enemy_jump[2]= enemyjump2;
		  enemy_jump[3]= enemyjump3;
		  enemy_jump[4]= enemyjump4;
	
		  
		    
		  enemyshoot0 = enemysheet.crop(10, 3, 53, 73);
		  enemyshoot1 = enemysheet.crop(80, 6, 53, 70);
		  enemyshoot2 = enemysheet.crop(146, 9, 62, 67);
		  enemyshoot3 = enemysheet.crop(218, 9, 62, 67);
		  enemy_shoot[0]= enemyshoot0;
		  enemy_shoot[1]= enemyshoot1;
		  enemy_shoot[2]= enemyshoot2;
		  enemy_shoot[3]= enemyshoot3;  
		  
		  
		 enemyball0 = enemysheet.crop(9, 340, 32, 23);
		  enemyball1 = enemysheet.crop(84, 338, 25, 27);
		  enemy_ball[0]= enemyball0;
		  enemy_ball[1]= enemyball1;
		   
		   
		   enemyinvertkick0 = enemysheet.crop(7, 561, 53, 79);
		   enemyinvertkick1 = enemysheet.crop(70, 561, 56, 79);
		   enemyinvertkick2= enemysheet.crop(141, 560, 69, 79);
		   enemyinvertkick3=enemysheet.crop(218, 561, 59, 79);
		   enemyinvertkick4 = enemysheet.crop(296, 561, 53, 71);
		   enemy_invertkick[0]= enemyinvertkick0;
		   enemy_invertkick[1]= enemyinvertkick1;
		   enemy_invertkick[2]= enemyinvertkick2;
		   enemy_invertkick[3]= enemyinvertkick3;
		   enemy_invertkick[4]= enemyinvertkick4;
		
		 enemysquat = enemysheet.crop(17, 720, 53, 79);
		 enemy_squat[0] = enemysquat;
		
	     enemyfall0 = enemysheet.crop(310,501,54,89);
	     enemyfall1 = enemysheet.crop(375,501,54,89);
	     enemyfall2 = enemysheet.crop(436,501,54,89);
  
	    enemy_fall[0]= enemyfall0;
	    enemy_fall[1]= enemyfall1;
	    enemy_fall[2]= enemyfall2;
	    

	     enemy2fall0 = enemysheet.crop(602,708,54,89);
	     enemy2fall1 = enemysheet.crop(520,710,64,89);
	     enemy2fall2 = enemysheet.crop(426,704,74,89);
 
	    enemy_2fall[0]= enemy2fall0;
	    enemy_2fall[1]= enemy2fall1;
	    enemy_2fall[2]= enemy2fall2;
	    
	    visibledamage0= enemysheet.crop(395, 595, 55, 73);
		visibledamage[0]= visibledamage0;
	  
		enemyreversal0=enemysheet.crop(885, 830, 48, 87);
		enemyreversal1=enemysheet.crop(832,835,48,87);
		enemyreversal2= enemysheet.crop(213,0,48,87);
	  
		enemy_reversal[0]= enemyreversal0;
		enemy_reversal[1]= enemyreversal1;
		enemy_reversal[2]= enemyreversal2;
		
	}
 
}
