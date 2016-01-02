import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UndoButton extends JButton {

    private MainPanel _m;
    
    public UndoButton(MainPanel m) {
	super("Undo");
	_m = m;
	addActionListener(new UndoButtonListener());
    }

    class UndoButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	    // System.out.println("Undo button pressed!");
	    _m.undo();
	}
    }    
    
}
