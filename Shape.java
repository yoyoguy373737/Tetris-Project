package Tetris;

import java.awt.Color;
import java.util.ArrayList;

public class Shape {
	private ArrayList<Block> list;
	private int type;
	private Color col;
	
	public Shape(int num){
		list = new ArrayList<>();
		type = num;
		int l = Block.SIZE;
		int c = (int)(.5*Block.WIDTH) - 2*Block.SIZE;
		switch(num){
			case 1: //Square
				list.add(new Block(c+l,0));
				list.add(new Block(2*l+c,0));
				list.add(new Block(c+l,l));
				list.add(new Block(c+2*l,l));
				col = Color.YELLOW;
				break;
			case 2: //T thing
				list.add(new Block(c,0));
				list.add(new Block(c+2*l,0));
				list.add(new Block(c+l,0));
				list.add(new Block(c+l,l));
				col = new Color(160, 32, 240);
				break;
			case 3: //S thing
				list.add(new Block(c,0));
				list.add(new Block(c+l,0));
				list.add(new Block(c+l,l));
				list.add(new Block(c+2*l,l));
				col = Color.GREEN;
				break;
			case 4: //Z thing
				list.add(new Block(c,l));
				list.add(new Block(c+l,0));
				list.add(new Block(c+l,l));
				list.add(new Block(c+2*l,0));
				col = Color.RED;
				break;
			case 5: //L thing
				list.add(new Block(c,0));
				list.add(new Block(c,l));
				list.add(new Block(c+l,l));
				list.add(new Block(c+2*l,l));
				col = new Color(255,140,0);
				break;
			case 6: //J thing
				list.add(new Block(c,l));
				list.add(new Block(c,0));
				list.add(new Block(c+l,0));
				list.add(new Block(c+2*l,0));
				col = new Color(30,144,255);
				break;
			case 7: //Line
				list.add(new Block(c,0));
				list.add(new Block(c+l,0));
				list.add(new Block(c+2*l,0));
				list.add(new Block(c+3*l,0));
				col = Color.CYAN;
				break;
		}	
	}
		public void translateShapeR(){
			for(Block b : list){
				b.translateRight();
			}
		}
		public void translateShapeL(){
			for(Block b : list){
				b.translateLeft();
			}
		}
		public void translateShapeD(){
			for(Block b : list){
				b.translateDown();
			}
		}
		
		public void rotate() {
			if(type != 1){
				int x = (int)list.get(2).getX();
				int y = (int)list.get(2).getY();
				for(Block b: list) {
					int x_1 = (int)b.getX() - x;
					int y_1 = (int)b.getY() - y;
					b.setLocation(x - y_1, y + x_1);
				}
			}
		}
		public boolean noMoreMoves(){
			boolean hasMoves = true;
			for(Block b: list) {
				for(Block b1: Tetris.allBlocks) {
					if(b.getY() == b1.getY() - Block.SIZE) {
						hasMoves = false;
					}
				}
			}
			return hasMoves;
		}
	
	public ArrayList<Block> getList(){
		return list;
	}
	public Color getColor(){
		return col;
	}
}
