package Tetris;

import java.awt.Color;

public class Block {
	private int x;
	private int y;
	private Color col;
	private static boolean getUp = false;
	
	public Block(int x, int y, Color col){
		this.x = x;
		this.y = y;
		this.col = col;
	}
	public void translateRight(){
		x++;
	}
	public void translateLeft(){
		x--;
	}
	public void translateDown(){
		y++;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
}
