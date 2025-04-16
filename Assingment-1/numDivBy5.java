import java.util.Scanner;

public class numDivBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 5 == 0) {
                count++;
            }
        }
        System.out.print("Count of numbers divisible by 5: " + count);
    }
}
