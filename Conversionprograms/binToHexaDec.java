import java.util.Scanner;

public class binToHexaDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();
        long decimal = 0, i = 1;

        while (binary != 0) {
            long rem = binary % 10;
            decimal = decimal + rem * i;
            i = i * 2;
            binary = binary / 10;
        }

        String hex = Long.toHexString(decimal).toUpperCase();
        System.out.print("Equivalent Hexadecimal: " + hex);
    }
}
