import com.company.Circle;
import com.company.Point;
import com.company.Rectangle;
import com.company.Shape;
import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Collections;

public class ShapeCreator extends PApplet{
    public void settings() {
        size(500,500);
    }

    public void setup() {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        add(shapes);
        display(shapes);
        System.out.println(String.format("The total number of shapes created are: %d", Shape.getNumShapes()));
        Collections.sort(shapes);
        display(shapes);
    }

    public void draw() {
        fill(182,250,220);
        ellipse(width/2,height/2,100,100);
        fill(254,127,156);
        ellipse(width/2,200,95,95);
        fill(210,180,140);
        triangle(200,275,300,275,250,400);
    }

    private static void add(ArrayList<Shape> shapes) {
        shapes.add(new Circle(new Point(200.0, 200.0), 50.0));
        shapes.add(new Rectangle(new Point(0.0, 0.0), 20.0, 20.0));
        shapes.add(new Circle(new Point(300.0, 300.0), 100.0));
        shapes.add(new Rectangle(new Point(30, 95.0), 15.0, 7.0));
        shapes.add(new Rectangle(new Point(50.0, 50.0), 10.0, 40.0));
        shapes.add(new Circle(new Point(45.0, 75.0), 5.0));
    }

    private static void display(ArrayList<Shape> shapes) {
        for(Shape shape: shapes){
            System.out.println(shape);
        }
    }
}
