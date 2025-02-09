package RateLimiterAlgo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SlidingWindowRateLimiter implements RateLimiter {

    private int maxRequests;
    private long windowSizeInMillis;
    Map<String, Queue<Long>> startingWindow;

    public SlidingWindowRateLimiter(int maxRequests, long windowSizeInMillis) {
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeInMillis;
        this.startingWindow = new HashMap<>();
    }

    @Override
    public boolean allowRequest(String clientId) {
        long currentTime = System.currentTimeMillis();
        startingWindow.putIfAbsent(clientId, new LinkedList<>());
        Queue<Long> queue = startingWindow.get(clientId);
        while(!queue.isEmpty() && currentTime-queue.peek()>=windowSizeInMillis){
            queue.poll();
        }
        if(queue.size()<maxRequests){
            queue.add(currentTime);
            return true;
        }
        return false;
    }
}
