package pl.javastart.model;

public class Calculator {

    public String whichQuadrant(int[] point) {
        String quadrant;
        if (point[0] != 0 && point[1] != 0) {
            if (point[0] > 0 && point[1] > 0) {
                quadrant = "I";
            } else if (point[0] < 0 && point[1] > 0) {
                quadrant = "II";
            } else if (point[0] < 0 && point[1] < 0) {
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
