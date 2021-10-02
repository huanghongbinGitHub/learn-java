package thread03.等待唤醒机制;

public class FactoryThread extends Thread {

    public ProductRoom productRoom;

    public FactoryThread(ProductRoom productRoom){
        this.productRoom = productRoom;
    }

    @Override
    public void run() {
        super.run();

        while (true){
            synchronized (productRoom){
                System.out.println("厂的同步代码块");
                //判断，如果产品大于0，进入等待状态
                if (productRoom.productNumber > 0){
                    System.out.println("有产品，厂子 线程等待，暂时不用生产");
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

                productRoom.productNumber ++;

                productRoom.notify();
                System.out.println("生产产品");

            }
        }
    }
}
