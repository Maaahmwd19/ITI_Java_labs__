public class ExceptionThrow {
    public void getPositiveNumber(int number) throws myException {
        if (number < 0) {
            throw new myException("Negative number: " + number + ". Must be positive.");
        }
        System.out.println("Positive number: " + number);
    }
    public void divide(int numerator, int denominator) throws myException {
        if (denominator == 0) {
            throw new myException("Division by zero is not allowed.");
        }
        double result = (double) numerator / denominator;
        System.out.println("Result of division: " + result);
    }

    public void checkStringLength(String str) throws myException {
        //String StringPattern =  "^[a-zA-Z]+$" ;
        if (str == null || str.length() < 5 || str.length() > 10) {
            throw new myException("String length must be between 5 and 10 characters.");
        }

        System.out.println("Valid string: " + str);
    }

}
