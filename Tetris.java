package Tetris;

import javax.swing.*;

public class Tetris extends JComponent {
	Square[][] board = new Square[10][18];
	
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
	}
	
	public boolean rowCheck(int row) {
		boolean full = true;
		for(Square s:board[][row]) {
			if(!s.overlap())
			{
				full = false;
				}
			}
		return full;
	}
}
