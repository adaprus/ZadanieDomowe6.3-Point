package pl.javastart.model;

import java.util.Scanner;

public class Point {

    private int[] point = new int[2];

    public int[] getPoint() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędną x");
        point[0] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj współrzędną y");
        point[1] = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        return point;
    }
}
