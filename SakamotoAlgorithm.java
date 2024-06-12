import java.util.Scanner;

public class SakamotoAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter year: ");
        int y = scanner.nextInt(); // Read year from user input

        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt(); // Read month from user input

        System.out.print("Enter day of the month: ");
        int d = scanner.nextInt(); // Read day from user input

        int w = (y + y / 4 - y / 100 + y / 400 + (13 * (m + 1)) / 5 + d) % 7; // Calculate the day of the week using Sakamoto's Algorithm
        System.out.println("Day of the week: " + (w == 0 ? "Saturday" : w == 1 ? "Sunday" : w == 2 ? "Monday" : w == 3 ? "Tuesday" : w == 4 ? "Wednesday" : w == 5 ? "Thursday" : "Friday")); // Print the corresponding day of the week based on the calculated value
    }
}
