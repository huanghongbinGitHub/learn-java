package thread04.lambda写法;

public class Demo {
    public static void main(String[] args) {
        func();

        func1();
    }

    //原来的匿名内部类写法
    public static void func() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("原来的写法");
            }
        });
        thread.start();
    }
    
    //演化的写法
    public static void func1() {
        Thread thread = new Thread(() -> {
            System.out.println("新的简化写法");
        });
    }
}
