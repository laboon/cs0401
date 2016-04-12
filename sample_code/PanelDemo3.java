// Let's use panels

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelDemo3 {
    // Remember frame = window
    private JFrame _frame;

    private FluffyPanel _top;
    private FluffyPanel _middle;
    private FluffyPanel _middle2;
    private FluffyPanel _bottom;

    // These declarations are similar to those in other handouts
    private JButton _addButton;
    private JButton _subtractButton;
    private JButton _quitButton;
    
    private JLabel _decVal;
    private JLabel _binaryVal;
    private JLabel _hexVal;

    private int _value;

    public static void main(String [] args) {
	new PanelDemo3();
    }

    public PanelDemo3() {
	// Four panels, each with FlowLayout
	_top = new SuperFluffyPanel();
	_top.fluffy();
	_top.setLayout(new FlowLayout());

	_middle = new FluffyPanel();
	_middle.fluffy();
	_middle.setLayout(new FlowLayout());

	_middle2 = new FluffyPanel();
	_middle2.fluffy();
	_middle2.setLayout(new FlowLayout());

	_bottom = new FluffyPanel();
	_bottom.fluffy();
	_bottom.setLayout(new FlowLayout());

	// Now let's make two buttons with listeners, to add and subtract
	// and put them in the top panel


	// Make an ArithmeticListener and call it aListener
	ArithmeticListener aListener = new ArithmeticListener();
	QuitListener quitListener = new QuitListener();
	
	_addButton = new JButton("++");
	_subtractButton = new JButton("--");
	_quitButton = new JButton("QUIT!");
	
	_addButton.addActionListener(aListener);
	_subtractButton.addActionListener(aListener);
	_quitButton.addActionListener(quitListener);
	
	_addButton.setHorizontalAlignment(SwingConstants.CENTER);
	_subtractButton.setHorizontalAlignment(SwingConstants.CENTER);
	
	_top.add(_addButton);
	System.out.println("Fluffiness level: " + _top.getFluffinessLevel());
	_top.add(_subtractButton);
	_top.add(_quitButton);

	// Now add decimal value in middle
	// Font settings - http://docs.oracle.com/javase/7/docs/api/java/awt/Font.html
	
	_decVal = new JLabel("0");
	_decVal.setFont(new Font("CourierNew", Font.PLAIN, 48));
	_decVal.setHorizontalAlignment(SwingConstants.CENTER);
       
	_middle.add(_decVal);

	// Now add hexadecimal value in second middle

	_hexVal = new JLabel("0");
	_hexVal.setFont(new Font("CourierNew", Font.PLAIN, 48));
	_hexVal.setHorizontalAlignment(SwingConstants.CENTER);
	
	_middle2.add(_hexVal);

	// Now add binary value at bottom
	
	_binaryVal = new JLabel("0");
	_binaryVal.setFont(new Font("CourierNew", Font.PLAIN, 48));
	_hexVal.setHorizontalAlignment(SwingConstants.CENTER);

	_bottom.add(_binaryVal);

	// Set corresponding value to 0
	_value = 0;

	// Now create the frame.  Should exit on close.
	
	_frame = new JFrame("Binary Counter");
	// _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	_frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	
	// Add the different panels to the frame.
	
	_frame.add(_top, BorderLayout.NORTH);
	_frame.add(_middle, BorderLayout.EAST);
	_frame.add(_middle2, BorderLayout.WEST);
	_frame.add(_bottom, BorderLayout.SOUTH);

	// Packing automatically sets the size of the window to fit the components
	
	_frame.pack();

	// Finally make it all visible
	_frame.setVisible(true);
    }

    public void updateLabels() {
	_decVal.setText(Integer.toString(_value));
	_hexVal.setText(Integer.toHexString(_value));
	_binaryVal.setText(Integer.toBinaryString(_value));
    }
    
    class ArithmeticListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == _addButton) {
		_value++;		    
	    } else if (e.getSource() == _subtractButton) {
		_value--;
	    } else {
		System.out.println("UNKNOWN BUTTON PRESSED!");
	    }
	    updateLabels();
	}
    }

    class QuitListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
	    System.exit(0);
	}
    }

    class FluffyPanel extends JPanel {

	private int numFluffies = 0;
	
	public void fluffy() {
	    System.out.println("I AM A FLUFFY PANEL! " + numFluffies);
	    numFluffies++;
	    System.out.println("I AM A FLUFFY PANEL! " + numFluffies);
	    
	}

	public int getFluffinessLevel() {
	    return numFluffies;
	}
	
    }

    class SuperFluffyPanel extends FluffyPanel {


	public int getFluffinessLevel() {
	    return 1000000;
	}
	
    }

}
