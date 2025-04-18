public class EnvVariables {
    public static void main(String[] args) {
        System.out.println("PATH = " + System.getenv("PATH"));
        System.out.println("USER = "+System.getenv("USER"));
    }
}
