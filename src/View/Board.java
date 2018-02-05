package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Board extends JPanel {

	protected int width;
	protected int height;

	public Board(int w, int h) {

		width = w;
		height = h;
		this.setBorder(BorderFactory.createLineBorder(Color.black));

	}
}