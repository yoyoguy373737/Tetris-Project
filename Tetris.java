package Tetris;

import javax.swing.*;
import java.util.ArrayList;

public class Tetris extends JComponent {
	Square[][] board;
	public static ArrayList<Block> allBlocks;
	
	public Tetris(){
		Thread animationThread = new Thread(new Runnable(){
			public void run() {
				while(true){
					repaint();
					animationThread.start();
				}
			}
			public void paintComponent(Graphics g){
				Graphics2D gg = (Graphics2D) g;
				
			}
		})
		board = new Square[10][18];
		allBlocks = new ArrayList<Block>();
	}
	
	public boolean rowCheck(int row) {
		boolean full = true;
		for(Square s:board[][row]) {
			for(Block b: allBlocks)
				if(!s.overlap(b))
				{
					full = false;
					}
				}
		return full;
	}
}
