package basic;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        System.out.println("Type your figure here");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean result = a /10 ==7 || a % 10 / 7 == 0 || a % 7 == 0;
        System.out.println(result);
    }
}
