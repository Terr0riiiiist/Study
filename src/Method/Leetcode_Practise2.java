package Method;

import java.util.Random;
import java.util.Scanner;

public class Leetcode_Practise2 {

    public static int[] getRandomNumbers() {
        int arr[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }
        boolean used[] = new boolean[100];
        for (int j = 0; j < arr.length; j++) {
            if (used[arr[j]] == false) {
                used[arr[j]] = true;
            } else {
                int temp = random.nextInt(1, 101);
                while (used[temp] == true) {
                    arr[j] = temp;
                    used[temp] = true;
                }
            }

        }

        return arr;
    }

    static void main() {
        int Arr[] = getRandomNumbers();
        for (int j = 0; j < Arr.length; j++) {
            System.out.println(Arr[j]);
        }
    }
}
