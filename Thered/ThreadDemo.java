package Thered;

public class ThreadDemo extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    @SuppressWarnings({ "deprecation", "removal" })
    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();

        // getName()
        System.out.println("Thread Name: " + thread.getName());

        // getId()
        System.out.println("Thread ID: " + thread.getId());

        // isAlive()
        System.out.println("Is thread alive? " + thread.isAlive());

        // isDaemon()
        System.out.println("Is thread a daemon thread? " + thread.isDaemon());

        // setDaemon()
        thread.setDaemon(true);
        System.out.println("Is thread a daemon thread now? " + thread.isDaemon());

        // getPriority()
        System.out.println("Thread Priority: " + thread.getPriority());

        // setPriority()
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Updated Thread Priority: " + thread.getPriority());

        // start()
        thread.start();

        try {
            // sleep()
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // interrupt()
        thread.interrupt();

        // join()
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // dumpStack()
        Thread.dumpStack();

        // currentThread()
        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread: " + currentThread.getName());

        // activeCount()
        System.out.println("Active Threads Count: " + Thread.activeCount());

        // yield()
        Thread.yield();

        // checkAccess()
        thread.checkAccess();

        // getStackTrace()
        StackTraceElement[] stackTrace = thread.getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println("Stack Trace Element: " + element.toString());
        }

        // Other methods can also be demonstrated similarly as needed.
    }
}
