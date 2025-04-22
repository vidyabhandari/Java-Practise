import java.util.Scanner;

public class last2OfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        int yr = year % 100;

        System.out.print("Last two Digits of the year is : " + yr);

    }
}
