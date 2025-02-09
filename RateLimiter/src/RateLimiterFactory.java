import RateLimiterAlgo.FixedWindowRateLimiter;
import RateLimiterAlgo.RateLimiter;
import RateLimiterAlgo.SlidingWindowRateLimiter;

public class RateLimiterFactory {
     public static RateLimiter createRateLimiter(String type, int maxReq, long windowSizeInMillis){
         if(type.equalsIgnoreCase("fixed"))
             return new FixedWindowRateLimiter(maxReq, windowSizeInMillis);
         else if(type.equalsIgnoreCase("sliding"))
             return new SlidingWindowRateLimiter(maxReq, windowSizeInMillis);
         else
         {
             System.out.println("No algo found");
             return null;
         }
     }
}
