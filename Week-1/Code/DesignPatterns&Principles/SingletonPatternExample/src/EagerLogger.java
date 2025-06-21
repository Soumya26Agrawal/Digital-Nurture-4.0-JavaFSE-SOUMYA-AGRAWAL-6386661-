
// This is an example of Eager Singleton Pattern.
public class EagerLogger {
    private static EagerLogger logInstance= new EagerLogger();
    private EagerLogger(){}
    public static EagerLogger getInstance(){
        return logInstance;
    }
}
