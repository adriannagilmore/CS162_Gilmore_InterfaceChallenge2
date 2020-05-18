import com.company.Circle;
import com.company.Point;
import com.company.Rectangle;
import com.company.Shape;
import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Collections;

public class ShapeCreator extends PApplet{
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    public void settings() {
        size(500,500);
    }

    public void setup() {
        add(shapes);
        display(shapes);
        System.out.println(String.format("The total number of shapes created are: %d", Shape.getNumShapes()));
        Collections.sort(shapes);
        display(shapes);
    }

    public void draw() {
        for(Shape shape : shapes) {
            shape.draw(this);
        }
    }

    private static void add(ArrayList<Shape> shapes) {
        shapes.add(new Circle(new Point(500/2,500/2),100));
        shapes.add(new Rectangle(new Point (100,100),50,300));
        shapes.add(new Rectangle(new Point (350,100),50,300));
        shapes.add(new Rectangle(new Point (150,100),250,50));
        shapes.add(new Rectangle(new Point (100,350),250,50));
        shapes.add(new Circle(new Point(70,435),35));
        shapes.add(new Circle(new Point(35,470),20));
        shapes.add(new Circle(new Point(430,65),35));
        shapes.add(new Circle(new Point(465,30),20));
    }

    private static void display(ArrayList<Shape> shapes) {
        for(Shape shape: shapes){
            System.out.println(shape);
        }
    }
}
