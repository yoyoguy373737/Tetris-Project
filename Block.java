package Tetris;

import java.awt.Color;
import java.awt.Rectangle;

public class Block extends Rectangle{
	private Color col;
	private static boolean K_ROTATE = false;
	public static int SIZE = 40;
	
	public Block(int x, int y, Color col){
		super(x, y, SIZE, SIZE);
		this.col = col;
	}
	public void translateRight(){
		setLocation((int)(getX()+SIZE), (int)getY());
	}
	public void translateLeft(){
		setLocation((int)(getX()-SIZE), (int)getY());
	}
	public void translateDown(){
		setLocation((int)getX(), (int)(getY()+SIZE));
	}
}
