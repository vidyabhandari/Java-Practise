import java.util.Scanner;

public class twoNumbersAreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.print(num1 + " & " + num2 + " are Equal!");
        } else {
            System.out.print(num1 + " & " + num2 + " are Not Equal!");
        }
    }
}
