package RateLimiterAlgo;

import java.util.HashMap;
import java.util.Map;

public class FixedWindowRateLimiter implements RateLimiter {

    private int maxRequests;
    private long windowSizeInMillis;
    Map<String, Long> startingWindows;
    Map<String, Integer> requestsByClient;

    public FixedWindowRateLimiter(int maxRequests, long windowSizeInMillis) {
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeInMillis;
        this.startingWindows = new HashMap<>();
        this.requestsByClient = new HashMap<>();
    }

    @Override
    public boolean allowRequest(String clientId) {
        long currentTime = System.currentTimeMillis();
        startingWindows.putIfAbsent(clientId, currentTime);
        requestsByClient.putIfAbsent(clientId,1);
        long startTime = startingWindows.get(clientId);
        if(currentTime-startTime>=windowSizeInMillis){
            startingWindows.put(clientId, currentTime);
            requestsByClient.put(clientId,1);
        }
        int noOfRequest = requestsByClient.get(clientId);
        if(noOfRequest<=maxRequests){
            requestsByClient.put(clientId, noOfRequest+1);
            return true;
        }
        return false;
    }
}
