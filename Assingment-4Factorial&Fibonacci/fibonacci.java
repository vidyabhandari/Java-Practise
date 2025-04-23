import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fib1 = 0, fib2 = 1, fib3;
        int limit, count = 2;

        System.out.print("Enter the limit : ");
        limit = sc.nextInt();

        System.out.print("Fibonacci series is ");
        System.out.print(fib1 + " ");
        System.out.print(fib2 + " ");

        while (count <= limit) {
            fib3 = fib1 + fib2;
            System.out.print(fib3 + " ");
            fib1 = fib2;
            fib2 = fib3;
            count++;
        }
    }
}
