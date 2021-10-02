package thread01.执行顺序;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("hello word");

        startRun();

        FirstThread firstThread = new FirstThread();
        firstThread.start();
    }

    public static void startRun(){
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(3000);
                System.out.println("Main Thread" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
