abstract class Shape 
{
    public abstract void draw();
    public void display() 
    {
        System.out.println("Displaying Shape");
    }
}
class Circle extends Shape
{
    @Override
    public void draw() 
    {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape 
{
    @Override
    public void draw()
   {
        System.out.println("Drawing Rectangle");
    }
}
public class abstracts
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.draw();
        circle.display();
        rectangle.draw();
        rectangle.display();
    }
}
