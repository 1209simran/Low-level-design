import RateLimiterAlgo.RateLimiter;

public class RateLimitManager {

    private static RateLimitManager instance;
    private RateLimiter rateLimiter;

    public RateLimitManager (){
        this.rateLimiter = RateLimiterFactory.createRateLimiter("fixed",10,6000);
    }

    public static RateLimitManager getInstance(){
        if(instance==null)
        {
            synchronized (RateLimitManager.class){
                if(instance==null){
                    instance = new RateLimitManager();
                }
            }
        }
        return instance;
    }

    public boolean allowRequests(String clientId){
        return rateLimiter.allowRequest(clientId);
    }
}
