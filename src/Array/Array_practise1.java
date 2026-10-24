package Array;

import java.util.Scanner;

public class Array_practise1 {
    static void main() {
        int [] arr = {33,5,22,44,55,33};
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number : ");
        int n = sc.nextInt();

        boolean state = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                state = true;
                System.out.println(i);
                break;
            }
        }
        if (!state) System.out.println("该数据不存在");
    }
}
