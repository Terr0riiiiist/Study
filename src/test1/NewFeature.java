package test1;

public class NewFeature {
    static void main() {
        int number = 8;
        String name = switch (number) {
                        case 1,2,3,4,5 -> {
                            yield "group 1";
                        }
                        case 6,7,8,9,10 -> {
                            yield "group 2";
                        }
                        default -> "invalid" ;
        };
    }
}
