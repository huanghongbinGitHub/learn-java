package thread02.锁.第一种;

public class Demo {
    public static void main(String[] args) {
        RunableFunction runableFunction = new RunableFunction();


        Thread thread = new Thread(runableFunction);
        Thread thread1 = new Thread(runableFunction);
        thread.start();
        thread1.start();

    }
}
