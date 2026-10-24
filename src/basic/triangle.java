package basic;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {

            if ((a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b)
                    && (a == b || b == c || a == c)) {
                System.out.println("isosceles right triangle");
            } else if (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b) {

                System.out.println("right triangle");
            } else if ((a*a + b*b < c*c || b*b + c*c < a*a || a*a + c*c < b*b)
                    && (a == b || b == c || a == c)) {

                System.out.println("isosceles obtuse triangle");
            } else if (a*a + b*b < c*c || b*b + c*c < a*a || a*a + c*c < b*b) {

                System.out.println("obtuse triangle");
            } else if (a == b || b == c || a == c) {

                System.out.println("isosceles acute triangle");
            } else {

                System.out.println("acute triangle");
            }
        } else System.out.println("not a triangle");
    }
}
