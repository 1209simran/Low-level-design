package FactoryDesignPattern;

public class ShapeFactory {

    public Shape getShape(String type){
        Shape shape = null;
        if(type.equalsIgnoreCase("circle")){
            shape = new Circle();
        }else if(type.equalsIgnoreCase("rectangle")){
            shape = new Rectangle();
        }else{
            System.out.println("No Shape found for type: "+ type);
        }
        return shape;
    }
}
