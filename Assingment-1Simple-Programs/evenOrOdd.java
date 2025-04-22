import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is even or odd: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print(num + " is Even!");
        } else {
            System.out.print(num + " is Odd!");
        }
    }
}
