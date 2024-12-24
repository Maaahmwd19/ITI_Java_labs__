
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> void printShapes(List<? extends Shape<T>> shapes, T data) {
        for (Shape<T> shape : shapes) {
            shape.draw(data);
        }
    }

    public static void main(String[] args) {
        List<Rectangle<String>> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle<>());
        rectangles.add(new Rectangle<>());

        List<Circle<Integer>> circles = new ArrayList<>();
        circles.add(new Circle<>());
        circles.add(new Circle<>());

        System.out.println("Processing Rectangles:");
        printShapes(rectangles, "Rectangle Data");

        System.out.println("\nProcessing Circles:");
        printShapes(circles, 42);
    }

}