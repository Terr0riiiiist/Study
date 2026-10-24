package basic;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your number here");
        int number = sc.nextInt();
        int first = number /1000 ;
        int second = number % 1000 / 100;
        int third = number % 1000 % 100 /10;
        int fourth = number % 1000 % 100 % 10;
        boolean result = first == fourth && second == third;
        System.out.println(result);

    }
}
