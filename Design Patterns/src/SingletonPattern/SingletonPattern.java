package SingletonPattern;

public class SingletonPattern {
    private static SingletonPattern instance;

    public static SingletonPattern getInstance(){
        if(instance==null){
            instance = new SingletonPattern();
        }
        return instance;
    }
    // thread safe
    public static SingletonPattern getInstanceThreadSafe(){
        if(instance==null)
        {
            synchronized (SingletonPattern.class){
                if(instance==null)
                    instance=new SingletonPattern();
            }
        }
        return instance;
    }
}
