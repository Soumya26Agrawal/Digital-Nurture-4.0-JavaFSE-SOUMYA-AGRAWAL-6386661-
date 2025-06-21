

// This is an example of Synchronized Singleton Pattern.
public class SynchronisedLogger {

    private static SynchronisedLogger logInstance;

    private SynchronisedLogger() {};

    public static synchronized SynchronisedLogger getInstance(){
        if(logInstance==null){
            logInstance=new SynchronisedLogger();
        }
        return logInstance;
    }
}
