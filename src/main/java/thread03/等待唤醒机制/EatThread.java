package thread03.等待唤醒机制;

/**
 * 此类为吃货类，负责eat Product
 *
 */

public class EatThread extends Thread {

    public ProductRoom productRoom;

    public EatThread(ProductRoom productRoom){
        this.productRoom = productRoom;
    }

    @Override
    public void run() {
        super.run();
        //执行吃的程序
        eat();
    }

    public  void eat()  {

        while (true){
            synchronized(productRoom){
                System.out.println("吃货同步代码块");
                //判断，如果product小于1，则进入等待
                if (productRoom.productNumber < 1){
                    System.out.println("没有产品，等待生产");
                    try {
                        productRoom.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                productRoom.productNumber --;

                productRoom.notify();
                System.out.println("产品不小于1，吃掉一个产品");
                System.out.println("------------- 一个过程结束 ---------------_");
            }
        }

    }
}
