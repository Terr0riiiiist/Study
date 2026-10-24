package Method.Assignment;

import java.util.Scanner;

/*作业3：计算快递邮费
某快递公司的运费规则如下（首重1kg，超出部分按kg计算，不足1kg按1kg算）：

首重1kg：10元；

超出1-5kg：每kg加2元；

超出5kg以上：每kg加1.5元。

键盘录入小数，表示用户快递的重量，计算最终的结果

要求1：快递重量必须大于0，否则重新输入

要求2：不同价位的计算，单独定义一个方法 */
public class Assignment_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入快递重量: ");
        float weight = sc.nextFloat();
        /*这里就不做数据异常的功能了*/

        if (weight - (int) weight > 0) weight = (int) weight + 1;
        else weight = (int) weight;

        System.out.println("快递费用是: " + priceCalculate(weight));
    }

    public static double priceCalculate(float weight) {
        double price;
        int price_1 = 10;
        int price_2 = 20;
        if (weight <= 1) {
            price = 10;
        } else if (weight <= 6) {
            price = price_1 + 2 * (weight - 1);
        } else price = price_2 + 1.5 * (weight - 6);

        return price;
    }

}
