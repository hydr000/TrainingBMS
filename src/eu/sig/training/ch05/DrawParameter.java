package eu.sig.training.ch05;

import java.awt.Graphics;

public class DrawParameter {
	public Graphics g;
	public int x;
	public int y;
	public int w;
	public int h;

	public DrawParameter(Graphics g, int x, int y, int w, int h) {
		this.g = g;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
}