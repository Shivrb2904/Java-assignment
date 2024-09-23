import java.util.Scanner;

public class AgeValid {
    // Method to validate age
    public static void validateAge(int age) throws Lab5Ex1 {
        if (age < 15) {
            // Throw custom exception if age is less than 15
            throw new Lab5Ex1("Age must be above 15.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the age input from the user
            System.out.print("Enter the age of the person: ");
            int age = scanner.nextInt();

            // Validate the age using validateAge method
            validateAge(age);

        } catch (Lab5Ex1 e) {
            // Catch the custom exception and display the error message
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other general exceptions
            System.out.println("Invalid input! Please enter a valid age.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
