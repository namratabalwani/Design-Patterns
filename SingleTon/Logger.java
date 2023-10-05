import java.util.concurrent.locks.ReentrantLock;
class Logger {
    static int ctr = 0;
    static Logger loggerInstance = null;
    private static final ReentrantLock myLock = new ReentrantLock();
    public Logger() {
        ctr++;
        System.out.println("New instance is created " + ctr);
    }

    public void Log(String msg) {
        System.out.println(msg);
    }

    public static Logger getLogger(){
        if (loggerInstance == null) {
            myLock.lock();
            try {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            } finally {
                myLock.unlock();
            }      
        }        
        return loggerInstance;
    }
}