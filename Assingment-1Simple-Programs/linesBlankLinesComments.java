import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class linesBlankLinesComments {
    public static void main(String[] args) {
        String filename = "E:\\vidya\\A Javaa!\\Java-Practise\\Assingment-1\\hello.java";

        int totalLine = 0;
        int blankLines = 0;
        int commentLines = 0;
        boolean inBlockComment = false;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                totalLine++;

                String trimmedLine = line.trim();

                if (trimmedLine.isEmpty()) {
                    blankLines++;
                } else if (trimmedLine.startsWith("//")) {
                    commentLines++;
                    inBlockComment = true;

                    if (trimmedLine.endsWith("*/")) {
                        inBlockComment = false;
                    }

                    else if (inBlockComment) {
                        commentLines++;
                        if (trimmedLine.endsWith("*/")) {
                            inBlockComment = false;
                        }
                    }
                }
                reader.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("Total Lines: " + totalLine);
        System.out.println("Blank Lines: " + blankLines);
        System.out.println("Comment Lines: " + commentLines);
    }
}
