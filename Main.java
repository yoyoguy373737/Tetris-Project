package Tetris;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Tetris");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN){
					
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT){
					
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					
				}
				else if(e.getKeyCode() == KeyEvent.VK_SPACE){
					
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
	}
}
