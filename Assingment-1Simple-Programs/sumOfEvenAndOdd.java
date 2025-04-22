import java.util.Scanner;

public class sumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even_sum = 0, odd_sum = 0;

        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                even_sum = even_sum + i;
            else
                odd_sum = odd_sum + i;
        }
        System.err.println("Sum of even numbers is: " + even_sum);
        System.out.println("Sum of odd numbers is : " + odd_sum);
    }
}
