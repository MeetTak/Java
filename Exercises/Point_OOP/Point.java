package Exercises.Point_OOP;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distance(int p1, int p2) {

        if (p2 > p1) {
            return Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(p2 - p1, 2));
        } else {
            return Math.sqrt(Math.pow(p1 - p2, 2) + Math.pow(p1 - p2, 2));
        }

    }
}

// Alternatively
//public class Point {
//
//    private int x;
//    private int y;
//
//    public Point() {}
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public double distance() {
//        return distance(0, 0);
//    }
//
//    public double distance(Point a) {
//        return distance(a.x, a.y);
//    }
//
//    public double distance(int x, int y) {
//
//        int xDiff = this.x - x;
//        int yDiff = this.y - y;
//        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
//    }
//}