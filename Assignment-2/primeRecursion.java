import java.util.Scanner;

public class primeRecursion {

    static boolean primeORNot(int i, int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        if (i > num / 2) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return primeORNot(num, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check prime or not: ");
        int num = sc.nextInt();

        if (primeORNot(num, 2)) {
            System.out.println("The number " + num + " is Prime!");
        } else {
            System.out.println("The Number " + num + " is Not Prime!");
        }
    }
}
