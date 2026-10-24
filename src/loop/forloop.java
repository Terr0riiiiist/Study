package loop;

public class forloop {
    static void main() {
        int sum = 0;
        for (int i = 1; i<=100; i+= 1){
            if (i%2==0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
