import java.util.Scanner;

public class daysToYearsWeeksDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter number of days: ");
        int totalDays = sc.nextInt();

        // Step 2: Convert to years
        int years = totalDays / 365;

        // Step 3: Get remaining days
        int remainingDays = totalDays % 365;

        // Step 4: Convert remaining to weeks
        int weeks = remainingDays / 7;

        // Step 5: Remaining days
        int days = remainingDays % 7;

        // Output the result
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
        System.out.println("Remainig Days: " + remainingDays);
    }
}
