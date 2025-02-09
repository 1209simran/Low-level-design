package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Observer> observerList = new ArrayList<>();

    public void addSubscribers(Observer observer){
        observerList.add(observer);
    }
    public void notifySubscribers(String message){
        for(Observer observer: observerList)
            observer.sendMessage(message);
    }
}
