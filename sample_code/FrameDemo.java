// This demo shows how to make simple graphics with Java

// AWT - Abstract Windowing Toolkit
import java.awt.*;
// Swing - graphics library on top of AWT which makes everything
// look the same from system to system.
import javax.swing.*;

public class FrameDemo {

    // final variables can only be assigned once
    // They are kind of like constants, but can be determined at
    // run-time (see FinalDemo.java)
    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;
    
    public static void main(String[] args) {
	// Create a frame (corresponds to a window)
	// Set it to the size of our values above
	JFrame window = new JFrame("Genuine Bona Fide JFrame");
	window.setSize(WIDTH, HEIGHT);
	// Close program when window is closed
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// Window is invisible by default, make it visible
	window.setVisible(true);
	
	// Now let's do some interesting things with our window
	// Add a message for a genuine bona fide electrified six-car MONORAIL

	JLabel msg = new JLabel("Monorail");
	msg.setFont(new Font("TimesRoman", Font.ITALIC, 48));
	msg.setForeground(Color.BLACK);
	window.add(msg);

	// Refresh window - otherwise we will not be able to see it
	// THIS IS A COMMON SOURCE OF BUGS!
	window.setVisible(true);
	
    }
}
