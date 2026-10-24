package basic;

import java.util.Scanner;

public class coordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinate");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("Y-axis");
        } else if (y == 0) {
            System.out.println("X-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x > 0) {
            System.out.println("Quadrant 4");
        } else if (y > 0) {
            System.out.println("Quadrant 2");
        } else {
            System.out.println("Quadrant 3");
        }
    }
}
