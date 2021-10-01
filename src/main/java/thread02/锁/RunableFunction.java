package thread02.锁;

public class RunableFunction implements Runnable {

    private int ticket = 100;

    public void run() {
        while (true){
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
