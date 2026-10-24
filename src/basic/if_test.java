package basic;

import java.util.Scanner;

public class if_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type User's Temperature Here:");
        double a = sc.nextDouble();
        if (a >= 38.0){
            System.out.println("Fever");

        }
    }
}
