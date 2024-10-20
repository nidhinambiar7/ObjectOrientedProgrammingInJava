import java.util.Scanner;

class Quadratic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Determine the roots based on the discriminant
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.printf("Root 1: "+ root1);
            System.out.printf("Root 2: "+root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and the same:");
            System.out.printf("Root: "+ root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are imaginary:");
            System.out.printf("Root 1: "+realPart+"+"+imaginaryPart+"i");
            System.out.printf("Root 2: "+realPart+"-"+ imaginaryPart+"i");
        }

        scanner.close(); // Close the scanner
    }
}
