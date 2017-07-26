package Streetfighter.game.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import static Streetfighterconstant.GameConstant.FRAME_WIDTH;
import static Streetfighterconstant.GameConstant.FRAME_HEIGHT;


public class MyFrame extends JFrame{
	/**
	 * 
	 */
	JFrame frame;
	
	private static final long serialVersionUID = 1L;
	private Canvas canvas;
    	
	MyFrame()
	{  frame = new JFrame();
	  frame.setTitle("Street Fighter");
	  frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setResizable(false);
	  frame.setLocationRelativeTo(null);
	 frame. setVisible(true);
	  canvas = new Canvas();
	  canvas.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
	  canvas.setMaximumSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
	  canvas.setMinimumSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
	
     frame.add(canvas) ; 
	  frame.pack();
	  
	}
	
	public Canvas getCanvas(){
		return canvas;
		
	}
	
	public  JFrame getframe(){
		return frame;
	}
}
