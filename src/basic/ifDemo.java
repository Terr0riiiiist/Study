package basic;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The total price of goods is :");
        double Price = sc.nextDouble();
        double Price_ = Price;

        if (Price > 0) {
            if (Price < 50) {
                Price = Price - 8;
            } else if (Price < 100) {
                Price = Price - 30;
            } else if (Price < 200) {
                Price = Price - 50;
            } else {
                Price = Price - 90;
            }
        } else {
            System.out.println("Invalid price");
        }
        double DiscountPrice = Price_ * 0.8;
        if (DiscountPrice > Price * 0.8 ){

            }else Price = DiscountPrice;
        System.out.println("The final price is : " + Price);
        }
    }
