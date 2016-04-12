import java.awt.*;
import java.awt.event.*; // <- Note this is new! Needed for action listeners
import javax.swing.*;

public class NameChangeButtonDemo {

    private static final int HEIGHT = 800;
    private static final int WIDTH = 600;

    // We are going to access these from outside the class,
    // so be prepared
    
    private static JTextField _msg = new JTextField(20);

    private static JFrame _window = new JFrame("---");
    
    private static JButton _btn = new JButton("---");
    

    
    public static JTextField getTextField() {
	return _msg;
    }

    
    public static JButton getButton() {
	return _btn;
    }
    
    public static JFrame getFrame() {
	return _window;
    }
    
    public static void main(String[] args) {
	// Create a frame (corresponds to a window)
	// Set it to the size of our values above

	_window.setSize(WIDTH, HEIGHT);
	// Close program when window is closed
	_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ActionListener tfl = new TextFieldListener();
	_msg.addActionListener(tfl);
	
	_window.add(_msg);

	// Make a button with an ActionListener
       
	
	_window.setLayout(new FlowLayout());

	_window.add(_btn);

	
	// Refresh window - otherwise we will not be able to see it
	// THIS IS A COMMON SOURCE OF BUGS!
	_window.setVisible(true);
	
    }
}


class TextFieldListener implements ActionListener {

    // Every time we click the button, it will perform
    // the following action.

    public void actionPerformed(ActionEvent e) {
	System.out.println("Action occurred!");
	String x = NameChangeButtonDemo.getTextField().getText();
	NameChangeButtonDemo.getButton().setText(x);
    }
    
}
