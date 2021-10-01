package thread00.两种创建方法;

public class ThreadDemo {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.run();


        //这里用了桥接模式，将线程run的方法放在外部类中实现。
        SecondRunnable secondThread = new SecondRunnable();
        Thread thread = new Thread(secondThread);
        thread.start();

    }
}
