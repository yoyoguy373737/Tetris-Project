package Tetris;

import java.awt.Rectangle;

public class Square extends Rectangle {
	private int length;

	public Square(int x, int y, int length) {
		super(x, y);
		this.length = length;
	}

	public boolean overlap(Block b) {
		boolean c = (getX() <= b.getX() + length) && (getX() >= b.getX());
		boolean d = (y <= b.getY() + length) && (y >= b.getY());
		return c && d;
	}
}
