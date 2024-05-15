package creational.singleton.code;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printStatus() {
        if (instance == null) {
            System.out.println("No live nodes detected");
        } else {
            System.out.println("live nodes detected");
        }
    }
}
