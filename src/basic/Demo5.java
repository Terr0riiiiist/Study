package basic;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("type your integer here");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 100 % 10;
        boolean result = (first + second + third)%3 ==0;
        System.out.println(result);

    }
}
