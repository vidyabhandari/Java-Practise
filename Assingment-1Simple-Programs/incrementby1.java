import java.util.Scanner;

public class incrementby1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // 123

        int result = 0;
        int place = 1;

        while (num > 0) {
            int rem = num % 10;
            rem = (rem + 1) % 10;
            result = result + rem * place;
            place = place * 10;
            num = num / 10;
        }

        System.out.println(result);
    }
}
