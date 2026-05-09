package java21;

public class RunnableEx {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello, World!");
        Thread t = new Thread(r);
        t.start();
        t.stop();
    }
}
