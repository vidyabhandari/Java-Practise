import java.util.Scanner;

public class multiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String b1 = sc.nextLine();

        System.out.print("Enter second binary number: ");
        String b2 = sc.nextLine();

        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);

        int mul = num1 * num2;

        String result = Integer.toBinaryString(mul);

        System.out.print("Product of binary numbers: " + result);
    }
}
