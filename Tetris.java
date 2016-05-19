package Tetris;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;
import java.awt.*;

public class Tetris extends JComponent {
	Square[][] board;
	public static ArrayList<Block> allBlocks;
	public ArrayList<Shape> shapes;
	public boolean moving;
	public static Random rand;
	
	public Tetris(){
		Thread animationThread = new Thread(new Runnable(){
			public void run() {
				while(true){
					repaint();
				}
			}
		});

				animationThread.start();
				allBlocks = new ArrayList<>();
		        shapes = new ArrayList<>();
		        moving = false;
		        rand = new Random();

	}
	public void paintComponent(Graphics g){
		Graphics2D gg = (Graphics2D) g;
		if(!moving){
		Shape s = new Shape(rand.nextInt(7)+1);
		shapes.add(s);
		moving = true;
		}
		for(Shape s : shapes){
			for(Block b : s.getList()){
				gg.setColor(s.getColor());
				gg.fillRect((int)b.getX(), (int)b.getY(), Block.SIZE, Block.SIZE);
				gg.setStroke(new BasicStroke(2));
				gg.setColor(Color.BLACK);
				gg.drawRect((int)b.getX(), (int)b.getY(), Block.SIZE, Block.SIZE);
			}
		}
		board = new Square[10][18];
		allBlocks = new ArrayList<Block>();
	}
	
/*	public boolean rowCheck(int row) {
		boolean full = true;
		for(Square s:board[][row]) {
			for(Block b: allBlocks)
				if(!s.overlap(b)){
					full = false;
				}
			}
		return full;
	}
	
	public void delRows(){
		for(int a = 0; a < board[0].length; a++) {
			if(rowCheck(a)) {
				for(Block b: allBlocks)) {
					if(b.getY() * Block.SIZE == a) { //this condition needs checking
						allBlocks.remove(allBlocks.get(b));
					} else if(b.getY() * Block.SIZE < a) {
						b.translateDown();
					}
				}
			}
		}
	}
	*/
	public void toggleMoving(){
		moving = !moving;
	}
}
