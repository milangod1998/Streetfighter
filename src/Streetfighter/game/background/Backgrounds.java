package Streetfighter.game.background;

import java.awt.image.BufferedImage;

import Streetfighterconstant.gfx.ImageLoader;

public class Backgrounds {
 public static BufferedImage background1,background2,background3,background4;	
	public Backgrounds(){
		background1 = ImageLoader.loadImage("/textures/background1.png");
		background2 = ImageLoader.loadImage("/textures/background2.png");
		background3 = ImageLoader.loadImage("/textures/background3.png");
		background4 = ImageLoader.loadImage("/textures/background4.png");
		
		
	}

 
}
