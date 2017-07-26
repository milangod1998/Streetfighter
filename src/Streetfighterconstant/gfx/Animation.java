package Streetfighterconstant.gfx;

import java.awt.image.BufferedImage;

public class Animation {
private int index, speed;
private BufferedImage[] frames;
private long lastime,timer;

public Animation(int speed, BufferedImage[] frames){
this.frames = frames;
this.speed = speed;
index=0;
timer = 0;
lastime= System.currentTimeMillis();
}

public void tick(){

	timer+= System.currentTimeMillis()- lastime;
	lastime= System.currentTimeMillis();
	
	if(timer>speed){
		index++;
		timer=0;
		if(index>=frames.length)
			index= 0;
		
	}
}
 public BufferedImage getCurrentFrame(){
	return frames[index];
	 
 }
public int getindex(){
	return index;
}
}