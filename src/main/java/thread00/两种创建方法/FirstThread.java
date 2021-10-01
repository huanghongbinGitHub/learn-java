package thread00.两种创建方法;

public class FirstThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("First Thread线程执行");
    }
}
