public class Main {
    public static void main(String[] args) {
    Thread thread = Thread.currentThread();
    thread.run();
    System.out.print(Thread.activeCount());
    }
    }