import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // Prompt the user for today's date
        System.out.println("What is today's date? (YYYY-MM-DD)");
        String todayDateStr = scanner.nextLine();

        // Convert today's date string to LocalDate object
        LocalDate today = LocalDate.parse(todayDateStr, DateTimeFormatter.ISO_DATE);

        // Set the start date of the course to May 6, 2024
        LocalDate startDate = LocalDate.of(2024, 5, 6);

        // Calculate the number of days left until the course starts
        long daysLeft = ChronoUnit.DAYS.between(today, startDate);

        // Provide feedback based on the number of days left
        if (daysLeft < 0) {
            System.out.println("The course has already started!!!!!:O O:");
        } else if (daysLeft == 0) {
            System.out.println("Welcome to the first day of the course, " + name + "!" + "Good luck and welcome to the hell week!");
        } else {
            System.out.println("Welcome to SALT, " + name + "!");
            System.out.println("Today it is " + daysLeft + " days left until the course starts.");
        }

        // Close the scanner
        scanner.close();
    }
}
