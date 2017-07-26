package Streetfighter.game.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
  
	private boolean[] keys;
	public boolean left,right,key_A,key_S,key_space,key_D,key_Q,down,key_J,key_L,key_K,key4,key5,key6,key7,key0;
	public KeyManager()
	{
		keys = new boolean[256];
		
	}
	
	public void tick(){
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
	   down = keys[KeyEvent.VK_DOWN];
		key_S= keys[KeyEvent.VK_S];
	    key_A = keys[KeyEvent.VK_A];
        key_space= keys[KeyEvent.VK_SPACE];
 	    key_D = keys[KeyEvent.VK_D];
	    key_Q = keys[KeyEvent.VK_Q];
	    
	    key_J = keys[KeyEvent.VK_J];
	     key_L= keys[KeyEvent.VK_L];
	    key_K = keys[KeyEvent.VK_K];
	    key4 = keys[KeyEvent.VK_4];
	    key5= keys[KeyEvent.VK_5];
	    key6=keys[KeyEvent.VK_6];
	    key7=keys[KeyEvent.VK_7];
	    key0=keys[KeyEvent.VK_0];
	    key_K= keys[KeyEvent.VK_K];
	
	}
	 
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()]= true;
	
		
	  
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()]= false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
