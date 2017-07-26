package Streetfighter.game.main;

import static Streetfighterconstant.GameConstant.FRAME_HEIGHT;
import static Streetfighterconstant.GameConstant.FRAME_WIDTH;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Streetfighter.game.background.Backgrounds;
import Streetfighter.game.creature.Enemy;
import Streetfighter.game.creature.Player;
import Streetfighter.game.input.KeyManager;
import Streetfighter.game.states.GameState;
import Streetfighter.game.states.MenuState;
import Streetfighter.game.states.State;
import Streetfighterconstant.gfx.Assets;




public class Game implements Runnable {
  Handler handler ;
	private KeyManager keymanager;
  MyFrame myframe;
  Assets asset ;
  Backgrounds background;
  private BufferStrategy bs;
  private State menustate;
  private Graphics g;
  private boolean running = false;
  private Thread thread;
	int x=0;
	private State gamestate;
  public Game()
	{
	  	keymanager = new KeyManager();
	    background = new Backgrounds();
	
	}
	
	private void tick(){
		
		if(State.getState()!=null){
			State.getState().tick();
		}
	}
	 private void render()
	 {
		 bs = myframe.getCanvas().getBufferStrategy();
		 if(bs==null){
			 myframe.getCanvas().createBufferStrategy(3);
			 return;
		 }
		 g= bs.getDrawGraphics();
		 g.clearRect(0, 0,  FRAME_WIDTH,FRAME_HEIGHT);	 
		g.drawImage(Backgrounds.background1,0,0, FRAME_WIDTH, FRAME_HEIGHT, null);
		 if(State.getState()!=null){
			State.getState().render(g);
		}
		 bs.show();
	   g.dispose();
	 }
	
	public Graphics getG(){
		return g;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		myframe=new MyFrame();
		myframe.getframe().addKeyListener(keymanager);
		Assets.init();
		handler = new Handler(this);
		gamestate = new GameState(handler);
		menustate = new MenuState(handler);
		State.setState(gamestate);

		
		int fps =60;          //calls tick and run 60 times per second
		double timepertick =1000000000/fps;  //maximum number of time we can give to tick and render
		double delta=0;
		long now;
		long lastTime = System.nanoTime();
		long timer=0;
		int ticks =0;
		while(running)
		{ now = System.nanoTime();
		 delta +=(now-lastTime)/timepertick; //time taken for second calling
		 timer+=now -lastTime;
		 lastTime= now;
		 
		 if(delta >=1){
			tick();
			render();
		   ticks++;
			delta--;
		 }
		 
		 if(timer>=1000000000)
		 {
			 
		    timer=0;
		    ticks=0;
		 } 
		 
		}
	}
	
	public KeyManager getkeymanger(){
		return keymanager;
	}
 public synchronized void start()
 {   
	  if(running)
		  return;
	  running = true;
	 thread = new Thread(this);
	 thread.start();
	 
 }
 
 public Player getPlayer(){
	 return State.getState().getPlayer();
 }
 public Enemy getEnemy()
 {
	 return State.getState().getEnemy();
 }
 public synchronized void stop() 
 { if(!running)
	 return;
	 try {
		thread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }}

