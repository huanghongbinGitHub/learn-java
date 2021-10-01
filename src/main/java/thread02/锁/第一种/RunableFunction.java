package thread02.锁.第一种;

public class RunableFunction implements Runnable {

    private int ticket = 100;

    private Object object = new Object();

    public void run() {
        while (true){

            //同步代码块
            synchronized (object){
                if (ticket > 0){
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第 " + ticket);
                    ticket--;
                }
            }

        }
    }
}
