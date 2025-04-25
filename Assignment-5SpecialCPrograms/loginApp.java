import java.io.Console;

public class loginApp {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available. Please run from terminal.");
            return;
        }

        String username = console.readLine("Enter User name: ");

        char[] passwordChars = console.readPassword("Enter the password <any 8 characters>:");
        String password = new String(passwordChars);

        System.out.println("Your password is: " + password);
    }
}
