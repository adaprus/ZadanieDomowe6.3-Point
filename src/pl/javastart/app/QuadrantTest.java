package pl.javastart.app;

import pl.javastart.model.Calculator;
import pl.javastart.model.Point;

public class QuadrantTest {
    public static void main(String[] args) {
        Point point = new Point();
        Calculator calculator = new Calculator();
        int array[] = point.getPoint();

        System.out.println(calculator.whichQuadrant(array));
    }
}
