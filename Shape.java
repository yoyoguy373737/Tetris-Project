package Tetris;

import java.awt.Color;
import java.util.ArrayList;

public class Shape {
	private ArrayList<Block> list;
	private int type;
	
	public Shape(int num, Color col){
		list = new ArrayList<>();
		type = num;
		int l = 40;
		int c = 120;
		switch(num){
			case 1: //square
				list.add(new Block(c+l,0,col));
				list.add(new Block(2*l+c,0,col));
				list.add(new Block(c+l,l,col));
				list.add(new Block(c+2*l,l,col));
				break;
			case 2: //T thing
				list.add(new Block(c,0,col));
				list.add(new Block(c+2*l,0,col));
				list.add(new Block(c+l,0,col));
				list.add(new Block(c+l,l,col));
				break;
			case 3: //S thing
				list.add(new Block(c,l,col));
				list.add(new Block(c+l,0,col));
				list.add(new Block(c+l,l,col));
				list.add(new Block(c+2*l,0,col));
				break;
			case 4: //Z thing
				list.add(new Block(c,l,0,col));
				list.add(new Block(c+l,0,col));
				list.add(new Block(c+l,l,col));
				list.add(new Block(c+2*l,l,col));
				break;
			case 5: //L thing
				list.add(new Block(c,0,col));
				list.add(new Block(c,l,col));
				list.add(new Block(c+l,l,col));
				list.add(new Block(c+2*l,l,col));
				break;
			case 6: //J thing
				list.add(new Block(c,l,col));
				list.add(new Block(c,0,col));
				list.add(new Block(c+l,0,col));
				list.add(new Block(c+2*l,0,col));
				break;
			case 7: //line
				list.add(new Block(c,0,col));
				list.add(new Block(c+l,0,col));
				list.add(new Block(c+2*l,0,col));
				list.add(new Block(c+3*l,0,col));
				break;
		}	
		public void translateShapeR(){
			for(Block b : list){
				b.tanslateRight();
			}
		}
		public void translateShapeL(){
			for(Block b : list){
				b.translateLeft();
			}
		}
		public void translateShapeD(){
			for(Block b : list){
				b.tanslateDown();
			}
		}
		public void rotate(){
			switch(type){
			case 1:
				break;
			case 2:
				rotateT();
				break;
			case 3:
				rotateS();
				break;
			case 4:
				rotateZ();
				break;
			case 5:
				rotateL();
				break;
			case 6:
			}
			
		}
	}
}
