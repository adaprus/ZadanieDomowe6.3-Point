package pl.javastart.model;

public class Calculator {

    public String whichQuadrant(Point point) {
        String quadrant;
        if (point.getPointX() != 0 && point.getPointY() != 0) {
            if (point.getPointX() > 0 && point.getPointY() > 0) {
                quadrant = "I";
            } else if (point.getPointX() < 0 && point.getPointY() > 0) {
                quadrant = "II";
            } else if (point.getPointX() < 0 && point.getPointY() < 0) {
                quadrant = "III";
            } else {
                quadrant = "IV";
            }
            return "Punkt leży w " + quadrant + " ćwiartce układu współrzędnych";
        } else {
            return "Punkt leży na osi X lub Y";
        }
    }
}
