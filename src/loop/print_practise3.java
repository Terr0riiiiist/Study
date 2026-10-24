package loop;

public class print_practise3 {
    static void main() {
        for (int i = 1; i <= 7; i++) {

            for (int j = 0; j < Math.abs(4 - i) ; j++) {
                System.out.print(" ");
            }
            for (int d = 1; d < 8 - Math.abs(4 - i) * 2; d++){
                System.out.print("*");}
            System.out.println();
        }
    }
}
