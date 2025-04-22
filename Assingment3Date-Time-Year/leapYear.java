import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int year = sc.nextInt();

        if ((year % 400) == 0) {
            System.out.print(year + " is a Leap Year!");
        } else if ((year % 100) == 0) {
            System.out.println(year + " is Not a Leap Year!");
        } else if ((year % 4) == 0) {
            System.out.println(year + " is a Leap Year!");
        } else {
            System.out.println(year + " is a Not a Leap Year!");
        }
    }
}
