import java.util.Scanner;

public class reverseNumberRec {

    static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = reverseNumber(num);

        System.out.print("Reverse number: " + result);
    }
}
