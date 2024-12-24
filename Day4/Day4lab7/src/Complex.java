public class Complex <T extends Number>{
    private  T real;
    private T imig;

    public Complex(T real , T imig)
    {
        this.real= real;
        this.imig = imig;
    }

    public T getReal() {
        return real;
    }

    public T getImaginary() {
        return imig;
    }

    public static   add(Complex<Double> c , Complex<Double> c2) {
        compec result = new c ;
        
        this.real = (T) Double.valueOf(this.real.doubleValue() + c.real.doubleValue());
        this.imig = (T) Double.valueOf(this.imig.doubleValue() + c.imig.doubleValue());
    }
    public void sub(Complex<Double> c) {
        this.real = (T) Double.valueOf(this.real.doubleValue() - c.real.doubleValue());
        this.imig = (T) Double.valueOf(this.imig.doubleValue() - c.imig.doubleValue());
    }

    @Override
    public String toString() {
        return real + " + " + imig + "i";
    }



}
