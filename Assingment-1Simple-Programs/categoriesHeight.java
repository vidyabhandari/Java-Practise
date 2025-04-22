import java.util.Scanner;

public class categoriesHeight {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Height(in centimeter: ): ");
    float height=sc.nextFloat();

    if (height<150.0) {
        System.out.println("Drawf!");
    }else if((height>=150.0) && (height<=165.0)) {
        System.out.println("Average Height!");
    }else if ((height>=165.0) && (height<=195.0)) {
        System.out.println("Taller!");
    }else{
        System.out.println("Abnormal height!");
    }
    }
}
