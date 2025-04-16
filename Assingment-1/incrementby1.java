import java.util.Scanner;

public class incrementby1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            digit++;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
