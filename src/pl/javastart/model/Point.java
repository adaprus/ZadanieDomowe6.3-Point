package pl.javastart.model;

import java.util.Scanner;

public class Point {

    private int pointX;
    private int pointY;

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public Point() {
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public Point getPoint() {
        Scanner scanner = new Scanner(System.in);
        Point point = new Point();

        System.out.println("Podaj współrzędną x");
        pointX = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj współrzędną y");
        pointY = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        return point;
    }
}
