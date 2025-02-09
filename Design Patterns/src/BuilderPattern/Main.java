package BuilderPattern;

//Used to construct complex objects step by step.
// Use Case: Creating immutable objects with optional parameters.
public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder().setSeats(5).setType("SUV").build();
    }
}