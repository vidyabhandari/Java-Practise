import java.util.Scanner;

public class input2323Ouput2332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4 didgit numbers: ");
        String num = sc.nextLine();

        System.out.println("Input: " + num);
        char[] digits = num.toCharArray();

        char temp = digits[2];
        digits[2] = digits[3];
        digits[3] = temp;

        String result = new String(digits);

        System.out.println("Output: " + result);
    }
}