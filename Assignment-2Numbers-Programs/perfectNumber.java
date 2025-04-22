import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to chrck if it's a Perfect number: ");
        int num = sc.nextInt(); //6

        int sum = 0;

        for (int i = 1; i < num; i++) { // 1;1<6;2 2;2<6;3 3;3<6;4 4;4<6;5 5;5<6;6
            if (num % i == 0) { // 6%1==6 6%2==0 6%3==0 6%4==2 7%
                sum = sum + i; //sum(2)=0+2 sum(4)=2+2 
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number!");
        } else {
            System.out.println(num + " is a Not a Perfect Number!");
        }
    }
}
