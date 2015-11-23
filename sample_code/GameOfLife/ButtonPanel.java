import java.awt.*;
import javax.swing.*;

public class ButtonPanel extends JPanel {

    private RunButton _run;

    private WriteButton _write;

    private MainPanel _mainPanel;
    
    public ButtonPanel(MainPanel m) {
	_mainPanel = m;
	_run = new RunButton(m);
	_write = new WriteButton(m);
	setLayout(new FlowLayout());
	add(_run);
	add(_write);
    }
    
}
