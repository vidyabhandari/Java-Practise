import java.util.Scanner;

public class armStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); //153

        int originalNumber = num; // on=153
        int result = 0; // 0

        while (num > 0) { // 153 //15 // 1 //0!
            int digit = num % 10; //digit(3)=153%10 -> digit(5)=15%10 ->digit(1)=1%10
            result += digit * digit * digit; // result(27) = 0+3*3*3 -> result(152)=27+5*5*5 -> result(153)=152+1*1*1
            num = num / 10; //num(15)=153/10 -> num(1)=15/10 -> num(0)=1/10
        }
        // Check and print result
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

    }
}
