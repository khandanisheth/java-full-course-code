package Thered;

class Counterr {
    private int counterr = 0;

    // public synchronized void increment() { // Synchronized method
    // counterr++;
    // }

    public void increment() { // Synchronized method
        synchronized (this) {
            counterr++;
        }
    }

    public int getcon() {
        return counterr;
    }
}

class Testt extends Thread {
    private Counterr counterr;

    public Testt(Counterr counterr) {
        this.counterr = counterr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counterr.increment();
        }
    }
}

public class T_5_ThisUseSyncnThread {
    public static void main(String[] args) {
        Counterr counterr = new Counterr();
        Testt t1 = new Testt(counterr);
        Testt t2 = new Testt(counterr);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Final counter value: " + counterr.getcon());
    }
}
