
public class Main {
    public static void main(String[] args) {
        Complex<Integer> c1 = new Complex<>(3, 4);
        Complex<Doub































    le> c2 = new Complex<>(1.5, 2.5);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c1.add(c2);
        System.out.println("Sum: " +c1.toString());
        c1.sub(c2);x
        System.out.println("Difference: " + c1.toString());
    }
}