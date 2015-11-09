// Program to display three permutations of a given string

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExtendedPanelDemo
{

    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;

    
    // Remember frame = window
    private JFrame _frame = new JFrame();

    private EntryPanel _entry;
    private PermutationPanel _top ;
    private PermutationPanel _middle;
    private PermutationPanel _bottom;

    // These declarations are similar to those in other handouts
    private JButton _permutate;

    private String _string = "";

    public static void main(String [] args) {
	new ExtendedPanelDemo();
    }

    public ExtendedPanelDemo() {

	_frame.setSize(WIDTH, HEIGHT);

	_frame.setLayout(new GridLayout(2,2));
	
	_entry = new EntryPanel(this);
	_top = new PermutationPanel();
	_middle = new PermutationPanel();
	_bottom = new PermutationPanel();

	_permutate = new JButton("Permute!");
	
	// Add the different panels to the frame.

	_frame.add(_entry);
	_frame.add(_top);
	_frame.add(_middle);
	_frame.add(_bottom);


	// Finally make it all visible
	_frame.setVisible(true);
    }

    public void permute(String s) {
	System.out.println("Permute in main");
	_top.permute(s);
	_middle.permute(s);
	_bottom.permute(s);
    }

    
    
}
