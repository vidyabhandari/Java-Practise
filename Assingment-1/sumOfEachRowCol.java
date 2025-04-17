import java.util.Scanner;

public class sumOfEachRowCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of coloums: ");
        int coloums = sc.nextInt();

        int[][] matrix = new int[rows][coloums];

        System.out.println("Enter matric elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloums; j++) {
                System.out.println("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix of " + rows + "rows & " + coloums + " coloums: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloums; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < coloums; j++) {
                rowSum = rowSum + matrix[i][j];
            }
            System.out.println("Row index" + i + " sum: " + rowSum);
        }

        for (int j = 0; j < coloums; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum = colSum + matrix[i][j];
            }
            System.out.println("Coloum index " + j + " sum: " + colSum);
        }
    }
}
