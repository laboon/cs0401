import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SafeSaveButton extends JButton {

    private MainPanel _m;
    
    public SafeSaveButton(MainPanel m) {
	super("SafeSave");
	_m = m;
	addActionListener(new SafeSaveButtonListener());
    }

    class SafeSaveButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	    String toWrite = _m.toString();
	    
	    boolean success = FileAccess.safeSaveFile("backup.txt", "temptemp.txt", toWrite);
	    
	    if (!success) {
		JOptionPane.showMessageDialog((Component) e.getSource(), "COULD NOT WRITE FILE backup.txt", "BROUGHT TO YOU BY BILL LABOON", JOptionPane.WARNING_MESSAGE);
	    }

	}
    }    
    
}
