//Factory Design Pattern
public interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    public void area() {
        System.out.println(3.14 * 2 * 2);
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}

class ShapeTest {

    public Shape getShape(String shapeName) {
        switch (shapeName) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                return new Square();
        }
    }

    public static void main(String[] args) {
        ShapeTest t = new ShapeTest();
        Shape s = t.getShape("circle");
        s.draw();

        if (s instanceof Circle) {
            Circle c = (Circle) s;
            c.area();
        }
    }
}