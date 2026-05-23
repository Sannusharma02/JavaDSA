package myCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {

        Map<Integer,String> map = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for(int i=0;i<1000;i++) {
                map.put(i, Thread.currentThread().getName ());
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Map Size: " + map.size());
    }
}
