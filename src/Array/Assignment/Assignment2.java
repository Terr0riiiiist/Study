package Array.Assignment;

public class Assignment2 {
    static void main() {

        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};
        int arr3[] = new int[10];

        int count = 0;
        int i = 0;
        int j = 0;
        for (; i < arr1.length; i++) {
            for (; j < arr2.length; j++) {
                if (arr1[i] < arr2[j]) {
                    arr3[count] = arr1[i];
                    count++;
                    break;
                } else {
                    arr3[count] = arr2[j];
                    count++;
                }

            }
        }
        int p = j;
        for (; p < arr2.length; p++) {
            arr3[count] = arr2[p];
            count++;
        }
        for (int c = 0; c < arr3.length; c++) {
            System.out.println(arr3[c]);

        }

    }
}
