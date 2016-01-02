import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class LoadButton extends JButton {

    private MainPanel _m;
    
    public LoadButton(MainPanel m) {
	super("Load");
	_m = m;
	addActionListener(new LoadButtonListener());
    }

    class LoadButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	    String fileName = "backup.txt";
	    ArrayList<String> info = FileAccess.loadFile(fileName);
	    _m.load(info);
	}
    }    
    
}
