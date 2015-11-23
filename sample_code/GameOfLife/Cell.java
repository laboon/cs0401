import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cell extends JButton {

    private final int MAX_YEARS = 5;
        
    private boolean _beenAlive = false;

    private int _numYears = 0;
    
    public Cell() {
	super(" ");
	setFont(new Font("Courier", Font.PLAIN, 12));
	addActionListener(new CellButtonListener());
    }

    public Cell(boolean alive) {
	super(" ");
	setFont(new Font("Courier", Font.PLAIN, 12));
	addActionListener(new CellButtonListener());
	setAlive(alive);
    }

    
    public boolean getAlive() {
	String text = getText();
	return (text.equals("X"));
    }

    public void setAlive(boolean a) {
	// note that "if (a)" and "if (a == true)"
	// really say the same thing!
	if (a) {

	    if (++_numYears > MAX_YEARS) {
		System.out.println("DIED OF OLD AGE");
		setText(" ");
		if (_beenAlive) {
		    setBackground(Color.GREEN);
		} else {
		    setBackground(Color.GRAY);
		}
		_numYears = 0;
	    } else {
		_beenAlive = true;
		setText("X");
		setBackground(Color.RED);
	    }
	    
	} else {
	    setText(" ");
	    if (_beenAlive) {
		setBackground(Color.GREEN);
	    } else {
		setBackground(Color.GRAY);
	    }
	}
	setContentAreaFilled(true);
        setOpaque(true);

    }

    class CellButtonListener implements ActionListener {

	// Every time we click the button, it will perform
	// the following action.

	public void actionPerformed(ActionEvent e) {
	    Cell source = (Cell) e.getSource();
	    String currentText = source.getText();
	    if (currentText.equals(" ")) {
		setAlive(true);
	    } else if (currentText.equals("X")) {
		setAlive(false);
	    } else {
		// This shouldn't happen
		setAlive(false);
	    }
	}
    
    }

}
