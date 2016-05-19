package Tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Block extends Rectangle{
	public static int SIZE = 40;
	public static int WIDTH = 10*SIZE;
	public static int HEIGHT = (int)(20.5*SIZE);
	
	public Block(int x, int y){
		super(x, y, SIZE, SIZE);
	}
	public void translateRight(){
		setLocation((int)(getX())+SIZE, (int)getY());
	}
	public void translateLeft(){
		setLocation((int)(getX())-SIZE, (int)getY());
	}
	public void translateDown(){
		setLocation((int)(getX()), (int)(getY())+SIZE);
	}
}
