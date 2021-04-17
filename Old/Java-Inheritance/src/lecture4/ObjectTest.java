package lecture4;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class ObjectTest {
    public static void main(String[] args) {
        Point p = new Point(10,20);
        // without override toString() method the
        // following will print something like this
        // Point@3cd1a2f1
        System.out.println(p);
    }
}
