package Array.Assignment;

public class Assignment1_1 {
    static void main() {
        int nums[] = {1, 2, 3, 3, 4, 5, 6, 7, 8};
        int target = 9;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    count++;
                    System.out.println("(" + i + "," + j + ")");
                    break;
                }
            }
            if (count != 0) break;
        }
    }
}
