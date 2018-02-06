package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class GUI extends JFrame {

	private Board board;
	private JMenu fileMenu;
	private JMenuBar menuBar;
	
	public GUI() {

		super("Gizmoball");

		board = new Board(250, 250);
		fileMenu = new JMenu("Menu");
		menuBar = new JMenuBar();
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);
		
		setSize(600, 750);
		//setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Container cPane = getContentPane();

		Font gf = new Font("Arial", Font.BOLD, 12);

		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout());

		JButton button1 = new JButton("Switch to Build Mode");
		button1.setFont(gf);
		button1.setMaximumSize(new Dimension(500, 500));
		buttons.add(button1);

		cPane.add(buttons, BorderLayout.NORTH);
		cPane.add(board, BorderLayout.CENTER);

	}

}
