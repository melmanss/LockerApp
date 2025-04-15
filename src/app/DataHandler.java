package app;


public class DataHandler {

    private final Locker lock = new

    public synchronized int modify(int num) {
        lock.();
        try {
            num = num * 3;
            return num;
        } finally {
            lock.unlock();
        }
    }
}
