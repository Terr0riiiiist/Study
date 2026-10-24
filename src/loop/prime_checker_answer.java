package loop;

import java.util.Scanner;

public class prime_checker_answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        while (true) {
            if (n >= 1 && n <= Math.pow(10, 12)) {
                break;
            } else {
                long num = sc.nextLong();
                n = num;
            }
        }

        long sum = 0L;
        for (long i = 1; i*i <= n; i++) {
            if (n==1) {
                System.out.println("No");
                return ;
            }
            if (n % i == 0) {
                if (i >= 2 && i < n) {
                    System.out.println("No");
                    return;
                }
            }

        }
        System.out.println("Yes");
    }
}
