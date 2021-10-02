package thread02.锁.第三种;

public class RunableFunction implements Runnable {

    private static int ticket = 100;

    public void run() {
        while (true){
            payTicket();
        }
    }

    //同步静态方法

    /**
     * 静态方法的锁对象是本类对象，即class对象
     */
    public static synchronized void payTicket(){
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
