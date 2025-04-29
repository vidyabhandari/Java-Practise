import java.util.Scanner;

public class octalToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the octal number: ");
        String octalNum = sc.nextLine();

        System.out.print("Enter the binary value: ");

        for (int i = 0; i < octalNum.length(); i++) {
            char ch = octalNum.charAt(i);

            switch (ch) {
                case '0':
                    System.out.print("000");
                    break;
                case '1':
                    System.out.print("001");
                    break;
                case '2':
                    System.out.print("010");
                    break;
                case '3':
                    System.out.print("011");
                    break;
                case '4':
                    System.out.print("100");
                    break;
                case '5':
                    System.out.print("101");
                    break;
                case '6':
                    System.out.print("110");
                    break;
                case '7':
                    System.out.print("111");
                    break;
                default:
                    System.out.print("\nInavalid octal digit: " + ch);
                    return;
            }
        }
    }
}
