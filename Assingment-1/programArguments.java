public class programArguments {
    public static void main(String[] args) {
        // Print the program name (the first argument is the program name itself)
        System.out.println("Program Name: " + programArguments.class.getSimpleName());

        // Print all arguments passed to the program
        System.out.println("Arguments: ");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

/*
 * run the program :
 * javac ProgramArguments.java
 * java ProgramArguments hello world 123
 */
