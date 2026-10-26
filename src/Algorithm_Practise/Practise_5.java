package Algorithm_Practise;

/*给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水

输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]

输出：6 */
public class Practise_5 {
    static void main() {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int Left2Right[] = new int[12];
        int Right2Left[] = new int[12];
        int Merged[] = new int[12];
        int i = 0;
        int initial = 0;
        for (; i < arr.length; i++) {
            initial = Math.max(initial, arr[i]);
            Left2Right[i] = initial;
        }
        initial = 0;
        for (int j = arr.length - 1; j > 0; j--) {
            initial = Math.max(initial, arr[j]);
            Right2Left[j] = initial;
        }

        for (int m = 0; m < Merged.length; m++) {
            if (Left2Right[m] >= Right2Left[m]) {
                Merged[m] = Right2Left[m];
            } else {
                Merged[m] = Left2Right[m];
            }
        }
        int sum = 0;
        for (int n = 0; n < Merged.length; n++) {
            sum += Math.min(Left2Right[n], Right2Left[n]) - arr[n];
        }
        System.out.println(sum);
    }
}

