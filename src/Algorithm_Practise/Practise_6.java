package Algorithm_Practise;

/*彩票规则：
        前区： 1 ~ 35 选5个号码（唯一）
        后区： 1~ 12 选2个号码（唯一）
        跨区可重复

中奖规则：
        一等奖：5 + 2
        二等奖：5 + 1
        三等奖：5 + 0 / 4 + 2
        四等奖：4 + 1 / 3 + 2
        五等奖：4 + 0 / 3 + 1 / 2 + 2
        六等奖：3 + 0 / 1 + 2 / 2 + 1 / 0 + 2   */

import java.util.Random;
import java.util.Scanner;

public class Practise_6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int Front[] = new int[5];
        int Back[] = new int[2];
        Random r = new Random();

        for (int i = 0; i < Front.length; i++) {
            int num = r.nextInt(1,36) ;
            boolean repeat = false;
            for (int j = 0; j < i; j++) {
                if (Front[j] == num) {
                    repeat = true;
                }
            }
            if (repeat) {
                i--;
            } else {
                Front[i] = num;
            }
        }

        for (int i = 0; i < Back.length; i++) {
            int num = r.nextInt(1,13) ;
            boolean repeat = false;
            for (int j = 0; j < i; j++) {
                if (Back[j] == num) {
                    repeat = true;
                }
            }
            if (repeat) {
                i--;
            } else {
                Back[i] = num;
            }
        }

        System.out.print("前区：");
        for (int i = 0; i < Front.length; i++) {
            System.out.print(Front[i] + " ");
        }
        System.out.println();
        System.out.print("后区：");
        for (int i = 0; i < Back.length; i++) {
            System.out.print(Back[i] + " ");
        }
        System.out.println();

        int[] userFront = new int[5];
        int[] userBack = new int[2];

        System.out.println("请输入前区5个号码：");
        for (int i = 0; i < userFront.length; i++) {
            userFront[i] = sc.nextInt();
        }

        System.out.println("请输入后区2个号码：");
        for (int i = 0; i < userBack.length; i++) {
            userBack[i] = sc.nextInt();
        }

        boolean usedFront [] = new boolean [36];
        for (int i = 0; i < Front.length; i++) {
            usedFront[Front[i]] = true;
        }

        int frontCount = 0;
        for (int c = 0; c < userFront.length; c++) {
            if (usedFront[userFront[c]]){
                frontCount++;
            }
        }

        boolean usedBack [] = new boolean [13];
        for (int i = 0; i < Back.length; i++) {
            usedBack[Back[i]] = true;
        }
        int backCount = 0;
        for (int c = 0; c < 2; c++) {
            if (usedBack[userBack[c]]){
                backCount++;
            }
        }

        String prize = "未中奖";
        if (frontCount == 5 && backCount == 2) {
            prize = "一等奖";
        } else if (frontCount == 5 && backCount == 1) {
            prize = "二等奖";
        } else if ((frontCount == 5 && backCount == 0) || (frontCount == 4 && backCount == 2)) {
            prize = "三等奖";
        } else if ((frontCount == 4 && backCount == 1) || (frontCount == 3 && backCount == 2)) {
            prize = "四等奖";
        } else if ((frontCount == 4 && backCount == 0) || (frontCount == 3 && backCount == 1) || (frontCount == 2 && backCount == 2)) {
            prize = "五等奖";
        } else if ((frontCount == 3 && backCount == 0) || (frontCount == 1 && backCount == 2) || (frontCount == 2 && backCount == 1) || (frontCount == 0 && backCount == 2)) {
            prize = "六等奖";
        }

        System.out.println("前区命中：" + frontCount + " 个，后区命中：" + backCount + " 个");
        System.out.println("中奖：" + prize);
    }
}
