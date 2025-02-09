package RateLimiterAlgo;

public interface RateLimiter {
    boolean allowRequest(String clientId);
}
