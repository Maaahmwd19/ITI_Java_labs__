public abstract class Shape<T> {
public  abstract void draw(T data);
public void draw()
{
    System.out.println("Default draw with no data");
}
}


