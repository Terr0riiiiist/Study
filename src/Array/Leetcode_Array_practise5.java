package Array;

import java.util.Arrays;
import java.util.Random;

public class Leetcode_Array_practise5 {
    static void main() {
        Random a = new Random();

        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.nextInt(1, 101);
        }
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                int num = a.nextInt(1, 101);
                while (arr[j] == arr[i] && i != j ) {
                    if (arr[i] != num) {
                        arr[i] = num;
                        break;
                    }else {
                        num = a.nextInt(1, 101);
                        for(int k = 0; k < arr.length ; k++) {
                        while (arr[j] == num || num == arr[k] ){
                            num = a.nextInt(1,101);
                            arr[i] = num;
                        }

                        }

                    }

                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
