package Method;

import java.util.Random;

public class Practise2_Using_Method {
    static void main() {
        Random r = new Random();
        int arr [] = new int [10];
        for (int j = 0; j < arr.length; j++) {
            int num = r.nextInt(1,101);
            while(contains(num,arr) != false){
                num = r.nextInt(1,101);
            }
            arr[j] = num;
            }
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }

    }
    public static boolean contains (int num, int arr []){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;

    }
}
