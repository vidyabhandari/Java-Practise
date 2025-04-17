import java.util.Scanner;

public class gradeDescription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Grage you have got: ");
        int grade = sc.nextInt();

        if (grade > 90) {
            System.out.println("You have secured A Grade!");
        } else if (grade > 70) {
            System.out.println("You have secured B Grade!");
        } else if (grade > 50) {
            System.out.println("You have secured C Grade!");
        } else if (grade > 35) {
            System.out.println("You have secured D Grade!");
        } else {
            System.out.println("Sorry! Better luck next time!");
        }
    }
}
