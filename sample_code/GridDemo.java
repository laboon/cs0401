// This demo builds a simple Tic-Tac-Toe display

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

import java.util.*;

public class GridDemo {

    private final int HEIGHT = 600;
    private final int WIDTH = 800;

    private JButton[] _buttons = new JButton[9];
    
    private JFrame _frame = new JFrame("Tic-Tac-Toe");

    public static void printInMethod() {
	System.out.println("MEOW!");
    }
    
    public GridDemo() {
	_frame.setSize(WIDTH, HEIGHT);
	// Close program when window is closed
	_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	_frame.setLayout(new GridLayout(3,3));
		
	for (int j=0; j<9; j++) {
	    _buttons[j] = new JButton("_");
	    ActionListener buttonListener = new ButtonListener();
	    _buttons[j].addActionListener(buttonListener);
	    _buttons[j].setFont(new Font("Courier", Font.PLAIN, 48));
	    _frame.add(_buttons[j]);
	}
	
	
	// Refresh window - otherwise we will not be able to see it
	// THIS IS A COMMON SOURCE OF BUGS!
	_frame.setVisible(true);
    }	
    
    public static void main(String[] args) {
	new GridDemo();
    }

    class ButtonListener implements ActionListener {

	// Every time we click the button, it will perform
	// the following action.

	public void actionPerformed(ActionEvent e) {
	    GridDemo.printInMethod();
	    JButton source = (JButton) e.getSource();
	    System.out.println(source);
	    String currentText = source.getText();
	    if (currentText.equals("_")) {
		source.setText("X");
	    } else if (currentText.equals("X")) {
		source.setText("O");
	    } else {
		source.setText("_");
	    }
	}
    
    }

    
}



