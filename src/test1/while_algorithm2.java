package test1;

import java.util.Scanner;
public class while_algorithm2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = sc.nextInt();
        num = num > 0 ? num : -num;

        int count = 0;
        int divide = 1;
        int sum = 0;

        while (num / divide >= 10) {
            divide *= 10;
            count++;
        }
        while (count >= 0) {
            sum += (num / Math.pow(10, count));
            num = num % (int) (Math.pow(10, count));
            count--;
        }
        System.out.println(sum);
    }
}
