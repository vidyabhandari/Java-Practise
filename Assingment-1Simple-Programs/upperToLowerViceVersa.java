import java.util.Scanner;

public class upperToLowerViceVersa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentance: "); //hello world
        String sen = sc.nextLine();

        String result = "";

        for (int i = 0; i < sen.length(); i++) {
            char ch = sen.charAt(i);

            if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            } else {
                result = result + ch;
            }
        }
        System.out.print("Changed Sentence: " + result);
    }
}
