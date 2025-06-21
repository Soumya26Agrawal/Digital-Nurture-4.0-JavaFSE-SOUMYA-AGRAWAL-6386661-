
// This is an example of Double-Checked Lock Singleton Pattern.
public class DCLLogger {
    private static volatile DCLLogger logInstance;

    private DCLLogger() {};

    public static DCLLogger getInstance(){

        if(logInstance==null) {
            synchronized (DCLLogger.class) {
                if (logInstance == null) {
                    logInstance = new DCLLogger();
                }

            }

        }
        return logInstance;
        }

    }

