package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class array2 {
    static void main() {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        int num = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");
            num = sc.nextInt();
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

}
