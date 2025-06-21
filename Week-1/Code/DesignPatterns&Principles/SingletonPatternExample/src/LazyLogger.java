
// This is an example of Lazy Singleton Pattern.
public class LazyLogger {
    private static LazyLogger logInstance;

    private LazyLogger() {};

    public static LazyLogger getInstance(){
        if(logInstance==null){
            logInstance=new LazyLogger();
        }
        return logInstance;
    }
}
