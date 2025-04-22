import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check prime or not: ");
        int num = sc.nextInt();  //6

        int flag = 0;
        int m = num / 2;  //num(3)=6/2

        if (num == 0 || num == 1) {
            System.out.println("The Number " + num + " is Not Prime!");
            return;
        }

        for (int i = 2; i <= m; i++) { // 2;2<=3;3 3;3<=3;4 4;4<=3;
            if (num % i == 0) { //3%2=!0 4%2==0
                System.out.println("The Number " + num + " is Not Prime!"); // truw
                flag = 1; // 1
                break;
            }
        }
        if (flag == 0) {
            System.out.println("The Number " + num + " is Prime!");

        }
    }
}
