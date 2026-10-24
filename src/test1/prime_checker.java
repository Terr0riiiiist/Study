package test1;

import java.util.Scanner;
public class prime_checker {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        long n = sc.nextLong();

        while (true) {
            if (n >= 1 && n <= Math.pow(10, 12)) {
                break;
            } else {
                System.out.println("Invalid input");
                System.out.println("Retype a number: ");
                long num = sc.nextInt();
                n = num;
            }
        }
        long sum = 0L;
            for (int i = 1; i*i <= n; i++) {
                if (n % i == 0) {
                    if (i>= 2 && i < n) {
                        System.out.println("No");
                        break;
                    }
                } else {
                    System.out.println("Yes");
                }
            }
        if (n==1) System.out.println("No");
            }

            }
