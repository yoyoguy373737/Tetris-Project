package Tetris;

import java.awt.Color;
import java.awt.Rectangle;

public class Block extends Rectangle{
	private int length;
	private Color col;
	private static boolean K_ROTATE = false;
	
	public Block(int x, int y, int length, Color col){
		super(x, y);
		this.length = length;
		this.col = col;
	}
	public void translateRight(){
		setLocation((int)(getX()+1), (int)getY());
	}
	public void translateLeft(){
		setLocation((int)(getX()-1), (int)getY());
	}
	public void translateDown(){
		setLocation((int)getX(), (int)(getY()+1));
	}
	public boolean overlap(Block b){
		boolean c = (x <= b.getX() + length) && (x >= b.getX());
		boolean d = (y <= b.getY() + length) && (y >= b.getY());
	    return c && d;
	}
	// michelle
}
