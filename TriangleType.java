import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three side lengths of the triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Step 1: Check if the sides form a valid triangle
        if (isValidTriangle(a, b, c)) {
            // Step 2: Determine triangle type
            if (a == b && b == c) {
                //equilateral if all sides are equal
                System.out.println("This is an Equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                //else isosceles if 2 sides are equal
                System.out.println("This is an Isosceles triangle.");
            } else {
                //else scalene if no sides are equal
                System.out.println("This is a Scalene triangle.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        sc.close();
    }

    // Helper method to check triangle validity
    public static boolean isValidTriangle(double a, double b, double c) {
        // ❌ Bug: '>' changed to '<' in the first condition
        return (a + b < c) && (a + c > b) && (b + c > a)
                && a > 0 && b > 0 && c > 0;
    }
}
