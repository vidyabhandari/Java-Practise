import java.util.Scanner;

public class primeNumInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start number : ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime number starts from " + start + " to " + end);

        for (int i = start; i <= end; i++) {
            int m = i / 2;
            int flag = 0;

            if (i == 0 || i == 1) {
                continue;
            } else {
                for (int j = 2; j <= m; j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                System.out.println(i + " ");
            }
        }
    }
}