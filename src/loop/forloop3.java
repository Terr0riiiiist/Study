package loop;

import java.util.Scanner;

public class forloop3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type two endpoints here: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = a>b ? b : a;
        int max = a<b ? b : a;

        int count = 0;
        for (int i=min ;i<=max ;i++) {
            if (i%3==0 && i%5==0) {
                count++;
            }

        }
        if (count > 0){ System.out.println("在"+min+"和"+max+"之间有 " + count +"个符合的数字");

        }else {
            System.out.println("No number found");
        }

        }
    }
