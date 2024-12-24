package lab4pack;

import java.util.function.Function;

public class CelsiusToFahrenheitConverter {
    // This method performs the conversion from Celsius to Fahrenheit
    public double convert(double celsius) {
        Function<Double, Double> Fdegree = (Celsius) -> Celsius * (9.0 / 5.0) + 32;
        return Fdegree.apply(celsius);
    }
}

