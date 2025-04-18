import java.util.Scanner;

public class armStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0, sum = 0;

        // Count digits
        int temp = num;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Calculate sum of each digit raised to 'digits'
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp = temp / 10;
        }

        // Check and print result
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

    }
}
