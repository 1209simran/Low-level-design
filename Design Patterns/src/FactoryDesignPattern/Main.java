package FactoryDesignPattern;

//Encapsulates object creation logic in a separate method/class.
// Use Case: Object creation when object instantiation logic is complex.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        if(shape!=null){
            shape.draw();
        }
    }
}