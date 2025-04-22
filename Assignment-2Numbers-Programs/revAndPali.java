import java.util.Scanner;

public class revAndPali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = sc.nextInt();

        int original = num;

        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.print("Reserved number: " + rev);

        if (original == rev) {
            System.out.print(" Palindrome!");
        } else {
            System.out.print(" Not Palindrome!");
        }
    }
}
