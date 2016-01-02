import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ClearButton extends JButton {

    private MainPanel _m;
    
    public ClearButton(MainPanel m) {
	super("Clear");
	_m = m;
	addActionListener(new ClearButtonListener());
    }

    class ClearButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	    _m.clear();
	}
    }    
    
}
