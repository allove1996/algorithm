package otherStudy;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentTest {

    public static int account = 0;

    public static AtomicInteger atomicInteger = null;

    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        for (int j = 0; j < 10; j++) {
            atomicInteger = new AtomicInteger(account);

            for (int i = 0; i < 10000; i++) {
                executor.submit(() -> add());
            }

            Thread.sleep(2 * 1000);
            account = atomicInteger.intValue();
            System.out.println(account);

            account = 0;
        }

    }


    public static void add() {
        for (;;) {
            if (atomicInteger.compareAndSet(atomicInteger.get(), atomicInteger.get() + 1)) {
                break;
            }
        }
    }



}
