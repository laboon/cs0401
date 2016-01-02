import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class PermutationPanel extends JPanel {

    private JLabel _label = new JLabel("AAA");

    public PermutationPanel() {
	_label.setFont(new Font("TimesRoman", Font.ITALIC, 48));
	this.add(_label);
	this.setVisible(true);
    }

    public void permute(String s) {
	ArrayList<Character> a = new ArrayList<Character>();

	for(char c : s.toCharArray()) {
	    a.add(c);
	}
	Collections.shuffle(a);

	String shuffled = "";
	
	for(Object o : a) {
	    Character c = (Character) o;
	    shuffled += c.charValue();
	}
	
	_label.setText(shuffled);
	
    }
    
}
