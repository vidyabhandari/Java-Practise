import java.util.Scanner;

public class binToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();

        // Validation check: only 0 and 1 allowed
        int temp = binNum;
        boolean isBinary = true;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0 && digit != 1) {
                isBinary = false;
                break; //
            }
            temp = temp / 10;
        }

        if (!isBinary) {
            System.out.println("Invalid binary number.");
            return; // stop program
        }

        System.out.println("Binary Number: " + binNum);

        int num = binNum;
        int decNum = 0;
        int pow = 1;

        while (num > 0) {
            int lastDigit = num % 10;
            decNum = decNum + lastDigit * pow;
            pow = pow * 2;
            num = num / 10;
        }

        System.out.println("Decimal Number: " + decNum);
    }
}
