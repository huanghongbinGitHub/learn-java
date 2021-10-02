package thread03.等待唤醒机制;

public class Demo {

    public static void main(String[] args) {
        ProductRoom productRoom = new ProductRoom();
        productRoom.productNumber = 0;

        EatThread eatThread = new EatThread(productRoom);
        FactoryThread factoryThread = new FactoryThread(productRoom);
        eatThread.start();
        factoryThread.start();
    }
}
