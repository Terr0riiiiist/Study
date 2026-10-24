package Array;

public class Array_practise2 {
    static void main() {
        int [] arr = {33,5,22,44,55,33};

        int default_value = 33;
        int max_value = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > default_value) max_value = arr[i];
        }
        System.out.println(max_value);
    }

}
