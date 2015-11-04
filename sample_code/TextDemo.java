// Shows how a TextField works

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

import java.util.*;

public class TextDemo {

    private final int HEIGHT = 600;
    private final int WIDTH = 800;

    private JTextField _text = new JTextField(20);
    
    private JFrame _frame = new JFrame("Text Demo");

    private JButton _button = new JButton("Print!");
    
    public TextDemo() {
	_frame.setSize(WIDTH, HEIGHT);
	// Close program when window is closed
	_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	_frame.setLayout(new FlowLayout());

	_frame.add(_text);
	
	PrintListener printListener = new PrintListener();
	_button.addActionListener(printListener);
	
	_frame.add(_button);
	
	// Refresh window - otherwise we will not be able to see it
	// THIS IS A COMMON SOURCE OF BUGS!
	_frame.setVisible(true);
    }	
    
    public static void main(String[] args) {
	new TextDemo();
    }

    class PrintListener implements ActionListener {

	// Every time we click the button, it will perform
	// the following action.

	public void actionPerformed(ActionEvent e) {
	    System.out.println(_text.getText());
	}
    
    }

    
}



