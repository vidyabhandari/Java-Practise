import java.util.Scanner;

public class sumofNnaturalRec {

    static int sumofNnatural(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumofNnatural(num);
        System.out.println("Sum is " + result);
    }
}
