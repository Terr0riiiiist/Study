package basic;

import java.util.Scanner;

public class if_Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price");
        double Price = sc.nextDouble();
        double Discount = 0;
        if (Price > 0) {
            if (Price < 10) {
                Discount = 0;
            } else if (Price < 50) {
                Discount = 10;
            } else if (Price < 100) {
                Discount = 30;
            } else if (Price < 200) {
                Discount = 50;
            } else {
                Discount = 90;
            }
            System.out.println("The discounted price is : " + (Price - Discount));

            double Memberdiscount = 0.2 * Price;
            if (Memberdiscount > Discount) {
                System.out.println("Price is, " + (Price - Memberdiscount));
            } else {
                System.out.println("Price is, " + (Price - Discount));
            }
        } else {
            System.out.println("Invalid Price");
        }
    }
}
