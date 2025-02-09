package SingletonPattern;

//Ensures that only one instance of a class exists and provides a global access point to it.
// Use Case: Database connection, configuration settings.
public class Main {
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstanceThreadSafe();
    }
}