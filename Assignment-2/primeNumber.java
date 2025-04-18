import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check prime or not: ");
        int num = sc.nextInt();

        int flag = 0;
        int m = num / 2;

        if (num == 0 || num == 1) {
            System.out.println("The Number " + num + " is Not Prime!");
            return;
        }

        for (int i = 2; i <= m; i++) {
            if (num % i == 0) {
                System.out.println("The Number " + num + " is Not Prime!");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("The Number " + num + " is Prime!");

        }
    }
}
