import java.awt.*;
import javax.swing.*;

public class ButtonPanel extends JPanel {

    private RunButton _run;

    private WriteButton _write;

    private UndoButton _undo;

    private LoadButton _load;

    private ClearButton _clear;

    private SafeSaveButton _safeSave;
    
    /**
     * Constructor - add all of the buttons to
     * the ButtonPanel.
     */
    
    public ButtonPanel(MainPanel m) {

	// Send a reference to the Main Panel
	// to all of the buttons.
	
	_run = new RunButton(m);
	_write = new WriteButton(m);
	_undo = new UndoButton(m);
	_load = new LoadButton(m);
	_clear = new ClearButton(m);
	_safeSave = new SafeSaveButton(m);
	setLayout(new FlowLayout());

	// Add all of the buttons
	
	add(_run);
	add(_write);
	add(_safeSave);
	add(_undo);
	add(_load);
	add(_clear);
    }
    
}
