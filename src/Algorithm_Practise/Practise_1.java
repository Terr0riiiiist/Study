package Algorithm_Practise;

/*
给你一个数组 nums 和一个值 val，你需要删除所有数值等于 val 的元素。

举例1：

输入：nums = [3,2,2,3]　val = 3

输出：nums = [2,2] 剩余2个元素

举例2：

输入：nums = [0,1,2,2,3,0,4,2]　val = 2

输出：nums = [0,1,4,0,3] 剩余5个元素 */
public class Practise_1 {
    static void main() {
        int nums[] = {1, 2, 2, 3, 4, 5, 6};
        nums = removeElement(2, nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int[] removeElement(int val, int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int array[] = new int[n];

        while (i < n) {
            if (arr[i] != val) {
                array[j] = arr[i];
                j++;
                i++;
            } else {
                i++;
            }

        }

        int Array[] = new int[j];
        for (int p = 0; p < j; p++) {
            Array[p] = array[p];
        }
        return Array;
    }
}
