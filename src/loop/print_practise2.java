package loop;

public class print_practise2 {
    static void main() {
        for (int i = 1; i <= 3; i++) {
                for (int d = 0; d < 3 - i; d++) System.out.print(" ");
            for (int j = 1; j <= 2*i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
