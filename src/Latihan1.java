public class Latihan1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.printf(".");
            }
            for (int k = 3 - i; k < 4; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
