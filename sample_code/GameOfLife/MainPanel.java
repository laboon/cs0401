import java.awt.*;
import javax.swing.*;
import java.util.*;


public class MainPanel extends JPanel {

    // Current configuration
    private Cell[][] _cells;

    // Backup configuration
    private Cell[][] _backupCells;

    private int _size = 0;

    private boolean _running = false;

    public int getCellsSize() {
	return _size;
    }

    public Cell[][] getCells() {
	return _cells;
    }
    
    private int getNumNeighbors(int x, int y) {
	int size = _size;
	int leftX = (x - 1) % size;
	int rightX = (x + 1) % size;
	int upY = (y - 1) % size;
	int downY = (y + 1) % size;

	if (leftX == -1) { leftX = size - 1; }
	if (rightX == -1) { rightX = size - 1; }
	if (upY == -1) { upY = size - 1; }
	if (downY == -1) { downY = size - 1; }
		
	int numNeighbors = 0;

	if (_cells[leftX][upY].getAlive())    { numNeighbors++; }
	if (_cells[leftX][downY].getAlive())  { numNeighbors++; }
	if (_cells[leftX][y].getAlive())      { numNeighbors++; }
	if (_cells[rightX][upY].getAlive())   { numNeighbors++; }
	if (_cells[rightX][downY].getAlive()) { numNeighbors++; }
	if (_cells[rightX][y].getAlive())     { numNeighbors++; }
	if (_cells[x][upY].getAlive())        { numNeighbors++; }
	if (_cells[x][downY].getAlive())      { numNeighbors++; }

	return numNeighbors;

    }

    private boolean iterateCell(int x, int y) {
	boolean toReturn = false;
	boolean alive = _cells[x][y].getAlive();
	int numNeighbors = getNumNeighbors(x, y);
	if (alive) {
	    if (numNeighbors < 2 || numNeighbors > 3) {
		toReturn = false;
	    } else {
		toReturn = true;
	    }
	} else {
	    if (numNeighbors == 3) {
		toReturn = true;
	    } else {
		toReturn = false;
	    }
	}
	return toReturn;

    }

    private void displayIteration(boolean[][] nextIter) {
	// boolean isDead = false;
	for (int j = 0; j < _size; j++) {
	    for (int k = 0; k < _size;  k++) {
		_cells[j][k].setAlive(nextIter[j][k]);
	    }
	}
	setVisible(true);
    }
    
    private void calculateNextIteration() {
	
	boolean[][] nextIter = new boolean[_size][_size];
	for (int j = 0; j < _size; j++) {
	    for (int k = 0; k < _size; k++) {
		nextIter[j][k] = iterateCell(j, k);
	    }
	}

	displayIteration(nextIter);
    }

    public void backup() {
	// System.out.println("Backing up cells...");
	_backupCells = new Cell[_size][_size];
	for (int j = 0; j < _size; j++) {
	    for (int k = 0; k < _size; k++) {
		_backupCells[j][k] = new Cell();
		_backupCells[j][k].setAlive(_cells[j][k].getAlive());
		// System.out.println("Set backup " + j + " " + k + " to " + _backupCells[j][k].getAlive());
	    }
	}
    }

    public void debugPrint() {
	System.out.println("Backup cells");

	try {
	    for (int j = 0; j < _size; j++) {
		for (int k = 0; k < _size; k++) {

		    if (_backupCells[j][k].getAlive()) {
			System.out.print("X");
		    } else {
			System.out.print(".");
		    }
		}
		System.out.println("");
	    }

	    System.out.println("Current cells:");

	    for (int j = 0; j < _size; j++) {
		for (int k = 0; k < _size; k++) {

		    if (_cells[j][k].getAlive()) {
			System.out.print("X");
		    } else {
			System.out.print(".");
		    }
		}
		System.out.println("");
	    }
	} catch (Exception ex) {
	    System.out.println("Nothin' yet");
	}
					   
	
    }
    
    public void run() {
	backup();
	calculateNextIteration();
	// debugPrint();
    }

    public boolean[][] convertToBoolean(Cell[][] cells) {
	boolean[][] toReturn = new boolean[_size][_size];
	System.out.println("Backup cells");

	for (int j = 0; j < _size; j++) {
	    for (int k = 0; k < _size; k++) {

		if (cells[j][k].getAlive()) {
		    toReturn[j][k] = true;
		    System.out.print("X");
		} else {
		    toReturn[j][k] = false;
		    System.out.print(".");
		}
	    }
	    System.out.println("");
	}
	return toReturn;
	
    }
    
    public void undo() {
	// System.out.println("main panel undo");
	
	displayIteration(convertToBoolean(_backupCells));
	setVisible(true);
    }

    public void load(ArrayList<String> lines) {
	boolean[][] loaded = new boolean[_size][_size];

	for (int j = 0; j < _size; j++) {
	    String l = lines.get(j);
	    for (int k = 0; k < _size; k++) {
		if (l.charAt(k) == '.') {		    
		    _cells[j][k].setAlive(false);
		    loaded[j][k] = false;
		} else {
		    System.out.println("Living cell @ " + j + " " + k);
		    _cells[j][k].setAlive(true);
		    loaded[j][k] = true;
		}
	    }
	}
	displayIteration(loaded);
	debugPrint();
	
    }
    

    public MainPanel(int size) {
	super();
	_size = size;
	setLayout(new GridLayout(size, size));
	_cells = new Cell[size][size];
	for (int j = 0; j < size; j++) {
	    for (int k = 0; k < size; k++) {
		_cells[j][k] = new Cell();
		this.add(_cells[j][k]);
		_cells[j][k].setAlive(false);
	    }
	}

	JOptionPane.showMessageDialog(this, "Conway's Game Of Life w/ a " + _size + " x " + _size + " Matrix", "BROUGHT TO YOU BY BILL LABOON", JOptionPane.ERROR_MESSAGE);

	// String name = JOptionPane.showInputDialog("Please enter name:");

	// JOptionPane.showMessageDialog(this, "Hello " + name, "BROUGHT TO YOU BY BILL LABOON", JOptionPane.WARNING_MESSAGE);
	
    }
	
}
