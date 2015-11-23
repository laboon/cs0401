import java.awt.*;
import javax.swing.*;

public class MainFrame {

    private final int HEIGHT = 600;
    private final int WIDTH = 800;
    
    private JFrame _frame = new JFrame("Game of Life");

    private MainPanel _mainPanel;

    private ButtonPanel _buttonPanel;
    
    public MainFrame(int size) {

	_frame.setSize(WIDTH, HEIGHT);
	// Close program when window is closed
	_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// Add Main Panel and Button Panel
	
	_mainPanel = new MainPanel(size);

	_buttonPanel = new ButtonPanel(_mainPanel);
	
	_frame.add(_mainPanel, BorderLayout.NORTH);
	_frame.add(_buttonPanel, BorderLayout.SOUTH);
	
	_frame.setVisible(true);	
    }
    
}
