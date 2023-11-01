package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class SnowFallState extends BasicGameState
{	
	private int id;
	private Snow[] snows;private StateBasedGame sbg;

	public SnowFallState(int id)
	{
		this.id = id;
	}
	
	public int getID() 
	{
		return id;		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a game state for the *first time.*
		gc.setShowFPS(true);
		this.sbg = sbg;
		gc.setShowFPS(true);
		snows = new Snow[3500];

		for(int i = 0; i < snows.length; i ++)
		{
			snows[i] = new Snow();
		}
//		windSpeed = 3;
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{	
		// This is updates your game's logic every frame.  NO DRAWING.
		for(int i = 0; i < snows.length; i++)
		{
			snows[i].update();
		}

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{

		// This code renders shapes and images every frame.
		g.setBackground(Color.black);//new Color(100, 50, 255));
		for(int i = 0; i < snows.length; i++)
		{
			snows[i].render(g);
		}
		g.setColor(Color.white);
		g.drawString(("Snowfall State"), 50, 50);
	}
	
	public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a gameState.  
	}

	public void leave(GameContainer gc, StateBasedGame sbg) 
	{
		// This code happens when you leave a gameState. 
	}

	public void keyPressed(int key, char c)
	{
		// This code happens every time the user presses a key
	}
	
	public void mousePressed(int button, int x, int y)
	{
		// This code happens every time the user presses the mouse
	}
	
	


}