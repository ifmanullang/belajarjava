import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Input: ");
            n = input.nextInt();
            if (n > 7) {
                System.out.print("Apa?");
                return;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == n) {
                        System.out.print("lompat! ");
                    } else {
                        System.out.print(j+ " ");
                    }
                }
            }
            System.out.println();
        } while (true);
    }
}