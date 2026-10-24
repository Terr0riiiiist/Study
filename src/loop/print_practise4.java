package loop;

public class print_practise4 {
    static void main() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < 2 * Math.abs(i - 3); j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i != 1 && i !=5){
                for (int j = 1; j <= (7-4*Math.abs(i-3)); j++) {
                    System.out.print(" ");

                }
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
