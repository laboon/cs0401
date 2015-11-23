import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WriteButton extends JButton {

    private MainPanel _m;
    
    public WriteButton(MainPanel m) {
	super("Write");
	_m = m;
	addActionListener(new WriteButtonListener());
    }

    class WriteButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {

	    String toWrite = "";
	    int size = _m.getCellsSize();
	    Cell[][] cells = _m.getCells();
	    for (int j = 0; j < size; j++) {
		for(int k = 0; k < size; k++) {
		    if (cells[j][k].getAlive()) {
			toWrite += "X";
		    } else {
			toWrite += ".";
		    }
		    
		}
		toWrite += "\n";
	    }
	    FileAccess.saveFile("backup.txt", toWrite);
	    
	}
    }    
    
}
