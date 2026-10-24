package Method.Assignment;

import java.util.Scanner;

/*跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分，剩余的分数再求平均数，改平均数为选手最终得分。

要求1：利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入

要求2：定义方法分别求数组的最大值和最小值

要求3：计算五名评委的总分

要求4：总分 - 最大值 - 最小值，求选手最终平均分*/

public class Assignment_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int arr[] = new int[5];

        for (int i = 0; i < arr.length;i++) {
            System.out.println("输入得分: ");
            n = sc.nextInt();
            while (n < 0 || n > 100) {
                System.out.println("Invalid Input");
                System.out.println("重新输入得分: ");
                n = sc.nextInt();
            }
            arr[i] = n;
        }
        int min = getMin(arr);
        int max = getMax(arr);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }  /*计算总分*/

        float avg = 0;
        avg = (float) (sum - min - max) / 3 ;
        System.out.println("选手最终得分为: " + avg);
    }


    public static int getMax(int arr[]) {
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] > arr[j]) {
                j++;
            } else {
                i = j;
                j++;
            }
        }
        return arr[i];
    }

    public static int getMin(int arr[]){
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] < arr[j]) {
                    j++;
                } else {
                    i = j;
                    j++;
            }
        }
        return arr[i];
    }
}

