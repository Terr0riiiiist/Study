package Method;

public class Method_Demo3 {
    static void main() {
        int arr[] = {1, 2, 3, 4, 5};

        printArr(arr);
    }

    public static void printArr(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i <= arr.length - 2) {
                System.out.print(arr[i] + ",");
            } else System.out.print(arr[i]);
        }
        System.out.print("]");
    }
}
