import java.awt.*;
import javax.swing.*;

public class ButtonPanel extends JPanel {

    private RunButton _run;

    private WriteButton _write;

    private UndoButton _undo;

    private LoadButton _load;
    
    private MainPanel _mainPanel;

    public ButtonPanel(MainPanel m) {
	_mainPanel = m;
	_run = new RunButton(m);
	_write = new WriteButton(m);
	_undo = new UndoButton(m);
	_load = new LoadButton(m);
	setLayout(new FlowLayout());
	add(_run);
	add(_write);
	add(_undo);
	add(_load);
    }
    
}
