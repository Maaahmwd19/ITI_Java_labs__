public class Rectangle<T> extends Shape<T> {
    @Override
    public void draw(T data) {
        System.out.println("Data for Rectangle is " + data);
    }
}
