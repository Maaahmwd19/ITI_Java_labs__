import lab4pack.CelsiusToFahrenheitConverter;
import lab4pack.QuadraticEquationSolver;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           
                System.out.print("Enter the degree in Celsius: ");
                double celsius = scanner.nextDouble();
                CelsiusToFahrenheitConverter cc = new CelsiusToFahrenheitConverter(); 
                double fahrenheit = cc.convert(celsius);
                System.out.println("The degree in Fahrenheit is: " + fahrenheit);

		System.out.println("***********************************");
                float[] coefficients = new float[3];
                System.out.println("Enter the coefficients a, b, and c: ");
                for (int i = 0; i < 3; i++) {
                    coefficients[i] = scanner.nextFloat();
                }

                try {
                    if (coefficients[0] == 0) {
                        throw new ArithmeticException("Devided by zero.");
                    }
                    QuadraticEquationSolver Qu = new QuadraticEquationSolver(); // Initialize the object
                    float discriminant = Qu.calculateDiscriminant(
                        coefficients[0], coefficients[1], coefficients[2]);
                    System.out.println("Discriminant: " + discriminant);

                    if (discriminant < 0) {
                        double[] complexRoots = Qu.getComplexRoots(
                            coefficients[0], coefficients[1], discriminant);
                        System.out.println("The roots are complex:");
                        System.out.printf("Root 1: %.2f + %.2fi\n", complexRoots[0], complexRoots[1]);
                        System.out.printf("Root 2: %.2f - %.2fi\n", complexRoots[0], complexRoots[1]);
                    } else {
                        double[] realRoots = Qu.getRealRoots(
                            coefficients[0], coefficients[1], discriminant);
                        System.out.println("The roots are real:");
                        System.out.println("Root 1: " + realRoots[0]);
                        System.out.println("Root 2: " + realRoots[1]);
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
        }
    }

