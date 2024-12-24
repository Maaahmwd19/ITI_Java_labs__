public class Circle<T> extends Shape<T>{
@Override
    public void draw(T data)
{
    System.out.println("data for circle id "+ data);
}
}
