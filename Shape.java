package Tetris;

import java.awt.Color;
import java.util.ArrayList;

public class Shape {
	private ArrayList<Block> list;
	private int type;
	
	public Shape(int num){
		int l = 40;
		int c = 120;
		switch(num){
			case 1: //square
				list.add(new Block(c+l,0,l,Color.BLUE));
				list.add(new Block(2*l+c,0,l,Color.BLUE));
				list.add(new Block(c+l,l,l,Color.BLUE));
				list.add(new Block(2*l+c,l,l,Color.BLUE));
				break;
			case 2: //T
				list.add(new Block(c,0,l,Color.BLUE));
				list.add(new Block(c+l,0,l,Color.BLUE));
				list.add(new Block(c+2*l,0,l,Color.BLUE));
				list.add(new Block(c+l,l,l,Color.BLUE));
				break;
			case 3: //S thing
				list.add(new Block(c,l,l,Color.BLUE));
				list.add(new Block(c+l,0,l,Color.BLUE));
				list.add(new Block(c+l,l,l,Color.BLUE));
				list.add(new Block(2*l+c,0,l,Color.BLUE));
				break;
			case 4: //Z thing
				list.add(new Block(c,l,0,Color.BLUE));
				list.add(new Block(c+l,0,l,Color.BLUE));
				list.add(new Block(c+l,l,l,Color.BLUE));
				list.add(new Block(2*l+c,l,l,Color.BLUE));
				break;
				
		}	
	}
}
