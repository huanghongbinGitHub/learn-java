package thread02.锁.第四种;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunableFunction implements Runnable {

    private int ticket = 100;

    private Lock lock = new ReentrantLock();

    //同步方法
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第 " + ticket);
                ticket--;
            }
            lock.unlock();
        }
    }
}
