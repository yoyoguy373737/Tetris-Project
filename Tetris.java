package Tetris;

import javax.swing.*;

public class Tetris extends JComponent {
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
}
