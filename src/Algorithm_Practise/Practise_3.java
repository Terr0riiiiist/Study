package Algorithm_Practise;


/*给定两个递增有序数组，先合并并去重（重复元素只保留一个），再求其中位数
2n-1元素，中位数是第n个元素;
2n个元素，中位数是(n-1)和n个元素的算数平均数.
去重既作用于各数组内部，也作用于合并后的整体，因此重复的 3 只计一次.

 */
public class Practise_3 {
    static void main() {
        double[] arr1 = {1, 3, 5, 7, 9};
        double[] arr2 = {2, 3, 6, 8};

        double[] merged = MergeSort(arr1, arr2);
        System.out.println("合并后的数组：" + java.util.Arrays.toString(merged));
        System.out.println("中位数：" + median(merged));
    }


    public static double[] MergeSort(double[] arr1, double[] arr2) {
        double[] p = dedup(arr1);
        double[] q = dedup(arr2);
        int m = p.length;
        int n = q.length;
        double[] merged = new double[m + n - duplicateCount(p, q)]; /*计算新数组的元素个数*/
        int i = 0; /*数组p指针*/
        int j = 0; /*数组q指针*/
        int c = 0;

        while (i < m && j < n) {
            if (p[i] < q[j]) {
                if (c == 0 || p[i] != merged[c - 1]) {
                    merged[c] = p[i];
                    c++;
                }
                i++;
            } else {
                if (c == 0 || q[j] != merged[c - 1]) {
                    merged[c] = q[j];
                    c++;
                }
                j++;
            }

        }

        if (i == m) {  /*加上余下的q数组元素*/
            for (int v = j; v < q.length; v++) {
                if (c == 0 || q[v] != merged[c - 1]) {
                    merged[c] = q[v];
                    c++;
                }
            }


        } else if (j == n) { /*加上余下的p数组元素*/
            for (int z = i; z < p.length; z++) {
                if (c == 0 || p[z] != merged[c - 1]) {
                    merged[c] = p[z];
                    c++;
                }
            }
        }

        return merged;


    }

    /* 计算合并后数组的中位数 */
    public static double median(double[] merged) {
        int n = merged.length;
        double median;
        if (n % 2 == 0) {
            median = (merged[n / 2 - 1] + merged[n / 2]) / 2;
        } else {
            median = merged[n / 2];
        }
        return median;

    }

    /* 计算重复元素的个数 */
    public static int duplicateCount(double[] arr1, double[] arr2) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
                count++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else j++;
        }
        return count;
    }


    /* 去除数组中的重复元素，保持递增顺序，返回新数组 */
    public static double[] dedup(double[] arr) {
        if (arr.length == 0) {
            return new double[0];
        }
        double[] temp = new double[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k == 0 || temp[k - 1] != arr[i]) {
                temp[k] = arr[i];
                k++;
            }
        }
        double[] result = new double[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        return result;
    }


}


