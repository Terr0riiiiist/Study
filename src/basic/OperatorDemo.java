package basic;

import java.util.Scanner;

public class OperatorDemo {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type your number here");
        int number = sc.nextInt();
        int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 100 % 10;
        System.out.println("个位:"+ first);
        System.out.println("十位:"+ second);
        System.out.println("百位:"+ third);

    }
}
