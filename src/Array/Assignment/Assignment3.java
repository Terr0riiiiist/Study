package Array.Assignment;

public class Assignment3 {
    static void main() {
        int[] num = {1, 3, 5, 6};
        int target1 = 4;
        int target2 = 3;
        int target3 = 7;

        int count = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] == target1) {
                System.out.println(i);
                count++;
                break;
            }
        }
        int count2 = 0;
        int i = 0;
        if (count == 0) {
            for (; i < num.length; i++) {
                if (num[i] < target1) {
                    count2++;
                } else break;
            }
            System.out.println(count2);
        }
    }
}
