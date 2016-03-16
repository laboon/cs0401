public class CopyDemo {

    public int _x = 8;

    public int _y = 9;

    public CopyDemo(int x, int y) {
	_x = x;
	_y = y;
    }

    public CopyDemo(CopyDemo cd) {
	_x = cd._x;
	_y = cd._y;
    }
    
    public String toString() {
	return _x + ", " + _y;
    }

    public static CopyDemo copy(CopyDemo original) {
	return new CopyDemo(original._x, original._y);
    }
    
    public static void main(String[] args) {
	CopyDemo cd = new CopyDemo(1,2);
	System.out.println(cd);
	CopyDemo cd2 = CopyDemo.copy(cd);
	System.out.println(cd2);
	CopyDemo cd3 = new CopyDemo(cd);
	System.out.println(cd3);

	
    }
}
