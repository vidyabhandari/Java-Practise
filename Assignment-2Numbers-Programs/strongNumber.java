import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check the number is perfect or not: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong Number!");
        } else {
            System.out.println(original + " is Not a Strong Number!");
        }
    }
}
