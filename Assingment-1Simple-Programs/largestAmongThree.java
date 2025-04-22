import java.util.Scanner;

public class largestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print(num1 + " is Greater!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.print(num2 + " is Greater!");
        } else if (num3 > num1 && num3 > num2) {
            System.out.print(num3 + " is Greater!");
        }
    }
}
