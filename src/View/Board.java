package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Board extends JPanel implements Observer {
	private static final long serialVersionUID = 1L;
	protected int width;
	protected int height;
	protected Model gm;

	public Board(int w, int h, Model m) {
		m.addObserver(this);
		this.width = w;
		this.height = h;
		this.gm = m;
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}

	public Dimension getPreferredSize() {
		return new Dimension(this.width, this.height);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Iterator x = this.gm.getLines().iterator();

		while(x.hasNext()) {
			VerticalLine b = (VerticalLine)x.next();
			g2.fillRect(b.getX(), b.getY(), b.getWidth(), 1);
		}

		Ball b1 = this.gm.getBall();
		if(b1 != null) {
			g2.setColor(b1.getColour());
			int x1 = (int)(b1.getExactX() - b1.getRadius());
			int y = (int)(b1.getExactY() - b1.getRadius());
			int width = (int)(2.0D * b1.getRadius());
			g2.fillOval(x1, y, width, width);
		}

	}

	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}
}