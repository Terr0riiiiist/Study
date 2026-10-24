package basic;

import java.util.Scanner;

public class if_demo5  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Score");
        double score = sc.nextDouble();
        if (score >= 0 && score <= 100)
            if (score >= 60) {
            System.out.println("You're passed");
                } else {
                System.out.println("You failed!");
            }
        else System.out.println("Invalid Score");

        }

    }
