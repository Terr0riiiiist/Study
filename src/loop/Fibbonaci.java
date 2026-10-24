package loop;

import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count");
        int count = sc.nextInt();

        for (int i = 3; i <= count ; i++) {
            c = a + b;
            a = b;
            b = c;

        }
        System.out.println(c);
    }
}
