package Tetris;

import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Tetris");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Block.WIDTH,Block.HEIGHT);
		frame.setLocationRelativeTo(null);
		Tetris game = new Tetris();
		frame.add(game);
		frame.setVisible(true);
		frame.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					game.shapes.get(game.shapes.size()-1).rotate();
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN){
					boolean check = false; //definitely replace with sam method
					for(Block b :game.shapes.get(game.shapes.size()-1).getList()){
						if(b.getY() + 2 * Block.SIZE >= Block.HEIGHT){
							check = true;
						}
					}
					if(!check){
						game.shapes.get(game.shapes.size()-1).translateShapeD();
					}	
					else{
						game.shapes.add(new Shape(Tetris.rand.nextInt(7)+1));
					}
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT){
					boolean check = false; //definitely replace with sam method
					for(Block b :game.shapes.get(game.shapes.size()-1).getList()){
						if(b.getX() <= 0){
							check = true;
						}
					}
					if(!check){
						game.shapes.get(game.shapes.size()-1).translateShapeL();
					}	
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					boolean check = false; //definitely replace with sam method
					for(Block b :game.shapes.get(game.shapes.size()-1).getList()){
						if(b.getX() + Block.SIZE >= Block.WIDTH){
							check = true;
						}
					}
					if(!check){
						game.shapes.get(game.shapes.size()-1).translateShapeR();
					}	
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
