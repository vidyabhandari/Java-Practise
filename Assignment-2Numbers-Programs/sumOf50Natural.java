import java.util.Scanner;

public class sumOf50Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum = sum + i;
        }

        System.out.print("Sum of 50 natural numbers: " + sum);
    }
}
