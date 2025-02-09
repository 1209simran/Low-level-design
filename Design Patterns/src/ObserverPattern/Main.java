package ObserverPattern;

// Defines a dependency between objects so that when one object changes state, all its dependents are notified.
// Use Case: Event handling, real-time notifications.
public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Observer subscriber1 = new Subscriber("Subscriber1");
        Observer subscriber2 = new Subscriber("Subscriber2");
        channel.addSubscribers(subscriber1);
        channel.addSubscribers(subscriber2);
        channel.notifySubscribers("Hi, there");
    }
}