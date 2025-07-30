package Thered;

class Gymg implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("GYM Start");
            System.out.println("Break");
            try {
                Thread.sleep(10000); // Introduce a 10-second delay to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Eatg implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Eat Start");
            System.out.println("Sleep");
            try {
                Thread.sleep(1000); // Introduce a 1-second delay to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class T_2_TheredInterface {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Gymg gymTask = new Gymg();
        Eatg eatTask = new Eatg();

        Thread gymThread = new Thread(gymTask);
        Thread eatThread = new Thread(eatTask);

        gymThread.start();
        eatThread.start();

        System.out.println("Thread Id GYM: " + gymThread.getId());
        System.out.println("Thread Id Eat: " + eatThread.getId());

        System.out.println("Thread name GYM: " + gymThread.getName());
        System.out.println("Thread name Eat: " + eatThread.getName());

        System.out.println("Thread MAX_PRIORITY: " + Thread.MAX_PRIORITY);
    }
}
