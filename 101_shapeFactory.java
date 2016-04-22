/**
 * Your object will be instantiated and called as such:
 * ShapeFactory sf = new ShapeFactory();
 * Shape shape = sf.getShape(shapeType);
 * shape.draw();
 */
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    // Write your code here
    void draw(){
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ----");
    }
}

class Square implements Shape {
    // Write your code here
    void draw(){
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }
}

class Triangle implements Shape {
    // Write your code here
    void draw(){
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println(" ---- ");
    }
}

public class ShapeFactory {
    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public Shape getShape(String shapeType) {
        // Write your code here
        Shape shape = null;
       if(shapeType==null)
            return shape;
        if(shapeType.equals("Rectangle")){
            shape = new Rectangle();
        }else if(shapeType.equals("Square")){
            shape = new Square();
        }else if(shapeType.equals("Triangle")){
            shape = new Triangle();
        }
        return shape;
    }
}