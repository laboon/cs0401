import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel {

    private Cell[][] _cells;

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

    private void displayNextIteration(boolean[][] nextIter) {
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

	displayNextIteration(nextIter);
    }

    public void run() {
	calculateNextIteration();
    }

    public void stop() {
	_running = false;
	
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

	JOptionPane.showMessageDialog(this, "Conway's Game Of Life w/ a " + _size + " x " + _size + " Matrix");
    }
	
}
