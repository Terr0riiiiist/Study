package loop;

import java.util.Scanner;

public class Forloop_Array {
    static void main() {
        int a = 0;
        int sum = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            a = i;
            a = (a % 2 == 0) ? -a : a;
            sum +=a;
        }
        System.out.println("The sum is " + sum);
    }
}
