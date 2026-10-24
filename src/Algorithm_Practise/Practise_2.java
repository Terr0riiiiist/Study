package Algorithm_Practise;

import java.util.Random;
/*
给你两个整数 M 和 N，M 表示红包的总额，N 表示红包的个数。

现在有 N 个人来抽红包，每个人都是随机的，打印每个人领的红包金额。 */
public class Practise_2 {
    static void main() {
        int m = 50;
        int n = 5;
        int arr[] = distribute(m, n);
        for (int i = 0; i < arr.length; i++) {
            int rank = i + 1;
            System.out.printf("第%d个人领了%d\n", rank, arr[i]);
        }

    }

    public static int[] distribute(int m, int n) {
        Random rd = new Random();
        int[] arr = new int[n];

        int sum = 0;
        int rest = m;
        int money;
        for (int i = 0; i < arr.length - 1; i++) {
            money = rd.nextInt(0, rest);
            arr[i] = money;
            sum = sum + money;
            rest = rest - money;
        }
        arr[arr.length - 1] = rest;
        return arr;
    }
}
