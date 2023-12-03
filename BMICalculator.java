import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for height in meters and weight in kilograms
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(height, weight);

        // Display the result
        System.out.println("Your BMI is: " + bmi);
        System.out.println("BMI Category: " + getBMICategory(bmi));

        scanner.close();
    }

    // Function to calculate BMI
    private static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    // Function to determine BMI category
    private static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
 
