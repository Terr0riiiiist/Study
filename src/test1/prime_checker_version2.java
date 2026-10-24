package test1;

import java.util.Scanner;
public class prime_checker_version2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        long n = sc.nextInt();

        while (true) {
            if (n >= 1) {
                break;
            } else {
                System.out.println("Invalid input");
                System.out.println("Retype a number: ");
                long num = sc.nextInt();
                n = num;
            }
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum++;
                if (sum >= 3) {
                    break;
                }
            }
        }
        if (sum == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    }
