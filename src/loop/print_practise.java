package loop;

public class print_practise {
    static void main() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j >= i-3; j--) {
                System.out.print(" ");
            }
            System.out.print("******");
            System.out.println();
        }
    }
}
