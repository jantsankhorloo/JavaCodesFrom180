public class Driver extends Thread implements Runnable {
    public static void main(String[] args) {
        Thread t = new A();
        t.start();
        
        Runnable r = new B();
        Thread a = new Thread(r);
        a.start();
    }
}