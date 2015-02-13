import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class fifteen {

    private JPanel play;
    private JButton[][] grid;
    private JPanel gameBoard;
    private JFrame overall; 

    public fifteen() {
	gameBoard = new JPanel();
	gridMaker();

	overall = new JFrame();
	overall.setSize(600,600);
	overall.setDefaultCloseOperation(EXIT_ON_CLOSE);
	overall.setLayout(new BorderLayout());
	overall.setTitle("Not PvZ");

	top = new JPanel();
	top.setLayout(new GridLayout());
	overall.add(top, BorderLayout.PAGE_START);

	counter = new JLabel("Counter: 0", JLabel.CENTER);
	top.add(counter);


	gameBoard = new JPanel();
	overall.add(gameBoard, BorderLayout.CENTER);
	
	gridMaker();

	bottom = new JPanel();
	bottom.setLayout(new GridLayout(1,3));
	overall.add(bottom, BorderLayout.PAGE_END);
	
	status = new JLabel("Status: 50 left", JLabel.CENTER);
	bottom.add(status, BorderLayout.PAGE_END);
	
	overall.pack();
	overall.setVisible(true);

    }

    public void buttonMaker(int x, int y) {
	grid[x][y] = new JButton();  
	grid[x][y].setPreferredSize(new Dimension(125,125));
	grid[x][y].setContentAreaFilled(false);
	grid[x][y].setBackground(Color.WHITE);
	play.add(grid[x][y]);
    }

    public void gridMaker() {	

	play = new JPanel(new GridLayout(5,9)); 
	grid = new JButton[9][5];
	int counterX = 0;
	int counterY = 0;
	for (int y = 0; y < 5; y++){
	    for (int x = 0; x < 9; x++){
		buttonMaker(x, y);
	    }
	}
	gameBoard.add(play);
    }

    public static void main(String[] args) {
	fifteen f = new fifteen();
    }
}
