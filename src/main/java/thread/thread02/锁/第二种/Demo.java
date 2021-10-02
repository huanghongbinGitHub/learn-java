package thread02.锁.第二种;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        RunableFunction runableFunction = new RunableFunction();


        Thread thread = new Thread(runableFunction);
        Thread thread1 = new Thread(runableFunction);
        Thread.sleep(10);
        thread1.start();
        thread.start();


    }
}
