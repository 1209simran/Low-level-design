package ObserverPattern;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " received: " + message);
    }
}
