package test1;

import java.util.Scanner;

public class continue2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        while (n <=0 || n>= Math.pow(10,5)){
            System.out.println("Invalid input");
            System.out.println("Reenter a number: ");
            int num = sc.nextInt();
            n = num;
        }
        for (int i = 1; i <= n; i++) {
            if ( i % 4 == 0 || i % 10 % 4 == 0 || i % 100 % 4 == 0 || i % 1000 % 4 == 0 || i % 10000 % 4 == 0) {
                continue;
            }else  System.out.println(i);
        }
    }
}
