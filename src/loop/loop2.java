package loop;

public class loop2 {
    static void main() {
        int sum = 0;
        for(int i = 0; i <= 100; i = i+2){
            sum = sum + i;
        }
        System.out.println("100以内所有偶数和是 " + sum);
    }
}
