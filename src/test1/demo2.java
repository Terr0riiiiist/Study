package test1;

public class demo2 {
    static int number = 8;
    static String name = switch (number) {
        case 1, 2, 3, 4, 5 -> "group 1";
        case 6, 7, 8 -> "group 2";
        default -> "Invalid";
    };

    static void main() {
        System.out.println(name);
    }
}
