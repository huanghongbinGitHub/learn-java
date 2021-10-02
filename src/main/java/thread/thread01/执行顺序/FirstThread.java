package thread01.执行顺序;

public class FirstThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(3000);
                System.out.println("First Thread" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }




}
