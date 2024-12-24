package lab4pack;

import java.util.function.Function;

public class QuadraticEquationSolver {

    public float calculateDiscriminant(float a, float b, float c) {
        
	    Function<float[], Float> discriminant = coeffs -> coeffs[1] * coeffs[1] - 4 * coeffs[0] * coeffs[2];
        return discriminant.apply(new float[]{a, b, c});
    }

    public double[] getRealRoots(float a, float b, float discriminant) {
        double sqrtDiscriminant = Math.sqrt(discriminant);
        double root1 = (-b + sqrtDiscriminant) / (2 * a);
        double root2 = (-b - sqrtDiscriminant) / (2 * a);
        return new double[]{root1, root2};
    }

    public double[] getComplexRoots(float a, float b, float discriminant) {
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
        return new double[]{realPart, imaginaryPart};
    }
}

