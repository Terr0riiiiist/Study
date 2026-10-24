package loop;

public class loop1 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 5; i >= 1; i--) {
            sum = sum + i;
        };
        System.out.println(sum);
    }
    }
