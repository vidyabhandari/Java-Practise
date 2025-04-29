import java.util.Scanner;

public class binToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binNum = sc.nextLong(); // 1010101

        // Step 1: Convert binary to decimal
        int decNum = 0;
        int base = 1;
        long temp = binNum;

        while (temp != 0) {
            int rem = (int) (temp % 10);
            decNum += rem * base;
            base = base * 2;
            temp = temp / 10;
        }

        // Step 2: Convert decimal to octal
        int octalNum = 0;
        int place = 1;
        int decimalTemp = decNum;

        while (decimalTemp != 0) {
            int rem = decimalTemp % 8;
            octalNum += rem * place;
            place *= 10;
            decimalTemp /= 8;
        }

        System.out.println("Octal value: " + octalNum);
    }
}
