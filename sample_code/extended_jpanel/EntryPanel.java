import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EntryPanel extends JPanel {

    private JTextField _text = new JTextField(20);

    private JButton _permuteButton = new JButton("Permute!");

    private ExtendedPanelDemo _main;
    
    public EntryPanel(ExtendedPanelDemo main) {
	System.out.println("Entry panel!");
	_main = main;
	_permuteButton.addActionListener(new PermutationListener());
	add(_text);
	add(_permuteButton);
	setVisible(true);
    }

    class PermutationListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    String s = _text.getText();
	    _main.permute(s);
	}
    }

    
    
}
