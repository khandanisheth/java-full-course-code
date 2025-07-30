package Thered;

class Counter {
    private int counter = 0;

    // Increment method (Not synchronized)
    public void increment() {
        counter++; // This is not thread-safe!
    }

    public int getcon() {
        return counter;
    }
}

class Test extends Thread {
    private Counter counter;

    public Test(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Multiple threads accessing this!
        }
    }
}

public class T_4_WhyUseSyncnThread {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Test t1 = new Test(counter);
        Test t2 = new Test(counter);

        t1.start(); // Thread 1 starts
        t2.start(); // Thread 2 starts

        try {
            t1.join(); // Wait for Thread 1 to finish
            t2.join(); // Wait for Thread 2 to finish
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Final counter value: " + counter.getcon());
    }
}
/*
 * Aapka code multi-threading use kar raha hai, lekin synchronization nahi hai,
 * is wajah se race condition ho sakti hai aur output expected value (2000) se
 * kam bhi ho sakta hai. Ab hum bina synchronization ka code likhenge, par
 * comment me samjhayenge ki kaise threads execute ho rahe hain
 */